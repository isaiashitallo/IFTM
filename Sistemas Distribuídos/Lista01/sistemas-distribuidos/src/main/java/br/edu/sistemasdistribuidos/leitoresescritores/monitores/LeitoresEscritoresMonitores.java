package br.edu.sistemasdistribuidos.leitoresescritores.monitores;

public class LeitoresEscritoresMonitores {

    private static int dados = 0;
    private static int quantidadeLeitores = 0;

    private static boolean escritorAtivo = false;//controla escritor

    //sem mutex e recurso

    private static synchronized void iniciarLeitura(String nome) throws InterruptedException {


    while (escritorAtivo) {
                LeitoresEscritoresMonitores.class.wait();//se escritorAtivo ativo espera
            }

            quantidadeLeitores++;//se nn, increase

            System.out.println(nome + " iniciou a leitura. Leitores ativos: " + quantidadeLeitores);
    }

    private static synchronized void finalizarLeitura(String nome) {

        quantidadeLeitores--;

        System.out.println(nome + " terminou a leitura. Leitores ativos: "  + quantidadeLeitores);

        if (quantidadeLeitores == 0) {
            LeitoresEscritoresMonitores.class.notifyAll();//acorda thread qnd termina
        }
    }

    private static synchronized void iniciarEscrita(String nome) throws InterruptedException {

        while (escritorAtivo || quantidadeLeitores > 0) {
            LeitoresEscritoresMonitores.class.wait();// espera se bloqueado
        }

        escritorAtivo = true;//inicia escrita se livre
        System.out.println(nome + " iniciou a escrita.");
    }

    private static synchronized void finalizarEscrita(String nome) {

        escritorAtivo = false;

        dados++;

        System.out.println(nome + " terminou a escrita. Novo valor: " + dados);
        LeitoresEscritoresMonitores.class.notifyAll();//notifica
    }



    private static void ler(String nome) throws InterruptedException {

        iniciarLeitura(nome);

        System.out.println(nome + " está lendo: " + dados);

        Thread.sleep(1000);
        finalizarLeitura(nome);
    }

    private static void escrever(String nome) throws InterruptedException {
        iniciarEscrita(nome);

        System.out.println(nome + " está escrevendo: " + dados);
        Thread.sleep(1000);
        finalizarEscrita(nome);
    }

    //main
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

}