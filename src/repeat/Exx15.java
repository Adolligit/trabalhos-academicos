package repeat;

import java.util.Locale;
import java.util.Scanner;

public class Exx15 {

	// Ler três valores inteiros e imprimi-los em ordem crescente.

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String answer;

		do {
			System.out.print("Informe três números inteiros: ");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();

			if (n1 > n2 && n1 > n3) {
				if (n2 > n3) {
					System.out.printf("Números em ordem crescente: %d, %d, %d.%n", n3, n2, n1);
				} else {
					System.out.printf("Números em ordem crescente: %d, %d, %d.%n", n2, n3, n1);
				}
			} else if (n2 > n1 && n2 > n3) {
				if (n1 > n3) {
					System.out.printf("Números em ordem crescente: %d, %d, %d.%n", n3, n1, n2);
				} else {
					System.out.printf("Números em ordem crescente: %d, %d, %d.%n", n1, n3, n2);
				}
			}else {
				if (n2 > n1) {
					System.out.printf("Números em ordem crescente: %d, %d, %d.%n", n1, n2, n3);
				} else {
					System.out.printf("Números em ordem crescente: %d, %d, %d.%n", n2, n1, n3);
				}
			}

			System.out.println();
			System.out.println("Você gostaria de reiniciar o teste?");
			answer = sc.next();
			System.out.println();
		} while (answer.equals("sim") || answer.equals("s"));

		sc.close();
	}

}
