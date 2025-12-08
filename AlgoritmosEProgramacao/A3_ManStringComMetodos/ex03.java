package A3_ManStringComMetodos;
import java.util.Scanner; //serve para inputar dados

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //inputa o N
        sc.nextLine();

        //Solicito o N para saber quantas entradas terei no meu for
        //depois pulo um linha com o nextLine e crio o for, onde vou calcular com uma função externa ao main

        for (int i=0; i < N; i++) {


        }

        sc.close();
    }

    public static int calcResult(String entrada) {
        //primeiro extrai os caracteres como string


        //depois converto para int


        //acrescento um if para casos de nros iguais: produto de ambos
        if(num1 == num2) {
            return num2 * num1;
        }

        //se letra maiuscula, subtrai 2 do 1
        if(Character.isUpperCase(letra)) {
            return num2 - num1;
        }
    }
}
