package sequential;

import java.util.Locale;
import java.util.Scanner;

public class Ex7{
	//Coverter temperatura para Fahrenheit
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Temperatura Cº: ");
		double tempC = sc.nextDouble();

		double convertion = tempC * 1.8 + 32;

		System.out.printf("Convertida para Fº: %.2f", convertion);

		sc.close();
	}
}