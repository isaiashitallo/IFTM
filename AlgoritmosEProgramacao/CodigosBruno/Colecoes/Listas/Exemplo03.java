
import java.util.ArrayList;
import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Declaração direta
        ArrayList<Cliente> lista = new ArrayList<>();
        lista.add(new Cliente("Bruno", 1));
        lista.add(new Cliente("Carlos", 2));
        lista.add(new Cliente("Edson", 3));
        lista.add(1, new Cliente("Wilton", 4));
        lista.addAll(lista);
        System.out.println("Imprimir ArrayList");
        /* for tradicional
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNome());
        }
            */
        for(Cliente c : lista){
            System.out.println(c.getNome());
        }
        s.close();
    }
}
