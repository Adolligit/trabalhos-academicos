package array;

import java.util.Scanner;

public class Ex1 {

	/*
	 * Ler 10 nomes e depois imprimi-los.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] name = new String[10];
		
		for (int i = 0; i < name.length; i++) {
			System.out.printf("%dº nome: ", i+1);
			name[i] = sc.nextLine();
		}
		
		System.out.println();
		
		for (int i = 0; i < name.length; i++) {
			System.out.printf("%s.%n", name[i]);
		}

		sc.close();
	}

}
