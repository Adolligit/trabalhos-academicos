package oo.application;

import java.util.Locale;
import java.util.Scanner;

import oo.entities.Ex8;

public class Main8 {

	/*
	 * Receber o preço de custo de um produto e retornar o valor de venda.
	 */
	
	public static void main(String[] args) {
		Ex8 ex8 = new Ex8();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Preço do produto: U$");
		double purchasePrice = sc.nextDouble();
		
		System.out.println();
		System.out.println
		( 
				"1 - Venda a Vista - desconto de 10%\n" + 
				"2 - Venda a Prazo 30 dias - desconto de 5%\n" + 
				"3 - Venda a Prazo 60 dias - mesmo preço\n" + 
				"4 - Venda a Prazo 90 dias - acréscimo de 5%\n" + 
				"5 - Venda com cartão de débito - desconto de 8%\n" + 
				"6 - Venda com cartão de crédito - desconto de 7%"
		);
		System.out.println();
		
		System.out.print("Informe o número de uma das opções da tabela acima: ");
		int choose = sc.nextInt();
		
		double result = ex8.getValorDaCompra(choose, purchasePrice);
		
		if(result == 0) {
			System.out.println("Opção inválida!");
		}else {
			System.out.printf("Valor atualizado: U$%.2f.%n", result);
		}
		
		sc.close();
	}

}
