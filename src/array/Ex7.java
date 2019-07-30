package array;

import java.util.Scanner;

public class Ex7 {

	/*
	 * Leia 20 elementos e escreva-os em ordem contrária à leitura.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[20];
		
		System.out.println("Informe os nomes na ordem a seguir:");
		
		for(int i = 0; i < name.length; i++) {
			System.out.printf("%dº: ", i+1);
			name[i] = sc.nextLine();
		}
		
		System.out.println();
		
		int aux = 19;
		for(int i = 0; i < name.length; i++) {
			System.out.printf("%dº: %s.%n", i+1, name[aux]);
			aux--;
		}
		
		sc.close();

	}

}
