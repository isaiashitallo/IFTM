
import java.util.Scanner;


public class Exemplo04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        String partes[] = data.split("/");
        System.out.println("Dia = " + partes[0]);
        System.out.println("Mês = " + partes[1]);
        System.out.println("Ano = " + partes[2]);

        String texto = s.nextLine();
        String palavras[] = texto.split(" ");
        for(String palavra : palavras){
            System.out.println(palavra);
        }
        for(String palavra : palavras){            
            System.out.print("[");
            for(char c : palavra.toCharArray()){
                System.out.print(" " + c + " ");
            }
            System.out.println("]");
        }
        //for(int i=0; i< palavras.length; i++){
        //   String palavra = palavras[i];
        //}

        s.close();
    }
}
