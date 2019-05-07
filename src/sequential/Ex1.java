package sequential;

import java.util.Locale;
import java.util.Scanner;

public class Ex1{
	public static void main(String[] args){

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe dois valores: ");
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();

		System.out.printf("Resultado da soma: %d", v1+v2);

		sc.close();
	}
}