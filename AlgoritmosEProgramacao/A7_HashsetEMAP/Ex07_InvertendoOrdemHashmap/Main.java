package A6_HashsetEMAP.Ex07_InvertendoOrdemHashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> mapa = new HashMap<>();

        HashMap<Integer, String> mapaInvertido = new HashMap<>();

        while (true) {
            String chave = sc.next();
            // sc.nextLine(); // Consumir a quebra de linha após o número

            if (chave.equals("fim")) {
                break; // NÃO pede valor!
            }

            int valor = sc.nextInt();
            sc.nextLine(); // Consumir o \n deixado pelo nextInt()

            mapa.put(chave, valor);
            mapaInvertido.put(valor, chave);

        }

        System.out.println(mapaInvertido);
    }

}
