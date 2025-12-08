import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        quadrado(1, N); // começa do 1 até N

        sc.close();
    }

    public static void quadrado(int i, int N) {
        // Caso base: parar quando passar de N
        if (i > N) {
            return; //return vazio para o programa
        }

        // Se for par, imprime
        if (i % 2 == 0) {
            System.out.println(i + "^2 = " + (i * i));
        }

        // Chamada recursiva para o próximo número
        quadrado(i + 1, N);
    }
}
