package decision;

import java.util.Locale;
import java.util.Scanner;

public class Ex7{
	//Informa uma mensagem caso o número seja maior que 10.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual seu número da sorte? ");
		int n = sc.nextInt();
		
		if(n < 10){
			System.out.println("Bom saber!");
		}else{
			System.out.printf("Poxa vida, %d? você pensa alto!", n);
		}

		sc.close();
	}
}