// ======================================================
// ARQUIVO: RevisaoJava.java
// TEMAS: Recursividade, Manipulação de Strings, Cadeia de Caracteres
// ======================================================

public class RevisaoJava {

    public static void main(String[] args) {

        // ==============================
        // 1. RECURSIVIDADE
        // ==============================
        System.out.println("==== RECURSIVIDADE ====");
        System.out.println("Fatorial de 5: " + fatorial(5)); // 5 * 4 * 3 * 2 * 1 = 120
        System.out.println("Soma de 1 até 10: " + soma(10)); // 55
        System.out.println("Fibonacci(7): " + fibonacci(7)); // 13
        System.out.println("Potência (2^4): " + potencia(2, 4)); // 16

        // ==============================
        // 2. MANIPULAÇÃO DE STRINGS (sem funções prontas)
        // ==============================
        System.out.println("\n==== MANIPULAÇÃO DE STRINGS (sem funções prontas) ====");
        String texto = "Java é incrível!";
        System.out.println("Texto original: " + texto);

        // Contar número de caracteres (sem usar length)
        System.out.println("Número de caracteres: " + contarCaracteres(texto));

        // Reverter string manualmente
        System.out.println("Texto invertido: " + inverterString(texto));

        // Contar quantas vezes aparece uma letra
        char letra = 'a';
        System.out.println("Quantidade de '" + letra + "': " + contarLetra(texto, letra));

        // ==============================
        // 3. MANIPULAÇÃO DE STRINGS (usando métodos da classe String)
        // ==============================
        System.out.println("\n==== MANIPULAÇÃO DE STRINGS (com métodos da classe String) ====");
        String frase = "Programar em Java é divertido";

        System.out.println("Frase original: " + frase);
        System.out.println("Tamanho: " + frase.length());
        System.out.println("Maiúsculas: " + frase.toUpperCase());
        System.out.println("Minúsculas: " + frase.toLowerCase());
        System.out.println("Primeira letra: " + frase.charAt(0));
        System.out.println("SubString (0 até 9): " + frase.substring(0, 9));
        System.out.println("Contém 'Java'? " + frase.contains("Java"));
        System.out.println("Índice da palavra 'Java': " + frase.indexOf("Java"));
        System.out.println("Trocar 'Java' por 'Python': " + frase.replace("Java", "Python"));
        System.out.println("Começa com 'Pro'? " + frase.startsWith("Pro"));
        System.out.println("Termina com 'divertido'? " + frase.endsWith("divertido"));

        // Remover espaços extras
        String suja = "   Espaços em volta   ";
        System.out.println("Antes: [" + suja + "]");
        System.out.println("Depois do trim(): [" + suja.trim() + "]");

        // Quebrar a frase em palavras
        String[] palavras = frase.split(" ");
        System.out.println("\nPalavras da frase:");
        for (String p : palavras) {
            System.out.println(p);
        }

        // ==============================
        // 4. MANIPULAÇÃO DE CARACTERES
        // ==============================
        System.out.println("\n==== MANIPULAÇÃO DE CARACTERES ====");
        String exemplo = "AbC123!";

        for (int i = 0; i < exemplo.length(); i++) {
            char c = exemplo.charAt(i);

            if (Character.isLetter(c)) {
                System.out.println(c + " é uma letra");
            } else if (Character.isDigit(c)) {
                System.out.println(c + " é um número");
            } else {
                System.out.println(c + " é um símbolo");
            }
        }

        // Transformar letras
        System.out.println("Maiúsculas: " + exemplo.toUpperCase());
        System.out.println("Minúsculas: " + exemplo.toLowerCase());

        // Converter para array de caracteres
        char[] caracteres = exemplo.toCharArray();
        System.out.println("\nArray de caracteres:");
        for (char c : caracteres) {
            System.out.print(c + " ");
        }
        System.out.println();

        // ==============================
        // 5. EXEMPLOS DE MÉTODOS ÚTEIS (StringBuilder e StringBuffer)
        // ==============================
        System.out.println("\n==== StringBuilder / StringBuffer ====");
        StringBuilder sb = new StringBuilder("Olá");
        sb.append(" Mundo!");
        sb.insert(0, ">>> ");
        sb.reverse();
        System.out.println("StringBuilder invertido: " + sb.toString());

        // ==============================
        // 6. EXERCÍCIOS CLÁSSICOS DE RECURSIVIDADE COM STRINGS
        // ==============================
        System.out.println("\n==== RECURSIVIDADE COM STRINGS ====");
        String palavra = "recursao";
        System.out.println("Palavra original: " + palavra);
        System.out.println("Palavra invertida (recursivo): " + inverterRecursivo(palavra));
        System.out.println("Contagem de vogais (recursivo): " + contarVogaisRecursivo(palavra));
    }

    // ============================================================
    // FUNÇÕES DE RECURSIVIDADE
    // ============================================================

    static int fatorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * fatorial(n - 1);
    }

    static int soma(int n) {
        if (n == 0) return 0;
        return n + soma(n - 1);
    }

    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int potencia(int base, int exp) {
        if (exp == 0) return 1;
        return base * potencia(base, exp - 1);
    }

    // ============================================================
    // FUNÇÕES DE MANIPULAÇÃO DE STRINGS SEM FUNÇÕES PRONTAS
    // ============================================================

    static int contarCaracteres(String s) {
        int cont = 0;
        try {
            while (true) {
                s.charAt(cont);
                cont++;
            }
        } catch (Exception e) {
            // Quando chegar no final da string, charAt lança exceção
        }
        return cont;
    }

    static String inverterString(String s) {
        String invertida = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            invertida += s.charAt(i);
        }
        return invertida;
    }

    static int contarLetra(String s, char letra) {
        int cont = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(letra)) {
                cont++;
            }
        }
        return cont;
    }

    // ============================================================
    // RECURSIVIDADE COM STRINGS
    // ============================================================

    static String inverterRecursivo(String s) {
        if (s.isEmpty()) return "";
        return inverterRecursivo(s.substring(1)) + s.charAt(0);
    }

    static int contarVogaisRecursivo(String s) {
        if (s.isEmpty()) return 0;
        char c = Character.toLowerCase(s.charAt(0));
        int soma = ("aeiou".indexOf(c) != -1) ? 1 : 0;
        return soma + contarVogaisRecursivo(s.substring(1));
    }
}
