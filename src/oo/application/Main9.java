package oo.application;

import java.util.Scanner;

import oo.entities.Ex9;

public class Main9 {
	
	/*
	 *	Leia 10 valores inteiros e insira-os em um vetor. 
	 *	Depois leia o número de busca do usuário e imprima a posição do mesmo.
	 */
	
	public static void main(String[]  args) {
		Scanner sc = new Scanner(System.in);
		Ex9 ex9 = new Ex9();
		int[] vect = new int[10];
		
		System.out.println("Somente valores inteiros.");
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("%dº: ", i+1);
			vect[i] = sc.nextInt();
		}
		
		System.out.println();
		
		System.out.print("Qual valor você procura na lista? ");
		int value = sc.nextInt();
		
		System.out.println();
		
		int result = ex9.procuraValor(vect, value);
		
		if(result > 0) System.out.printf("Posição: %dª.%n", result);
		else System.out.printf("O número %d não foi encontrado na lista.%n", value);
		
		sc.close();
	}

}
