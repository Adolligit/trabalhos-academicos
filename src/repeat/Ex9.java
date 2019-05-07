package repeat;

import java.util.Locale;
import java.util.Scanner;

public class Ex9{
	//Informar se os números são iguais ou diferentes (especificar qual o maior).
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char answer;

		do{
			System.out.print("Qual o dia e o mês da data de hoje? "); 
			int day = sc.nextInt();
			int month = sc.nextInt();

			if(day > month){
				System.out.printf("O dia %d é maior que o mês %d.%n", day, month);
			}else if(day < month){
				System.out.printf("O mês %d é maior que o dia %d.%n", month, day);
			}else{
				System.out.println("O dia " + day + " é igual ao mês " + month + ".");
			}

			System.out.println();

			System.out.print("Sair? ");
			answer = sc.next().charAt(0);

			System.out.println();

		}while(answer != 's');

		sc.close();
	}

}