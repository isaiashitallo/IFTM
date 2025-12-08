
import java.util.Scanner;


public class Exemplo02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String t = s.nextLine();
        String t1 = t.substring(3, 6);
        System.out.println("Letras entre 3 e 6 : " + t1);
        String t2 = t.substring(t.length()-3);
        System.out.println("Últimas 3 letras : " + t2);

        s.close();
    }
}
