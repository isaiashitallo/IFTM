package A3_ManStringComMetodos;
import java.util.Scanner; //serve para inputar dados

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //inputa o N
        sc.nextLine(); //consome a quebra de linha após o número
        
        for (int i = 0; i < N; i++) {
            String valor = sc.nextLine().trim(); //isso é para ler a linha inteira e tirar espaços em branco
            int totalLeds = qtdleds(valor);
            System.out.println(totalLeds + " leds");
        }

        sc.close();
    }

    public static int qtdleds(String numero) {
        int[] leds = {6,2,5,5,4,5,6,3,7,6};
        int total = 0;

        for (int i = 0; i < numero.length(); i++) {
            char c = numero.charAt(i);
            int digit = c - '0'; // Menos string '0' para converter char em int
            total += leds[digit];
        }

        return total;
    }

}
