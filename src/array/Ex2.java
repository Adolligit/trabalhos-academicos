package array;

import java.util.Scanner;

public class Ex2 {

	/*
	 * Ler 15 números inteiros e imprimir uma lista númerada de 
	 * mensagens informando se é par ou impar.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[15];

		for (int i = 0; i < num.length; i++) {
			System.out.printf("%dº número: ", i+1);
			num[i] = sc.nextInt();
		}

		System.out.println();
		
		for (int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 0) {
				System.out.printf("%dº: %s.%n", i+1, "par");
			}else {
				System.out.printf("%dº: %s.%n", i+1, "impar");
			}
		}

		sc.close();
	}

}
