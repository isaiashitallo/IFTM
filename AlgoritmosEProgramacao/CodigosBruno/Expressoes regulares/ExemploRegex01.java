import java.util.Scanner;

public class ExemploRegex01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine().toUpperCase();
        //Verificar a ocorrência de uma certa frase uma certa quantidade de vezes.
        if (entrada.matches("(.*IFTM.*){2,5}"))
            System.out.println("Válido");
        else
            System.out.println("Inválido");
            
        s.close();
    }
}
