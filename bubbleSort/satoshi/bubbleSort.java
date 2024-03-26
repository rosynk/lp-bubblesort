package satoshi;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class bubbleSort {
	public static void main(String[] args) {
		int vetor [] = new int [5]; 
		int aux;		
		
		for (int i = 0 ; i < 5; i++) {
			vetor[i] =  Integer.parseInt(JOptionPane.showInputDialog("Por favor, insira 5 números inteiros: "));
						
		}
		
		System.out.println("Vetor desorganizado: " + Arrays.toString(vetor));
		
		for (int j = 0 ; j < 4 ; j++) {
			for (int k = 0 ; k < 3 ; k++) {
				if (vetor[j] < vetor [j+1]) {
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
		}
		
		System.out.println("Vetor organizado em ordem decrescente: " + Arrays.toString(vetor));
		
	
		
		for (int j = 0 ; j < vetor.length - 1 ; j++) {
		    for (int k = 0 ; k < vetor.length - 1 ; k++) { 
		        if (vetor[k] > vetor[k+1]) { 
		            aux = vetor[k]; 
		            vetor[k] = vetor[k+1];
		            vetor[k+1] = aux;
		        }
		    }
		}

		
		System.out.println("Vetor organizado em ordem crescente: " + Arrays.toString(vetor));
		
	}
}
