package br.edu.sistemasdistribuidos.jantardosfilosofos.locks;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class JantarDosFilosofosLocks {
    

    private static final int filosofos = 5;

    private enum Estado {//mantem estados
        pensando,
        tentandoComer,
        comendo
    }

    private static final Estado[] estados = new Estado[filosofos];

    private static final ReentrantLock lock = new ReentrantLock();

    private static final Condition condicao = lock.newCondition();



    //posição do garfo
    private static int esquerda(int id) {
        return (id + filosofos - 1) % filosofos;
    }
    private static int direita(int id) {
        return (id + 1) % filosofos;
    }


    private static void pegarGarfos(int id) throws InterruptedException {

        lock.lock();//bloqueia
        try {
            estados[id] = Estado.tentandoComer;
            while (//mesma lógica do ant
                estados[esquerda(id)] == Estado.comendo||
                estados[direita(id)] == Estado.comendo
            ) {
                condicao.await();//aguarda
            }
            estados[id] = Estado.comendo;
            System.out.println("Filósofo " + id + " está comendo.");
        } finally {
            lock.unlock();
        }
    }


    private static void devolverGarfos(int id) {
        lock.lock();
        try {
            estados[id] = Estado.pensando;
            System.out.println("Filósofo " + id + " terminou de comer.");

            condicao.signalAll();//notifica
        } finally {
            lock.unlock();
        }
    }


    private static void filosofar(int id)throws InterruptedException {

        System.out.println("Filósofo " + id + " está pensando.");

        Thread.sleep(1000);
        pegarGarfos(id);
        Thread.sleep(1000);
        devolverGarfos(id);
    }

    // await qnd vizinhos comendo, comendo qnd terminam
    // ReentrantLock
    // Condition
    // lock()
    // unlock()
    // await()
    // signalAll()



    public static void main(String[] args) {

        for (int i = 0; i < filosofos; i++) {
            estados[i] = Estado.pensando;
        }

        for (int i = 0; i < filosofos; i++) {
            final int id = i;
            Thread filosofo = new Thread(() -> {
                try {
                    filosofar(id);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
            filosofo.start();
        }
    }
}
