package A6_HashsetEMAP.Ex02_ComparandoDoisHashsets;

import java.util.Scanner;
import java.util.HashSet;

public class Main { 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<String> conjuntoA = new HashSet<>();
        HashSet<String> conjuntoB = new HashSet<>();

        HashSet<String> intersecao = new HashSet<>();

        System.out.println("Digite os elementos do Conjunto A (digite um valor negativo para terminar):");
        while (true) {
            String elemento = sc.next();
            if (elemento.contains("-")) {
                break;                
            }
            conjuntoA.add(elemento);
        }

        System.out.println("Digite os elementos do Conjunto B (digite um valor negativo para terminar):");
        while (true) {
            String elemento = sc.next();
            if (elemento.contains("-")) {
                break;                
            }
            conjuntoB.add(elemento);
        }

        for (String elemento : conjuntoA) { // Percorre os elementos do conjunto A
            if (conjuntoB.contains(elemento)) {
                intersecao.add(elemento);
            }
        }

        System.out.println(intersecao);

        sc.close();
    }
}
