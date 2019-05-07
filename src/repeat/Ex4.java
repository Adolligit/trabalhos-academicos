package repeat;

import java.util.Locale;
import java.util.Scanner;

public class Ex4{
	//Calcular desconto e a quantidade de carros.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int count = 0; 
		double discount = 0;
		char answer;

		do{
			System.out.print("Ano: __/__/");
			int ageCar = sc.nextInt();

			System.out.print("Preço: U$");
			double price = sc.nextDouble();

			if(ageCar <= 2000){
				count++;
				discount = price * 0.12;
				System.out.printf("Desconto: U$%.2f.%n", discount);
			}else{
				discount = price * 0.07;
				System.out.printf("Desconto: U$%.2f.%n", discount);
			}

			System.out.println();

			System.out.print("Quer saber o preço de outro carro? ");
			answer = sc.next().charAt(0);

			System.out.println();

		}while(answer != 'n');

		System.out.println("Total de carros dos anos 2000: " + count + ".");


		sc.close();
	}

}