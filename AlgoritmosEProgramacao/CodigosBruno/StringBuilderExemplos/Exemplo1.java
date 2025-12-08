
import java.util.Scanner;

public class Exemplo1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //construtor da classe StringBuilder, permite criar uma String mutavel com ou sem valor inicial. Inclusive ler diretamente
        StringBuilder texto = new StringBuilder(s.nextLine());
        //texto = texto + "1"; // não podemos manipular diretamente uma StringBuilder
        //Converte uma StringBuilder em String
        String saidaComString = texto.toString();
        System.out.println(texto);
        System.out.println(saidaComString);

        //manipulando String(comum)
        saidaComString = saidaComString + " - 1";
        

        //manipulando StringBuilder
        // não há necessidade de armazenar o retorno, ele modifica o próprio objeto

        //permite inserir um texto ao fim de uma StringBuilder(mutável)        
        texto.append(" - 2");
        texto.append(2);

        //permite inserir em outra parte do texto mutável(StringBuilder)
        //indice de 0 a length
        texto.insert(0, "Uberlândia ");

        //apagar parte do texto da String atual
        texto.delete(0, 0);
        //apagar um caractere vinculado a um indice.
        texto.deleteCharAt(texto.length()-1);
        //modificar um caractere do texto, vinculado a uma posição
        texto.setCharAt(0, '9');

        //outros métodos
        texto.replace(0, 5, "Uberaba");
        texto.reverse();

        System.out.println(saidaComString);
        System.out.println(texto);
    }
}