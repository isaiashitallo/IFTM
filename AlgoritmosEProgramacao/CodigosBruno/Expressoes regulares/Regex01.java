import java.util.Scanner;

public class Regex01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        //busca exata
        System.out.println(entrada.matches("iftm"));
        //padrão com 4 caracteres
        System.out.println(entrada.matches("...."));
        //padrão com números
        System.out.println(entrada.matches("\\w\\w\\w\\w\\s\\d\\d\\d\\d"));
        s.close();
    }
}

