package A5_AplicacaoRegex;
import java.util.Scanner;

public class ValidaEmail {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um email para validar: ");
        String email = sc.next();

        //regex
        String regex = "^[A-Za-z0-9._-]+@[A-Za-z0-9.]+\\.[A-Za-z]{2,6}$";

        if (email.matches(regex)) {
            System.out.println("Email válido.");
        } else {
            System.out.println("Email inválido.");
        }

// 🎯 Resumo geral
// Parte	Significado
// ^	Início da string
// [A-Za-z0-9._-]+	Usuário do e-mail
// @	Arroba obrigatório
// [A-Za-z0-9.]+	Domínio (pode ter vários níveis)
// \\.	Ponto final
// [A-Za-z]{2,6}	Sufixo (.com, .edu, .br, etc.)
// $	Fim da string


        sc.close();
    }
}
