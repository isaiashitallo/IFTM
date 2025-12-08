
import java.util.ArrayList;
import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Declaração direta
        int v[] = {1,2,3};
        ArrayList<String> lista = new ArrayList<>();
        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("2");
        System.out.println("Imprimir Vetor");
        for (int i=0; i< v.length; i++){
            System.out.println(v[i]);
        }
        lista.remove("2");
        System.out.println("Imprimir ArrayList");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        s.close();
    }
}
