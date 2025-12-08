package A5_AplicacaoRegex;
import java.util.Scanner;

public class ValidaTelefone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String telefone = sc.nextLine();
    
        String regexFixo = "^\\([1-9]{2}\\) [0-9]{4}-[0-9]{4}$";
        String regexCel = "^\\([1-9]{2}\\) 9[0-9]{4}-[0-9]{4}$";

        if (telefone.matches(regexFixo)) {
            System.out.println("Fixo");
        } else if (telefone.matches(regexCel)) {
            System.out.println("Celular");
        } else {
            System.out.println("Inválido");
        }
        sc.close();
    }
}
