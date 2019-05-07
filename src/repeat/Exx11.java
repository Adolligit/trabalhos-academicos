package repeat;

import java.util.Locale;
import java.util.Scanner;

public class Exx11{
	/*
		Calcular o valor do desconto e imprimi-lo. 
		Exibir também o valor a ser pago.
		No final exibir a soma dos desconto e total pago pelos clientes

	*/
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int fuel = 0;
		double 	totalDescount = 0, totalPrice = 0, price = 0, descount = 0;

		do{
			

			System.out.println("::::::Tabela de Desconto::::::");
			System.out.println("1) Alcool - 25%");
			System.out.println("2) Gasolina - 21%");
			System.out.println("3) Diesel - 14%");
			System.out.println("::::::::::::::::::::::::::::::");
			System.out.println();
			System.out.print("Combustível: ");
			fuel = sc.nextInt();

			System.out.print("Preço: U$");
			price = sc.nextDouble();

			System.out.println();
			if(price != 0){
				switch(fuel){
					case 1:
						descount = price * 0.25;
						price = price - descount;
						totalDescount += descount;
						totalPrice += price;
						System.out.printf("Desconto: U$%.2f.%n", descount);
						System.out.printf("Preço: U$%.2f.%n", price);
					break;
					case 2:
						descount = price * 0.21;
						price = price - descount;
						totalDescount += descount;
						totalPrice += price;
						System.out.printf("Desconto: U$%.2f.%n", descount);
						System.out.printf("Preço: U$%.2f.%n", price);
					break;
					case 3:
						descount = price * 0.14;
						price = price - descount;
						totalDescount += descount;
						totalPrice += price;
						System.out.printf("Desconto: U$%.2f.%n", descount);
						System.out.printf("Preço: U$%.2f.%n", price);
					break;
					default:
						System.out.println("Opção inválida.");
					break;
				}
							}
			System.out.println();
		}while(price != 0);

		System.out.printf("Nossos clientes já tiveram U$%.2f de desconto.%n", totalDescount);
		System.out.printf("Quantidade total do valor pago com desconto: U$%.2f.%n", totalPrice);

		sc.close();
	}

}