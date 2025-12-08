// Zero vale Zero
// Remover o Zero de todas operações matemáticas.

package A4_ManipulaçãoDeCadeiasDeCaracteres_StringBuilder;
import java.util.Scanner; //java.util.scanner para inputar dados

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) { //vai pedir entradas enquanto não atingir regra de qebra
            int M = sc.nextInt();
            int N = sc.nextInt();

            // Condição de parada
            if (M == 0 && N == 0) {
                break;
            }

            // Remove zeros dos números de entrada
            int mSemZero = Integer.parseInt(removeZeros(String.valueOf(M)));
            int nSemZero = Integer.parseInt(removeZeros(String.valueOf(N)));

            // Soma os números sem zeros
            int soma = mSemZero + nSemZero;

            // Remove zeros do resultado e exibe
            String resultadoFinal = removeZeros(String.valueOf(soma));
            System.out.println(resultadoFinal);
        }

        sc.close();
    }

    // Função que remove todos os zeros de uma string usando StringBuilder
    public static String removeZeros(String numero) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numero.length(); i++) {
            char c = numero.charAt(i);
            if (c != '0') {
                sb.append(c);
            }
        }

        // Se todos os caracteres forem zeros, retorna "0" para evitar erro de parse
        if (sb.length() == 0) {
            return "0";
        }

        return sb.toString();
    }
}
