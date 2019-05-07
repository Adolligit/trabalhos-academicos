package sequential;

import java.util.Locale;
import java.util.Scanner;

public class Ex8{
	//Converter temperatura para Celsius
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Temperatura em Fº: ");
		double tempF = sc.nextDouble();

		double convertion = (tempF - 32) / 1.8 ;

		System.out.printf("Convertida para Cº: %.2f", convertion);
	
		sc.close();
	}
}