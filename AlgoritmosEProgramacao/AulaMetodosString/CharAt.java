package AulaMetodosString;
import java.util.Scanner;

public class CharAt {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            if (i % 2 == 0) {
                c += i;
            } else {
                c -= i;
            }
            System.out.println(c);
        }
        s.close();
    }
}