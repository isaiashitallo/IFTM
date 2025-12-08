package A6_HashsetEMAP.Ex04_VerificandoString;

import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<String> hs = new HashSet<>(); // Hashset vazio

        while (true) {
            String conjunto = sc.nextLine(); // Lê a string do usuário
            if (conjunto.equals("fim")) {
                String verificaString = sc.nextLine(); // Lê a string a ser verificada
                if (hs.contains(verificaString)) {
                    System.out.println("Existe");
                } else {
                    System.out.println("Não existe");
                }
                break;
            }

            hs.add(conjunto); // Adiciona a string ao HashSet

            
        }


        sc.close();
    }
    
}
