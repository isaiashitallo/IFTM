
import java.util.Scanner;


public class Exemplo03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String t = s.nextLine();
        String m = t.replace('0', 'O');
        System.out.println(t + " - " + m);
        String M1 = (t+m).replace("  ", " ");
        System.out.println(M1);

        s.close();
    }
}
