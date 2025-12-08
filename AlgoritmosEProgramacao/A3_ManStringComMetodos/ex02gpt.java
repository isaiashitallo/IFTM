package A3_ManStringComMetodos;
import java.util.Scanner;


public class ex02gpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // quantidade de casos de teste
        sc.nextLine(); // consome a quebra de linha

        for (int i = 0; i < N; i++) {
            String valor = sc.nextLine().trim();
            int totalLeds = calcularLeds(valor);
            System.out.println(totalLeds + " leds");
        }

        sc.close();
    }

    public static int calcularLeds(String numero) {
        int[] ledsPorDigito = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        int total = 0;

        for (int i = 0; i < numero.length(); i++) {
            char c = numero.charAt(i);
            int digito = c - '0'; // converte o caractere para inteiro
            total += ledsPorDigito[digito];
        }

        return total;
    }
}
