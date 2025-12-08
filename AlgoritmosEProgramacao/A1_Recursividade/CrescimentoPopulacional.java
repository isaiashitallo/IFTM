package A1_Recursividade;
import java.util.Scanner;

public class CrescimentoPopulacional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int PA = sc.nextInt();
            int PB = sc.nextInt();
            // leia as taxas como percentuais (ex.: 5.5 -> 5.5), depois converta
            double G1 = sc.nextDouble() / 100.0;
            double G2 = sc.nextDouble() / 100.0;

            int anos = calcularRecursivo(PA, PB, G1, G2, 0);

            if (anos == -1) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(anos + " anos.");
            }
        }
        sc.close();
    }

    // Retorna -1 se for "Mais de 1 seculo.", ou anos (0..100) caso contrário
    public static int calcularRecursivo(int pa, int pb, double g1, double g2, int anos) {

        // Caso base inicial: se já passou (pouco provável no input, mas seguro)
        if (pa > pb) {
            return anos;
        }

        // Aplica o crescimento de um ano
        pa = pa + (int) (pa * g1);
        pb = pb + (int) (pb * g2);

        // Um ano se passou
        anos++;

        // Se passou de 100 anos -> corte imediato (resposta "Mais de 1 seculo.")
        if (anos > 100) {
            return -1;
        }

        // Agora sim: se A já ultrapassou B dentro do limite de 100 anos, retorna anos
        if (pa > pb) {
            return anos;
        }

        // Continua recursivamente
        return calcularRecursivo(pa, pb, g1, g2, anos);
    }
}
