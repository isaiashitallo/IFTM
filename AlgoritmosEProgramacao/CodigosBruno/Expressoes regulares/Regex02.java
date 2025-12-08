import java.util.Scanner;

public class Regex02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        //validar cpf mascara
        if (entrada.matches("\\d\\d\\d[.]\\d\\d\\d[.]\\d\\d\\d[-]\\d\\d"))
            System.out.println("CPF Válido");
        else
            System.out.println("CPF Inválido");
        //validar data mascara
        if (entrada.matches("\\d\\d/\\d\\d/\\d\\d\\d\\d"))
            System.out.println("Data Válida");
        else
            System.out.println("Data Inválida");
        //usando metacaractere
        if (entrada.matches("[0-3]\\d/[0-1]\\d/\\d\\d\\d\\d"))
            System.out.println("Data Válida");
        else
            System.out.println("Data Inválida");
        s.close();
    }
}

