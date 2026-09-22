package br.edu.sistemasdistribuidos.barbeirodorminhoco.semaforos;

import java.util.concurrent.Semaphore;

public class BarbeiroDorminhocoSemaforos {

    private static final int cadeiras = 3;
    private static int cadeirasDisponiveis = cadeiras;

    private static final Semaphore clientes = new Semaphore(0);//qtd esperando
    private static final Semaphore barbeiro = new Semaphore(0);
    private static final Semaphore mutex = new Semaphore(1);//protege cadeiras



    private static void trabalhar() throws InterruptedException {
        while (true) {
            clientes.acquire();//atende
            mutex.acquire();//bloqueia
            cadeirasDisponiveis++;//aumenta cadeiras
            barbeiro.release();
            mutex.release();//libera

            System.out.println("Barbeiro está cortando o cabelo.");
            Thread.sleep(2000);
            System.out.println("Barbeiro terminou o corte.");
        }
    }



    private static void chegar(int id) throws InterruptedException {

        mutex.acquire();
        if (cadeirasDisponiveis > 0) {
            cadeirasDisponiveis--;//diminui cadeiras
            System.out.println(
                    "Cliente " + id + " entrou na barbearia. " + "Cadeiras disponíveis: " + cadeirasDisponiveis
            );
            clientes.release();
            mutex.release();
            barbeiro.acquire();

            System.out.println("Cliente " + id +" está sendo atendido.");

        } else {
            System.out.println("Cliente " + id +" foi embora. Não há cadeiras disponíveis.");

            mutex.release();
        }
    }



    public static void main(String[] args) {
        Thread barbeiroThread = new Thread(() -> {
            try {
                trabalhar();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        barbeiroThread.start();



        //criando clientes
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
                Thread.sleep(500); //chega em meio seg e a cadeira demora 2 p liberar
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

}