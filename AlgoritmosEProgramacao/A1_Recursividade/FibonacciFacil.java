import java.util.Scanner;

public class FibonacciFacil {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        imprimirFib(0, n);
    }

    // Função recursiva para imprimir a sequência
    public static void imprimirFib(int atual, int limite) {
        if (atual == limite) return; // condição de parada

        System.out.print(fibonacci(atual));

        if (atual < limite - 1)
            System.out.print(" ");

        imprimirFib(atual + 1, limite);
    }

   // Função recursiva para calcular fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
