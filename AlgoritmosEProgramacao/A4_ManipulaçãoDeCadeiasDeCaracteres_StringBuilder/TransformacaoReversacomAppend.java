package A4_ManipulaçãoDeCadeiasDeCaracteres_StringBuilder;
import java.util.Scanner;

public class TransformacaoReversacomAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String original = sc.nextLine();
        int K = sc.nextInt();

        StringBuilder atual = new StringBuilder(original);

        for (int i = 0; i < K; i++) {
            // inverte a string atual
            StringBuilder reversa = new StringBuilder(atual).reverse();

            // nova string: reversa + original
            reversa.append(original);

            // atual passa a ser a string transformada
            atual = reversa;
        }

        System.out.println(atual.toString());
        sc.close();
    }
}