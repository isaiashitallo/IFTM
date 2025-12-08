import java.util.Scanner;

public class Regex03QuantificadoresParte2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        //utilizando o quantificador no mínimo 0 ocorrencias *
        if (entrada.matches("\\d*"))
            System.out.println("Válido");
        else
            System.out.println("Inválido");
        //Verificar se o texto contém o a palavra iftm
        if (entrada.matches(".*iftm.*"))
            System.out.println("Válido");
        else
            System.out.println("Inválido");
        s.close();
    }
}

