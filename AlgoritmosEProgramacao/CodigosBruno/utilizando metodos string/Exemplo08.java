
import java.util.Scanner;
/**
 * Exemplo com starsWith, endsWith e toUpperCase
 */

public class Exemplo08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String texto = s.nextLine().toUpperCase();
        String parte = s.nextLine().toUpperCase();
        int indiceParte = texto.indexOf(parte);
        if (indiceParte==-1){
            System.out.println(parte + " não existe em " + texto);
        }else{
            System.out.println(parte + " existe em " + texto + " na posição " + indiceParte);
        }

        s.close();
    }
}
