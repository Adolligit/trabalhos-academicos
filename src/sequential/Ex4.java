package sequential;

import java.util.Locale;
import java.util.Scanner;

public class Ex4{
	//Ler dados do funcionário e calcular seu salário
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome: ");
		String name = sc.next();

		System.out.print("Salário: $");
		double salary = sc.nextDouble();

		System.out.print("Vendas feitas no mês: $");
		double sales = sc.nextDouble();

		System.out.printf("Salário final: $%.2f%n", salary+(sales*0.15));

		sc.close();
	}
}