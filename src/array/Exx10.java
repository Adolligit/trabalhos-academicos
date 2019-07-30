package array;

import java.util.Scanner;

public class Exx10 {

	/*
	 * Tabuada.
	 * Armazenar valores de 1 a 10 em um vetor e no outro o resultado da soma com o valor informado pelo usuário.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] at = new int[10];
		int[] sum = new int[10];
		
		System.out.print("Qual o número da tabuada que você gostaria de ver? ");
		int number = sc.nextInt();
		
		System.out.println();
		
		for(int i = 0; i < sum.length; i++) {
			at[i] = i+1;
			sum[i] = at[i] * number;
			System.out.printf("%d x %d = %d.%n", number, at[i], sum[i]);
		}
	
		sc.close();
	}

}
