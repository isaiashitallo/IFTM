package A6_HashsetEMAP.Ex06_ContagemHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Mapa onde:
        // chave = número digitado
        // valor = quantidade de vezes que ele apareceu
        HashMap<Integer, Integer> mapa = new HashMap<>();

        System.out.println("Digite números inteiros (negativo para terminar):");

        while (true) {
            int numero = sc.nextInt();

            if (numero < 0) {
                break;
            }

            // Se já existe no mapa > incrementa
            if (mapa.containsKey(numero)) {
                mapa.put(numero, mapa.get(numero) + 1); // Incrementa o valor associado à chave, que é o número de ocorrências
            }
            // Se não existe > adiciona com valor 1
            else {
                mapa.put(numero, 1); // Adiciona o número ao mapa com valor inicial 1
            }
        }


        System.out.println("\nOcorências:");
        for (Map.Entry<Integer, Integer> entrada : mapa.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        } 

        sc.close();
    }
}
