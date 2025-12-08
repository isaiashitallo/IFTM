package A4_ManipulaçãoDeCadeiasDeCaracteres_StringBuilder;
import java.util.Scanner;

public class ValidaTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); //limpa o buffer

        // declara o StringBuilder
        StringBuilder valida = new StringBuilder();

        // lista vazia
        String[] palavras = sc.nextLine().split(" ");

        for(int i=0; i<n; i++) {
            String p = palavras[i];

            // Verificando se a palavra tem 3 letas
            if (p.length() == 3) {
                // Se começar com OB => OBI
                if (p.startsWith("OB")) {
                    p = "OBI";
                }
                // Se começar com UR => URI
                else if (p.startsWith("UR")) { 
                    p = "URI";
                }
                
            }
            // Acrescentando a palavra na lista
            valida.append(p);

            if (i < n - 1) {
                valida.append(" "); //incluindo zero em valida
            }
            else if (i == n -1) {
                // Printando a lista de saida
                System.out.println(valida.toString());                
            }

            sc.close();
        }

    }
    
}
