package repeat;

import java.util.Locale;
import java.util.Scanner;

public class Ex8{
	//Informar se o número digitado é positivo ou negativo.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char answer;

		do{
			System.out.print("Informe um número: "); 
			int n = sc.nextInt();

			if(n < 0){
				System.out.printf("%d é negativo.%n", n);
			}else if(n == 0){
				System.out.printf("%d - Zero!.%n", n);
			}else if(n > 0){
				System.out.printf("%d é positivo.%n", n);
			}

			System.out.println();

			System.out.println("Sair? ");
			answer = sc.next().charAt(0);

			System.out.println();

		}while(answer != 's');

		sc.close();
	}

}