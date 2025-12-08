package A5_AplicacaoRegex;
import java.util.Scanner;

public class ValidaCpf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String cpf = sc.nextLine();

        String regex = "^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$"; //"^([0-9]{3}).([0-9]{3}).([0-9]{3})-([0-9]{2})$";

        if (cpf.matches(regex)) {
            System.out.println("CPF válido");
        } else {
            System.out.println("CPF inválido");
        }
    }
}
