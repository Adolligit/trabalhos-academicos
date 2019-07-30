package array;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {

	/*
	 * Ler e imprir 8 números. Depois informar quantos são múltiplos de 6.
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] number = new double[8];
		int amountM6 = 0;
		
		for(int i = 0; i < number.length; i++) {
			System.out.printf("%dº número: ", i+1);
			number[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		for(int i=0; i < number.length; i++) {
			if ((number[i] * 6) % 2 == 0) amountM6++;
			System.out.printf("%dº: %.2f.%n", i+1, number[i]);
		}
		
		System.out.println();
		
		System.out.printf("%d números informados são múltiplos de 6.%n", amountM6);
		
		sc.close();
	}

}
