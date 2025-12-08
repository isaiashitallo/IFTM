public class ExemploDesempenho {
    public static void main(String[] args) {
        long execucoes = 100000;
        String strFinal = "";
		long tInicio = System.currentTimeMillis();		
		for (int i = 0; i < execucoes; i++) {
			strFinal += "a";
            //System.out.println("a");
		}
		long tFim = System.currentTimeMillis();
		long tResultado = tFim - tInicio;
		System.out.println("Tempo de Execução com operador '+' = " + tResultado + " ms");

		StringBuilder strBuilder = new StringBuilder();
		tInicio = System.currentTimeMillis();
		for (int i = 0; i < execucoes; i++) {
			strBuilder.append("a");
		}
		tFim = System.currentTimeMillis();
		tResultado = tFim - tInicio;
		System.out.println("Tempo de Execução com StringBuilder = " + tResultado + " ms");
    }
}
