package A3_ManStringComMetodos;
import java.util.Scanner; //serve para inputar dados

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê a quantidade de linhas
        int N = sc.nextInt();
        sc.nextLine(); // consome a quebra de linha após o número

        for (int i = 0; i < N; i++) {
            String linha = sc.nextLine();
            String resultado = criptografar(linha); //chamando a função
            System.out.println(resultado);
        }

        sc.close();
    }

    public static String criptografar(String texto) {
        // 1ª passada: deslocar letras (a-z e A-Z) 3 posições à direita na tabela ASCII
        StringBuilder primeiraPassada = new StringBuilder(); //
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetter(c)) {
                c += 3;
            }
            primeiraPassada.append(c);
        }

        // 2ª passada: inverter a string
        primeiraPassada.reverse();

        // 3ª passada: deslocar uma posição à esquerda
        // apenas a partir da metade em diante (truncada)
        int metade = primeiraPassada.length() / 2;
        for (int i = metade; i < primeiraPassada.length(); i++) {
            char c = primeiraPassada.charAt(i);
            c -= 1;
            primeiraPassada.setCharAt(i, c);
        }

        return primeiraPassada.toString();
    }
}