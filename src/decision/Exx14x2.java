package decision;

import java.util.Locale;
import java.util.Scanner;

public class Exx14x2{
	//Calcular e informar o valor do produto.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Valor do produto: U$");
		double price = sc.nextDouble();

		System.out.print("Tipo de pagamento (com base na tabela): ");
		int kind = sc.nextInt();

		switch(kind){
			case 6:
				price -= price * 0.07;
				System.out.printf("Valor atualizado: U$%.2f", price);
			break;

			case 5:
				price -= price * 0.08;
				System.out.printf("Valor atualizado: U$%.2f", price);
			break;

			case 4:
				price += price * 0.05;
				System.out.printf("Valor atualizado: U$%.2f", price);
			break;

			case 3:
				System.out.printf("Valor atualizado: U$%.2f", price);
			break;

			case 2:
				price -= price * 0.05;
				System.out.printf("Valor atualizado: U$%.2f", price);
			break;

			case 1:
			price -= price * 0.10;
				System.out.printf("Valor atualizado: U$%.2f", price);
			break;
			
			default:
				System.out.printf("Não há nenhum tipo de negociação com número %d.", kind);
			break;
		}

		sc.close();
	}
}