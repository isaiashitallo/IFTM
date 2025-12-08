import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        conjunto(N, M);

        

    }

    public static void conjunto(int N, int M) {
        if (M <= 0 || N <= 0) { //parar quando vlr de M for zero || null
            return;
        } 

        int maior;
        int menor;
        int soma;

        if (N > M) { //maior elemento
            maior = N;
            menor = M;
        } else {
            maior = M;
            menor = N;
        }

        for (int i = menor; i <= maior; i++) {
            System.out.print(i + " ");
            soma += i;
        }

        // imprime soma
        System.out.println("Sum=" + soma);
    }
    
}


//SOLUCAO GPT

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            // Condição de parada: qualquer valor <= 0
            if (N <= 0 || M <= 0) {
                break;
            }

            conjunto(N, M);
        }

        sc.close();
    }

    public static void conjunto(int N, int M) {
        int maior, menor, soma = 0;

        if (N > M) {
            maior = N;
            menor = M;
        } else {
            maior = M;
            menor = N;
        }

        // imprime a sequência na mesma linha
        for (int i = menor; i <= maior; i++) {
            System.out.print(i + " ");
            soma += i;
        }

        // imprime soma
        System.out.println("Sum=" + soma);
    }
}
