package array;

import java.util.Scanner;

public class Ex6 {

	/*
	 * Ler valores reais e escreve-los na ordem contrária à leitura.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] a = new double[30];
		
		System.out.println("Informe valores reais na ordem a seguir.");
		for(int i = 0; i < a.length; i++) {
			System.out.printf("%dº valor: ", i+1);
			a[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		int aux = 29;
		for(int i = 0; i < a.length; i++) {
			System.out.printf("%dº: %.2f. %n", i+1, a[aux]);
			aux--;
		}
		
		sc.close();
	}

}
