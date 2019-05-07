package decision;

import java.util.Locale;
import java.util.Scanner;

public class Ex9{
	//Informar se esta no intervalo.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Me informe um número randomico: ");
		int n = sc.nextInt();

		if(n > 99 && n < 201){
			System.out.printf("%d esta no intervalo entre 100 e 200.", n);
		}

		sc.close();
	}
}