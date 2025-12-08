
import java.util.Scanner;

public class Questao02{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); //qtd de gerações

        double resultCapacidade = capacidade(n);
        double resultEstabilidade = estabilidade(n);
        double resultSinergia = sinergia(n);

        System.out.println("Geracao " + n);
        System.out.printf("Capacidade %.2f\n", resultCapacidade);
        System.out.printf("Estabilidade %.2f\n", resultEstabilidade);
        System.out.printf("Geracao %.2f\n", resultSinergia);

        s.close();
    }


    public static double capacidade(int n) {
        if (n == 0) return 1;
        if (n == 1) return 2;

        return (1.5 * capacidade(n-1)) - (0.3 * estabilidade(n-1)) + (0.2 * capacidade(n-2));
    }

    public static double estabilidade(int e) {
        if (e == 0) return 2;
        if (e == 1) return 1;

        return (0.8 * estabilidade(e-1)) + (0.4 * capacidade(e-1)) - (0.1 * estabilidade(e-2));
    }

    public static double sinergia(int s) {
        return Math.sqrt(capacidade(s) * estabilidade(s)) * ((capacidade(s) + estabilidade(s)) / 2);
        
    }

}