public int calcularFatorial(int n) {
    if (n == 1) { // Caso Base
        return 1;
    } else { // Passo Recursivo
        return n * calcularFatorial(n - 1);
    }
}