package sequential;

import java.util.Locale;
import java.util.Scanner;

public class Exx11{
	//Calcular o valor das prestações de um produto.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Valor do produto: R$");
		double valueProduct = sc.nextDouble();

		double prestacao = valueProduct / 5;

		System.out.printf("x5 de %.2f sem juros.", prestacao);
	
		sc.close();
	}
}