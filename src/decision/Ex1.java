package decision;

import java.util.Locale;
import java.util.Scanner;

public class Ex1{
	//Informar se um número é par ou impar
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um número: ");
		int n = sc.nextInt();

		if(n % 2 == 0){
			System.out.printf("O número %d é par", n);
		}
		else{
			System.out.printf("O número %d é impar", n);
		}
	
		sc.close();
	}
}