package array;

import java.util.Scanner;

public class Ex5 {

	/*
	 * Ler valore inteiros no vetor A e imprimi-los no B da seguinte forma:
	 * 	Array A		3	8	4	2
	 * 	Array B		9	4	12	1
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos n�meros deseja informar? ");
		int numbInfo = sc.nextInt();
		
		int[] a = new int[numbInfo+1];
		int[] b = new int[numbInfo+1];
		
		for(int i = 1; i < a.length; i++) {
			System.out.printf("%d� n�mero: ", i);
			a[i] = sc.nextInt();
		}
		
		System.out.println();
		
		System.out.println("Se a posi��o for impar o n�mero ser� multiplicado, caso contr�rio ser� dividido.");
		for(int i = 1; i < b.length; i++) {
			if(i % 2 != 0) b[i] = a[i] * 3;
			else b[i] = a[i] / 2;
			System.out.printf("%d� %d.%n", i, b[i]);
		}
		
		sc.close();
	}

}
