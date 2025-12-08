package A6_HashsetEMAP.Ex09_ContFreqDeLetrasNaString;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String texto = sc.nextLine();

        HashMap<Character, Integer> mapa = new HashMap<>(); // Mapa para armazenar a frequência de cada letra

        
        for (int i = 0; i < texto.length(); i++) { //Laço para percorrer cada caractere da string
            char c = texto.charAt(i);

            if (c == ' ') continue; // ignora espaços, continue ignora

            if (mapa.containsKey(c)) { // Se a letra já está no mapa, incrementa sua contagem
                mapa.put(c, mapa.get(c) + 1); 
            } else {
                mapa.put(c, 1);  // Se a letra não está no mapa, adiciona com contagem 1
            }
        }

        System.out.println(mapa);
    }
}
