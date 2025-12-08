package A6_HashsetEMAP.Ex03_ConversaoHashsettoList;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();

        while (true) {
            int elemento = sc.nextInt();
            if (elemento < 0) {
                break;
            }
            lista.add(elemento);
        }

        Set<Integer> conjunto = new HashSet<>(lista);
        List<Integer> listaNew = new ArrayList<>(conjunto);

        System.out.println(listaNew);
        // for (String elemento : conjunto) {
        //     System.out.println(elemento);
        // }

        sc.close();
    }
    
}
