package array;

import java.util.Scanner;

public class Exx11 {

	/*
	 * Ler valores e informar a quantidade de impares e pares e quais são esses
	 * números.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sumpar = 0, sumimpar = 0;

		int[] par = new int[10];
		int[] impar = new int[10];
		int[] vec = new int[10];

		System.out.println("Informe o...");
		for (int i = 0; i < vec.length; i++) {

			System.out.printf("%dº valor: ", i + 1);
			vec[i] = sc.nextInt();

			if (vec[i] % 2 == 0) {
				sumpar++;
				par[i] = vec[i];
			} else {
				sumimpar++;
				impar[i] = vec[i];
			}
		}

		System.out.println();

		System.out.println("*	Par	*");
		System.out.printf("Quantidade: %d. %n", sumpar);
		System.out.print("Número(s): ");
		for (int i = 0; i < vec.length; i++) {
			if(par[i] != 0) {
				System.out.print(par[i] + " ");
			}
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("*	Impar	*");
		System.out.printf("Quantidade: %d. %n", sumimpar);
		System.out.print("Número(s): ");
		for (int i = 0; i < vec.length; i++) {
			if(impar[i] != 0) {
				System.out.print(impar[i] + " ");
			}
		}

		sc.close();
	}

}
