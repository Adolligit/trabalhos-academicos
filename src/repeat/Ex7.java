package repeat;

import java.util.Locale;
import java.util.Scanner;

public class Ex7{
	//Mostra uma mensagem após receber um número digitado pelo usuário.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char answer;

		do{
			System.out.print("Informe um número: "); 
			int n = sc.nextInt();

			if(n < 25){
				System.out.printf("%d é menor que 25.%n", n);
			}else if(n == 40){
				System.out.printf("%d é igual a 40.%n", n);
			}else if(n > 80){
				System.out.printf("%d é maior que 80.%n", n);
			}

			System.out.println();

			System.out.println("Sair? ");
			answer = sc.next().charAt(0);

			System.out.println();

		}while(answer != 's');

		sc.close();
	}

}