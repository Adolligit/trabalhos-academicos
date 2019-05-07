package sequential;

import java.util.Locale;
import java.util.Scanner;

public class Exx10{
	//Calcular o rendimento após um mês do valor depositado
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o valor do depósito: R$");
		double valueDeposit = sc.nextDouble();

		double poupanca = 0.7/12;

		double rendimento = valueDeposit + (valueDeposit*poupanca);

		System.out.printf("Rendimento após um mês: R$%.2f", rendimento);

		sc.close();
	}
}