
import java.util.Scanner;

public class Questao01{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int result = calcularPopulacao(n);
        System.out.printf("População da geração %d é %d\n", n, result);        

        s.close();
    }

    
    static int calcularPopulacao(int n) {
        if (n==0) return 100;
        if (n==1) return 300;
        return (3 * calcularPopulacao(n - 1)) - (2 * calcularPopulacao(n - 2));
    }

}