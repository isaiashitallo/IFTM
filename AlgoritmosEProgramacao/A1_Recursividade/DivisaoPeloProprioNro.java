import java.util.Scanner;

public class DivisaoPeloProprioNro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limite = 10000; // Define um limite superior para a busca
        int n = sc.nextInt();
        int atual = 1;

        listar(atual, limite, n);
    }

    public static void listar(int atual, int limite, int n) {
        // Caso base: se o dividendo é menor que o divisor, a divisão inteira é 0
        if (atual>limite) {
            return ;          
        }

        // Chamada recursiva: subtrai o divisor do dividendo e incrementa o quociente
        if (atual % n == 2) {
            System.out.println(atual);
        }

        //chama o prox nro
        listar(atual + 1, limite, n);

    }
    
}
