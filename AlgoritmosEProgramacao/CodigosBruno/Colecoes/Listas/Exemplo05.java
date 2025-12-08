
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Declaração direta
        List<Pessoa> lista = new ArrayList<>();
        lista.add(new Aluno("STI", "Brenda"));
        lista.add(new Aluno("STI", "Leonardo"));
        lista.add(new Aluno("STI", "Enzo"));
        lista.set(2, new Aluno("STI", "Eduardo"));
        System.out.println("Imprimir ArrayList");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNome());
        }
        s.close();
    }
}
