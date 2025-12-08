/******************************************************************************
Entrada:
    inteiro n
    n valore inteiros salvos em v
Processamento
    Para cada valor presente em v
        incremente o contador correspondente ao valor 
    Para cada contador correspondente aos valores entre 1 e 100000
        some o resultado inteiro do contador dividido por 2 no resultado
Saida 
    imprima resultado

*******************************************************************************/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Map<Integer, Integer> tamanhos = new HashMap<>();
		long resp = 0;
		for (int i=0; i<n ;  i++ ){
            int altura = s.nextInt();
            if (tamanhos.containsKey(altura)){
		        resp++;
				tamanhos.remove(altura);
			}
            else{
				tamanhos.put(altura, 1);
			} 
		} 
		System.out.println(resp);
		s.close();
	}
}
