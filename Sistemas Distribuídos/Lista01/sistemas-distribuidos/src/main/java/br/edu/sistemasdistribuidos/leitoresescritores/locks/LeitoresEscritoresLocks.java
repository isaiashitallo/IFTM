package br.edu.sistemasdistribuidos.leitoresescritores.locks;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;//bloqueio explicito, diferente do synchronized

public class LeitoresEscritoresLocks {

    private static int dados = 0;
    private static int quantidadeLeitores = 0;
    private static boolean escritorAtivo = false;
    
    private static final ReentrantLock lock = new ReentrantLock();//condition equivalente ao wait
    private static final Condition condicao = lock.newCondition();

    private static void iniciarLeitura(String nome) throws InterruptedException {
        lock.lock();
        try {
            while (escritorAtivo) {
                condicao.await(); //esc ativo
            }

            quantidadeLeitores++; //entra como leitor

            System.out.println(
                    nome + " iniciou a leitura. Leitores ativos: "
                            + quantidadeLeitores
            );

        } finally {
            lock.unlock();
        }
    }

    private static void finalizarLeitura(String nome) {
        lock.lock();

        try {
            quantidadeLeitores--;//qnd ultimo leitor sair
            System.out.println(
                    nome + " terminou a leitura. Leitores ativos: "
                            + quantidadeLeitores
            );
            if (quantidadeLeitores == 0) {
                condicao.signalAll();// acorda therads
            }
        } finally {
            lock.unlock();
        }
    }

    private static void iniciarEscrita(String nome) throws InterruptedException {
        lock.lock();
        try {
            while (escritorAtivo || quantidadeLeitores > 0) {
                condicao.await();
            }
            escritorAtivo = true;//escrita qnd não ha leitores ou escritores
            System.out.println(nome + " iniciou a escrita.");
        } finally {
            lock.unlock();

        }
    }


    private static void finalizarEscrita(String nome) {

        lock.lock();
        try {
            escritorAtivo = false;
            System.out.println(nome + " terminou a escrita.");
            condicao.signalAll();

        } finally {
            lock.unlock();

        }
    }



        
    private static void ler(String nome) throws InterruptedException {
        iniciarLeitura(nome);
        System.out.println(nome + " está lendo: " + dados);
        Thread.sleep(1000);
        finalizarLeitura(nome);
    }


    private static void escrever(String nome) throws InterruptedException {
        iniciarEscrita(nome);
        dados++;
        System.out.println(nome + " está escrevendo: " + dados);
        Thread.sleep(1000);
        finalizarEscrita(nome);
    }



    public static void main(String[] args) {

        Thread leitor1 = new Thread(() -> {
            try {
                ler("Leitor 1");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread leitor2 = new Thread(() -> {
            try {
                ler("Leitor 2");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread leitor3 = new Thread(() -> {
            try {
                ler("Leitor 3");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

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


    //semaforo: acquire, release
    //monitor: synchronized: wiat, notifyall
    //reentrantLock: lock, unlock, condition:await, signalall

}
