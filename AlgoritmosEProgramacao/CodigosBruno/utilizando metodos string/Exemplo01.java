
import java.util.Scanner;


public class Exemplo01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String t1 = "iftm";
        String t2 = s.nextLine();
        //CASE SENSITIVE
        if (t1.equals(t2)){
            System.out.println("iguais");
        }else{
            System.out.println("diferente");
        }
        //IGNORA CASE SENSITIVE
        if (t1.equalsIgnoreCase(t2)){
            System.out.println("iguais");
        }else{
            System.out.println("diferente");
        }

        s.close();
    }
}
