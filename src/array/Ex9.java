package array;

import java.util.Scanner;

public class Ex9 {

	/*
	 * Armazenar os valores inteiros em dois vetores e depois imprimir a soma deles em um terceiro vetor.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[20];
		int[] b = new int[20];
		int[] sum = new int[20];
		
		System.out.println("A seguir, informe os valores em suas respectivas ordens:");
		for(int i = 0; i < a.length; i++) {
			System.out.printf("%dº: ", i+1);
			a[i] = sc.nextInt();
			b[i] = a[i];
		}
		
		System.out.println();
		
		System.out.println("Resultado da soma dos valores informados:");
		for(int i = 0; i < sum.length; i++) {
			sum[i] = a[i] + b[i];
			System.out.printf("%dº: %d.%n",i+1, sum[i]);
		}
		
		sc.close();
	}

}
