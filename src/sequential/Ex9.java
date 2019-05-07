package sequential;

import java.util.Locale;
import java.util.Scanner;

public class Ex9{
	//Converter valor para real
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Preço do Dolar: ");
		double valueDolar = sc.nextDouble();

		System.out.print("Qual o valor à ser convertido? $");
		double dolar = sc.nextDouble();

		double convertion = dolar / valueDolar;

		System.out.printf("Valor em real: R$%.2f", convertion);

	
		sc.close();
	}
}