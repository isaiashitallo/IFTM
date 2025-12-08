package A5_AplicacaoRegex;
import java.util.Scanner;

public class ValidaValor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String valor = sc.nextLine();
// 🧩 Explicação completa
// 1. ^R\$
// ^ → início da string
// R\$ → o literal R$ (o cifrão deve ser escapado)
// espaço obrigatório após o cifrão

// 2. O valor numérico
// Queremos permitir apenas 100.00 a 99999.99.

// Isso significa:
// 3 dígitos: 100–999
// 4 dígitos: 1000–9999
// 5 dígitos: 10000–99999
// Por isso usamos:
// ([1-9][0-9]{2}      → 100–999
// | [1-9][0-9]{3}     → 1000–9999
// | [1-9][0-9]{4})    → 10000–99999

// 3. \.[0-9]{2}
// \. → ponto literal
// [0-9]{2} → exatamente duas casas decimais

// 4. $
// Fim da string.
        String regex = "^R\\$ [1-9][0-9]{2,4}\\.[0-9]{2}$";

        if (valor.matches(regex)) {
            System.out.println("Valor válido");
        } else {
            System.out.println("Valor inválido");
        }
        sc.close();
    }

}