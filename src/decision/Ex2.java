package decision;

import java.util.Locale;
import java.util.Scanner;

public class Ex2{
	//Colocar números informados em ordem crescente
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Valor A: ");
		int a = sc.nextInt();

		System.out.print("Valor B: ");
		int b = sc.nextInt();

		if(b < a){
			int trade = a;
			a = b;
			b = trade;
		}

		System.out.println("");
		System.out.println("Valores em ordem crescente.");
		System.out.printf("A:%d%n", a);
		System.out.printf("B:%d%n", b);

		sc.close();
	}
}