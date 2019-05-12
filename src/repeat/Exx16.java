package repeat;

import java.util.Locale;
import java.util.Scanner;

public class Exx16 {
	/*
	 * Exerc�cios: Ler dois n�meros reais e imprimir o resultado com base no caracter informado. Tratar divis�o por zero.
	 * 
	 * NOTA: A exces�o que trata a divis�o por zero, funciona somente com valores inteiros. 
	 * J� valores flutuantes (0.0) n�o chegam a ser precisamente zero, mas algo muito pr�ximo a ele,
	 * ou seja, o Java reconhece que o resultado da divis�o de um n�mero por 0.0 da "infinito" (infinity),
	 * por isso foi adicionado o IF inicial para ter certeza que isso n�o aconteceria. Obrigado por ler!
	 * 
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas vezes voc� quer que o programa execute? ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			double result = 0;
			
			System.out.println(1 + i + "� execu��o.");
			System.out.print("Informe algum n�mero: ");
			double n1 = sc.nextDouble();
			
			System.out.print("Informe um s�mbolo (+, -, * ou /):");
			char c = sc.next().charAt(0);
			
			System.out.print("Informe algum outro n�mero: ");
			double n2 = sc.nextDouble();
			
			if (c == '/') {
				result = n1 / n2;
				if(n2 == 0) {
					System.out.println("N�o � possivel dividir por zero.");
				}
			} else if (c == '*') {
				result = n1 * n2;
			} else if (c == '+') {
				result = n1 + n2;
			} else if (c == '-'){
				result = n1 - n2;
			}else {
				System.out.println("S�mbolo inv�lido!");
			}
			
			System.out.printf("Resultado: %.2f%n", result);
			System.out.println();
		}
			
		sc.close();
	}
}
