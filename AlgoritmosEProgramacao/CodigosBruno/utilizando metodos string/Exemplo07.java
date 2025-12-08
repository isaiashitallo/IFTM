
import java.util.Scanner;
/**
 * Exemplo com starsWith, endsWith e toUpperCase
 */

public class Exemplo07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nome = s.nextLine().toUpperCase();
        String titulo = s.nextLine().toUpperCase();
        if (nome.startsWith(titulo)){
            System.out.println(nome + " tem o título " + titulo);
        }else{
            System.out.println("Não apresenta o titulo indicado.");
        }

        if (nome.endsWith("FILHO")){
            System.out.println("O pai de " + nome + " era " + nome.substring(titulo.length()+1, nome.length()-6));
        }

        s.close();
    }
}
