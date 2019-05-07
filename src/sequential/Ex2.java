package sequential;

import java.util.Locale;
import java.util.Scanner;

public class Ex2{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe dois números: ");
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();

		System.out.printf("Soma: %d%n", v1+v2);
		System.out.printf("Subtração: %d%n", v1-v2);
		System.out.printf("Multiplicação: %d%n", v1*v2);
		System.out.printf("Divisão: %d%n", v1/v2);

		sc.close();
	}
}