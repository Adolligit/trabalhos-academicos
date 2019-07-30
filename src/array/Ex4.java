package array;

import java.util.Scanner;

public class Ex4 {

	/*
	 * Ler valores inteiros em no vetor A e imprir cada valor ao quadrado no vetor B.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[50];
		int[] b = new int[50];
		
		System.out.println("Informe os valores:");
		for(int i = 0; i < a.length; i++) {
			System.out.printf("%dº valor: ", i+1);
			a[i] = sc.nextInt();
		}
		
		System.out.println();
		
		System.out.println("Valores ao quadrado:");
		for(int i = 0; i < b.length; i++) {
			b[i] = a[i] * a[i];
			System.out.printf("%dº: %d.%n", i+1, b[i]);
		}
		
		sc.close();

	}

}
