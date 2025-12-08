import java.util.Scanner;

public class FatorialDeNovo {

    public static int Converte(String ACM) {
        int soma = 0;
        int tamACM = ACM.length(); // 3
        String reversedACM = new StringBuilder(ACM).reverse().toString(); // peguei o ACM, passei como stringbuilder, inverti e converti de volta para string

        for (int i = 0; i < tamACM; i++) {
            int digito = reversedACM.charAt(i) - '0'; // Converte caractere para dígito
            soma += digito * fatorial(i + 1);
    }

        return soma;
    }

    public static int fatorial(int n) {
        int fat = 1;
        for (int i = 2; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String ACM = sc.next();

            if (ACM.equals("0")) {
                break;
            }

            int resultado = Converte(ACM);
            System.out.println(resultado);
        }
    }




    
}
