package br.edu.sistemasdistribuidos.barbeirodorminhoco.monitores;

import java.util.LinkedList;
import java.util.Queue;



public class BarbeiroDorminhocoMonitores {

    private static final int cadeiras = 3;
    // private static int clientesEsperando = 0;
    // private static boolean barbeiroOcupado = false;

    //fila
    private static final java.util.Queue<Integer> fila = new java.util.LinkedList<>();



    private static synchronized void chegar(int id) throws InterruptedException {

        // if (clientesEsperando >= cadeiras) {
        if (fila.size() >= cadeiras) {
            System.out.println("Cliente " + id +" foi embora. " +"Não há cadeiras disponíveis.");

            return;
        }

        // clientesEsperando++;
        fila.add(id); //cliente entra

        // System.out.println("Cliente " + id +" entrou na fila. " + "Esperando: " + clientesEsperando);
        System.out.println("Cliente " + id +" entrou na fila. " + "Esperando: " + fila.size());

        // BarbeiroDorminhocoMonitores.class.notifyAll();
        BarbeiroDorminhocoMonitores.class.notifyAll();//notifica

        while (fila.contains(id)) {
            BarbeiroDorminhocoMonitores.class.wait();
        }

        System.out.println("Cliente " + id +" está sendo atendido.");    
    }



    
    private static void trabalhar() throws InterruptedException {
        while (true) {
            int cliente;
            synchronized (BarbeiroDorminhocoMonitores.class) {
                while (fila.isEmpty()) {//barbeiro dorme
                    System.out.println("Barbeiro está dormindo...");

                    BarbeiroDorminhocoMonitores.class.wait();
                }

                cliente = fila.poll();

                System.out.println("Barbeiro chamou o cliente " + cliente
                );

                BarbeiroDorminhocoMonitores.class.notifyAll();//acordaa
            }

            System.out.println("Barbeiro está cortando o cabelo do cliente "+ cliente);

            Thread.sleep(2000);//2s

            System.out.println("Barbeiro terminou o cliente "+cliente);

            synchronized (BarbeiroDorminhocoMonitores.class) {
                BarbeiroDorminhocoMonitores.class.notifyAll();
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