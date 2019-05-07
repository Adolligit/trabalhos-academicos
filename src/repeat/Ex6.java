package repeat;

import java.util.Locale;
import java.util.Scanner;

public class Ex6{
	//Calcular lucro e exibir uma mensagem. No final exibir a média dos preços.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double avgPrice = 0, avgSale = 0;
		double totalPrice = 0, totalSale = 0;
		int to = 40;

		for(int i = 0; i < to; i++){
			System.out.print("Preço de custo: U$");
			double price = sc.nextDouble();
			totalPrice += price;

			System.out.print("Preço de venda: U$");
			double sale = sc.nextDouble();
			totalSale += sale;

			System.out.println();

			if(price > sale){
				System.out.println("Prejuízo.");
			}else if(price < sale){
				System.out.println("Lucro.");
			}else{
				System.out.println("Empate.");
			}

			System.out.println();
		}

		avgPrice = totalPrice / to;
		avgSale = totalSale / to;

		System.out.println("_Média_");
		System.out.printf("Preço de custo: U$%.2f.%n", avgPrice);
		System.out.printf("Preço de venda: U$%.2f.", avgSale);


		sc.close();
	}

}