package sequential;

import java.util.Locale;
import java.util.Scanner;

public class Exx12{
	//Calcular o valor de venda de um produto.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Valor de compra: R$");
		double valueBuy = sc.nextDouble();

		System.out.print("Acréscimo (%): ");
		double percentage = sc.nextDouble();

		percentage = percentage / 100;

		double valueSale = valueBuy + (percentage * valueBuy);

		System.out.printf("Valor de venda: R$%.2f", valueSale);
	
		sc.close();
	}
}