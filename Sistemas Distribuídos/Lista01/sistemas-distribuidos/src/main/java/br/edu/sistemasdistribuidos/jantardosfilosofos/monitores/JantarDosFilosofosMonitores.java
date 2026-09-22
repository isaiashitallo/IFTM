package br.edu.sistemasdistribuidos.jantardosfilosofos.monitores;

public class JantarDosFilosofosMonitores {

    

    private static final int filosofos = 5;//qtd

    private enum Estado {//1 estado p cd filosofo
        pensando,
        tentandoComer,
        comendo
    }

    private static final Estado[] estados = new Estado[filosofos];


    //metodos para garfos
    private static int esquerda(int id) {
        return (id + filosofos - 1) % filosofos;
    }
    private static int direita(int id) {
        return (id + 1) % filosofos;
    }


    private static synchronized void pegarGarfos(int id) throws InterruptedException {

        estados[id] = Estado.tentandoComer;

        while (
            estados[esquerda(id)] == Estado.comendo ||
            estados[direita(id)] == Estado.comendo
        ) {
            JantarDosFilosofosMonitores.class.wait(); //se vizinhos comendo, espera
        }

        estados[id] = Estado.comendo;//se nn, come

        System.out.println("Filósofo " + id + " está comendo.");
    }



    private static synchronized void devolverGarfos(int id) {

        estados[id] = Estado.pensando;//terminou

        System.out.println("Filósofo " + id + " terminou de comer.");
        JantarDosFilosofosMonitores.class.notifyAll();
    }


    private static void filosofar(int id) throws InterruptedException {

        System.out.println("Filósofo " + id + " está pensando.");

        // garfos[esquerdo].acquire();
        // garfos[direito].acquire();
        
        Thread.sleep(1000);
        pegarGarfos(id);
        Thread.sleep(1000);
        devolverGarfos(id);
    }




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