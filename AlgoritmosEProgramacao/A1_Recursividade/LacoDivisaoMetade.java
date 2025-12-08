import java.util.Scanner;

public class LacoDivisaoMetade {

    public static int dias(double comida) {
        // Caso base: já restou 1 kg ou menos
        if (comida <= 1.0) {
            return 0;
        }
        // Recursão: come metade e soma 1 dia
        return 1 + dias(comida / 2.0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double c = sc.nextDouble();
            System.out.println(dias(c) + " dias");
        }

        sc.close();
    }
}