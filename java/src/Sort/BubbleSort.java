package Sort;

import java.lang.reflect.Array;

public class BubbleSort {

	public static void main(String[] args) {

		int vetor[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		System.out.println("IN:  " + convert2string(vetor));

		boolean troca = true;
		int aux;
		while (troca) {
			troca = false;
			for (int i = 0; i < vetor.length - 1; i++) {
				if (vetor[i] > vetor[i + 1]) {
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					troca = true;
				}
			}
		}

		System.out.println("OUT: " + convert2string(vetor));
	}

	private static String convert2string(int vetor[]) {

		String resultado = "";
		
		for (int i = 0; i < vetor.length; i++) {
			
			resultado += vetor[i] + " ";
			
			
//			Object[] objs = vetor.get(i);
//
//			for (Object o : objs) {
//				System.out.print(o + " ");
//			}
		}
		
		return resultado;
	}
}
