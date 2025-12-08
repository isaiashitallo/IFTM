
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        char vet[] = entrada.toCharArray();
        for (int i = 0; i < vet.length; i++) {
            
            if (i % 2 == 0) {
                if (vet[i]>='a' && vet[i]<='z'){
                    vet[i] -= 32;
                }
            } else {
                if (vet[i]>='A' && vet[i]<='Z'){
                    vet[i] += 32;
                }
            }
        }
        System.out.println(vet);
        s.close();
    }
}