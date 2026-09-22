package br.edu.sistemasdistribuidos.jantardosfilosofos.semaforos;

import java.util.concurrent.Semaphore;




public class JantarDosFilosofosSemaforos {

    private static final int filosofos = 5;//qtd filosofos
    private static final Semaphore[] garfos = new Semaphore[filosofos];
    private static final Semaphore entrada = new Semaphore(filosofos - 1);



    private static void filosofar(int id) throws InterruptedException {

        int garfoEsquerdo = id;//id = posicao do filosofo
        int garfoDireito = (id + 1) % filosofos;//na mao direita, incrementa 1

        System.out.println("Filósofo " + id + " está pensando.");

        Thread.sleep(1000);

        entrada.acquire();

        garfos[garfoEsquerdo].acquire();
        garfos[garfoDireito].acquire();

        //tem os 2 garfos
        System.out.println("Filósofo " + id + " está comendo.");//printa q está comendo


        Thread.sleep(1000);

        //libera os garfos
        garfos[garfoDireito].release();
        garfos[garfoEsquerdo].release();

        //e a entrada
        entrada.release();

        System.out.println("Filósofo " + id + " terminou de comer.");//retorna que terminou
    }


    public static void main(String[] args) {

        for (int i = 0; i < filosofos; i++) {
            garfos[i] = new Semaphore(1);//itera criando 5 garfos e 5 semafores
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