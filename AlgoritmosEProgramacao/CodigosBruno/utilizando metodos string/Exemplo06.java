
import java.util.Scanner;


public class Exemplo06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //ler número inteiro
        int numero = s.nextInt();
        //converter o inteiro em texto
        String texto = String.valueOf(numero);
        for (int i = 0; i< texto.length(); i++){
            System.out.println(texto.charAt(i));
        }
        texto = texto.replace('0', '1');

        System.out.println(texto);
        int resultado = Integer.parseInt(texto);
        System.out.println(resultado/2);

        s.close();
    }
}
