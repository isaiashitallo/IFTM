package AulaMetodosString;
import java.util.Scanner;

public class tblAsp_toCharArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        char vet[] = entrada.toCharArray();
        for (int i = 0; i < vet.length; i++) {
            if (i % 2 == 0) {
                vet[i] += i;
            } else {
                vet[i] -= i;
            }
        }
        System.out.println(vet);
        s.close();
    }
}