
import java.util.Scanner;

public class Questao04

//Professor, não consegui fazer essa, tentei de algumas formas, mas tive dificuldade em fazer a soma nos contadores
// minha ideia era dividir a frase por espaço e checar os numeros e assim salvar em um vetor para somar e no final multiplicar

{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String frase = "AbC123 def456!";//s.nextLine();
        String palavraString[] = frase.split(" ");//s.nextLine();

        //contadores
        int cont1 = 0;
        int cont2 = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caract = frase.charAt(i);

            if (Character.isDigit(caract)) {
                cont1 = caract;
                System.err.println(cont1);
            } else if (Character.isWhitespace(caract)) {
                cont2 = caract;
                System.err.println(cont2);
            } else {
                cont1 += 0;
            }
        }

        // for (int i=0; i<palavraString.length; i++) {
        //     char caract = palavraString.char[i];
        //     if (Character.isDigit(caract)) {
        //         System.out.println("["+i+"] : " + palavraString[i]);
        //     }
        // }


        // for (int i = 0; i < frase.length(); i++) {
        //     char atual = frase.charAt(i);
        //     if (atual == letra1) {
        //         cont1++;
        //     } else if (atual == letra2) {
        //         cont2++;
        //     }
        // }

        // //lógica
        // if (cont1 == cont2) {
        //     System.err.println("empate");           
        // } else if (cont1 > cont2) {
        //     System.err.println(letra1);            
        // } else {
        //     System.err.println(letra2);
        // }

        s.close();
    }
}