package sequential;

import java.util.Locale;
import java.util.Scanner;

public class Ex6{
	//Trocar a posição de dois valores
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o valor A: ");
		int v1 = sc.nextInt();

		System.out.print("Informe o valor B: ");
		int v2 = sc.nextInt();

		int trade = v1;
		v1 = v2;
		v2 = trade;

		System.out.println("");
		System.out.println("Valor A:" + v1);
		System.out.println("Valor B:" + v2);

		sc.close();
	}
}