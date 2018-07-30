package OrdenacaoSelectionSort;

import java.io.IOException;

public class MainSelectionSort {

	public static void main(String[] args) {
		
		Popula p = new Popula();
		
		int[] vetor   	= 	new int[10];

		p.aleatorio(vetor);
		
		for (int i = 0; i < vetor.length; i++ ){
			if (i == 0){
				System.out.print("Vetor inicial = ");
			}
			System.out.print(" [" + vetor[i] + "] ");
			
			if (i == vetor.length - 1){
				System.out.println("");
			}
		}
		
		SelectionSort algoritmo = new SelectionSort();
		//variavel que armazena o numero de interações do algoritmo SelectionSort
		int c = algoritmo.metodo(vetor);
		
		for (int i = 0; i < vetor.length; i++ ){
			if (i == 0){
				System.out.print("Vetor final =   ");
			}
			System.out.print(" [" + vetor[i] + "] ");
			if (i == vetor.length - 1){
				System.out.println(c);
			}
		}
	}
}
