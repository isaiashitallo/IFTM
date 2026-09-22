package br.edu.sistemasdistribuidos.barbeirodorminhoco.locks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BarbeiroDorminhocoLocks {

    private static final int cadeiras = 3;

    private static final Queue<Integer> fila = new LinkedList<>();
    private static final ReentrantLock lock = new ReentrantLock();//protege fila
    //permite que clientes e barbeiro esperem condicao
    private static final Condition condicao = lock.newCondition();//permite

    

    private static void chegar(int id) throws InterruptedException {
        lock.lock();

        try {
            if (fila.size() >= cadeiras) {
                System.out.println("Cliente " + id+" foi embora. "+"Não há cadeiras disponíveis."
                );
                return;
            }

            fila.add(id);//add na fila

            System.out.println("Cliente " +id+" entrou na fila. "+"Clientes esperando: "+ fila.size());

            condicao.signalAll();//notifica

            while (fila.contains(id)) {
                condicao.await();
            }

            System.out.println("Cliente " + id + " está sendo atendido.");
        } finally {
            lock.unlock();//desbloqueia
        }
    }


    private static void trabalhar() throws InterruptedException {

        while (true) {
            int cliente;
            lock.lock();

            try {
                while (fila.isEmpty()) {// fila vaiza, barbeiro dorme
                    System.out.println("Barbeiro está dormindo...");
                    condicao.await();//perae
                }

                cliente = fila.poll();

                System.out.println("Barbeiro chamou o cliente " + cliente);
                condicao.signalAll();
            } finally {
                lock.unlock();
            }

            System.out.println("Barbeiro está cortando o cabelo do cliente " + cliente);

            Thread.sleep(2000);

            System.out.println("Barbeiro terminou o cliente " + cliente);

            lock.lock();

            try {
                condicao.signalAll();

            } finally {
                lock.unlock();
            }
        }
    }


    public static void main(String[] args) {
        Thread barbeiro = new Thread(() -> {
            try {
                trabalhar();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        barbeiro.start();


        for (int i = 1; i <= 8; i++) {
            final int id = i;
            Thread cliente = new Thread(() -> {
                try {
                    chegar(id);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
            cliente.start();



            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    





}