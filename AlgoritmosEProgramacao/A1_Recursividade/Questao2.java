import java.util.Scanner;


public class Questao2 {

    // static int x = sc.nextInt(); // digito do usuario

    static int nextsixodd = 6; // próximos 6 nros ímpares

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 1; i <= nextsixodd; i++) {
            if (x % 2 == 0) {
                int firsteven = (x+1);
                System.out.println(firsteven);
                x += 2;
            } else {
                int firstodd = x;
                System.out.println(firstodd);
                x = (x+2);
            }
        }

        sc.close();
    }
}
