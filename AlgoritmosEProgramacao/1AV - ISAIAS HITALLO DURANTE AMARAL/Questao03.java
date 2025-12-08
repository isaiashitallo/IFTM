
import java.util.Scanner;

public class Questao03{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String frase = s.nextLine();
        char letra1 = s.next().charAt(0);
        char letra2 = s.next().charAt(0);

        //contadores
        int cont1 = 0;
        int cont2 = 0;

        for (int i = 0; i < frase.length(); i++) {
            char atual = frase.charAt(i);
            if (atual == letra1) {
                cont1++;
            } else if (atual == letra2) {
                cont2++;
            }
        }

        //lógica
        if (cont1 == cont2) {
            System.err.println("empate");           
        } else if (cont1 > cont2) {
            System.err.println(letra1);            
        } else {
            System.err.println(letra2);
        }

        // Converter para array de caracteres
        // char[] caracteres = frase.toCharArray();
        
        // //System.out.println("\nArray de caracteres:");
        // System.err.println(caracteres);

        // System.out.println();


        s.close();
    }
}