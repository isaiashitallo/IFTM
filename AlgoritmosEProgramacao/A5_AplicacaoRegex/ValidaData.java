package A5_AplicacaoRegex;
import java.util.Scanner;

public class ValidaData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String data = sc.nextLine();

        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/[0-9]{4}$";

        if (data.matches(regex)) {
            System.out.println("Data válida");
        } else {
            System.out.println("Data inválida");
        }
    }
}
