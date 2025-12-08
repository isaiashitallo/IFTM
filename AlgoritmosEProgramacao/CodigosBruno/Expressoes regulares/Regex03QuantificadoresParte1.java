import java.util.Scanner;

public class Regex03QuantificadoresParte1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        //utilizando o quantificador de tamanho exato {n}
        if (entrada.matches("\\d{4}"))
            System.out.println("Válido");
        else
            System.out.println("Inválido");
                //usando usando quantificadores.
        if (entrada.matches("\\d{2}/\\d{2}/\\d{4}"))
            System.out.println("Data Válida");
        else
            System.out.println("Data Inválida");
        //utilizando o quantificador com limite inferior apenas {n,}
        if (entrada.matches("[0-1]{2,}"))
            System.out.println("Válido");
        else
            System.out.println("Inválido"); 
        //utilizando o quantificador com limites {n,m}
        if (entrada.matches("[0-1]{2,8}"))
            System.out.println("Válido");
        else
            System.out.println("Inválido"); 
        s.close();
    }
}

