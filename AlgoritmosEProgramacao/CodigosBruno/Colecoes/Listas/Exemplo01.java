
import java.util.ArrayList;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Declaração direta
        ArrayList<Cliente> lista = new ArrayList<>();
        lista.add(new Cliente("Bruno", 1));
        lista.add(new Cliente());
        System.out.println(lista.get(0).toString());
        s.close();
    }
}
