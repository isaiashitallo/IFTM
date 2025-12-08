import java.util.Scanner;

public class Regex04CaracteresEspeciais {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        //Verificar se o texto começa com um certo caractere
        if (entrada.matches("^IFTM.*"))
            System.out.println("Válido");
        else
            System.out.println("Inválido");
        //Verificar se o texto termina com um certo valor
        if (entrada.matches(".*2025$"))
            System.out.println("Válido");
        else
            System.out.println("Inválido");
        //aplicar o operador lógico ou |
        if (entrada.matches(".*2025.*|.*2024.*"))
            System.out.println("Válido");
        else
            System.out.println("Inválido");  
            
        //usando parenteses
        if (entrada.matches("(\\d{5}-\\d{3})|(\\d{8})"))
            System.out.println("Válido");
        else
            System.out.println("Inválido");  
            
        s.close();
    }
}

