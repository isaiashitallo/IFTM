package br.edu.sistemasdistribuidos.leitoresescritores.semaforos;

import java.util.concurrent.Semaphore;

public class LeitoresEscritoresSemaforos {

    private static int dados = 0; //recurso compartilhado, varias threads acessam ele
    private static int quantidadeLeitores = 0;

    //2
    private static final Semaphore mutex = new Semaphore(1);//protege o contador de leitores
    private static final Semaphore recurso = new Semaphore(1);//controla acesso ao recurso compartilhado


    //leitura
    private static void ler(String nome) throws InterruptedException {

        mutex.acquire();//pega permissao

        quantidadeLeitores++;//increase

        if (quantidadeLeitores == 1) {
            recurso.acquire();//bloqueia recurso
        }

        mutex.release();

        System.out.println(nome + " está lendo: " + dados);

        Thread.sleep(1000);

        mutex.acquire();

        quantidadeLeitores--;//decrease leitores

        if (quantidadeLeitores == 0) {//libera recurso só qnd há 0 leitores
            recurso.release();
        }

        mutex.release();
    }

    //escrita
    private static void escrever(String nome) throws InterruptedException {

        recurso.acquire();//bloqueia recurso

        dados++;//incerase dados

        System.out.println(nome + " está escrevendo: " + dados);
        Thread.sleep(1000);

        recurso.release();//libera recuros
    }
    

    public static void main(String[] args) {

        //leitor 1
        Thread leitor1 = new Thread(() -> {
            try {
                ler("Leitor 1");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        //2
        Thread leitor2 = new Thread(() -> {
            try {
                ler("Leitor 2");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        //varios leitores
        Thread leitor3 = new Thread(() -> {
            try {
                ler("Leitor 3");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        //só um escritor aceessa recurso
        Thread escritor1 = new Thread(() -> {
            try {
                escrever("Escritor 1");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread escritor2 = new Thread(() -> {
            try {
                escrever("Escritor 2");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        leitor1.start();
        leitor2.start();
        leitor3.start();
        escritor1.start();
        escritor2.start();
    }
}// s