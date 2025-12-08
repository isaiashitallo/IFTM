
import java.util.Scanner;


public class Exemplo05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String primeiraPalavra = s.nextLine();
        String segundaPalavra = s.nextLine();
        int diferenca = primeiraPalavra.compareTo(segundaPalavra);
        if (diferenca <= 0){
            System.out.println(primeiraPalavra + "\n" + segundaPalavra);
        }else{
            System.out.println(segundaPalavra + "\n" + primeiraPalavra);
        }
        System.out.println(diferenca);

        s.close();
    }
}
