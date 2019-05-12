package repeat;

import java.util.Locale;
import java.util.Scanner;

public class Exx16 {
	/*
	 * Exercícios: Ler dois números reais e imprimir o resultado com base no caracter informado. Tratar divisão por zero.
	 * 
	 * NOTA: A excesão que trata a divisão por zero, funciona somente com valores inteiros. 
	 * Já valores flutuantes (0.0) não chegam a ser precisamente zero, mas algo muito próximo a ele,
	 * ou seja, o Java reconhece que o resultado da divisão de um número por 0.0 da "infinito" (infinity),
	 * por isso foi adicionado o IF inicial para ter certeza que isso não aconteceria. Obrigado por ler!
	 * 
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas vezes você quer que o programa execute? ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			double result = 0;
			
			System.out.println(1 + i + "ª execução.");
			System.out.print("Informe algum número: ");
			double n1 = sc.nextDouble();
			
			System.out.print("Informe um símbolo (+, -, * ou /):");
			char c = sc.next().charAt(0);
			
			System.out.print("Informe algum outro número: ");
			double n2 = sc.nextDouble();
			
			if (c == '/') {
				result = n1 / n2;
				if(n2 == 0) {
					System.out.println("Não é possivel dividir por zero.");
				}
			} else if (c == '*') {
				result = n1 * n2;
			} else if (c == '+') {
				result = n1 + n2;
			} else if (c == '-'){
				result = n1 - n2;
			}else {
				System.out.println("Símbolo inválido!");
			}
			
			System.out.printf("Resultado: %.2f%n", result);
			System.out.println();
		}
			
		sc.close();
	}
}
