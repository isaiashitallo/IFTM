import java.util.Scanner; //serve para inputar dados

public class Questao1 {

    static int calls; // contador de chamadas

    public static int fib(int n) {
        calls++; // toda vez que fib é chamado, conta
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // chamando o scanner importado
        int N = sc.nextInt(); // nro de casos de teste

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            calls = -1; //1 chamada ñ conta
            int result = fib(X);
            System.out.printf("fib(%d) = %d calls = %d\n", X, calls, result);
        }

        sc.close();
    }
}
