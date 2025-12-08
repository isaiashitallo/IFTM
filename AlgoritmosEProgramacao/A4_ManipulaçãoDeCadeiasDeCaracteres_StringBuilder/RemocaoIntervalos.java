package A4_ManipulaçãoDeCadeiasDeCaracteres_StringBuilder;
import java.util.Scanner;

public class RemocaoIntervalos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavra = sc.nextLine();

        int n = sc.nextInt(); //nro de linhas para remover
        
        //Criando um StringBuilder com a palavra digitada, para facilitar operações
        StringBuilder p = new StringBuilder(palavra);
        
        // Criando um laço para entrada dos nros a remover
        for (int i = 0; i < n; i++) {
            int intInf = sc.nextInt();
            int intSup = sc.nextInt();

            // Convertendo para índices baseados em 0
            int inicio = intInf;
            int fim = intSup + 1;

            // Validando entradas
            if (inicio >= 0 && fim <= p.length() && inicio < fim) {
                p.delete(inicio, fim);
            }
            // System.out.println(p.toString());
        }

        System.out.println(p.toString());

        sc.close();
    }
    
}
