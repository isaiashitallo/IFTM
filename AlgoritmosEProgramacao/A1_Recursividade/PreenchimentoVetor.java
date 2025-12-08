import java.util.Scanner;

public class PreenchimentoVetor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] N = new int[1000];

        preencher(N, 0, 0, T);
    }

    public static void preencher(int[] N, int i, int j, int T) {
        if (i == 1000) return; // condição de parada

        N[i] = j;
        System.out.println("N[" + i + "] = " + N[i]);

        int proximo = j + 1;
        if (proximo == T) proximo = 0;

        preencher(N, i + 1, proximo, T);
    }
}
