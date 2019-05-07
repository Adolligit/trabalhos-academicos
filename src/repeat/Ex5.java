package repeat;

import java.util.Locale;
import java.util.Scanner;

public class Ex5{
	//Informar se o usuário esta apto ou não para o serviço militar.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int can = 0, cannot = 0;
		char answer;

		do{

			System.out.print("Nome: ");
			String name = sc.nextLine();

			System.out.print("Idade: ");
			int age = sc.nextInt();

			System.out.print("Saúde (0 a 10): ");
			int health = sc.nextInt();

			System.out.println();

			if(health > 5 && age > 17){
				System.out.println("Você pode se alistar!");
				can++;
			}else{
				System.out.println("Você não pode se alistar!");
				cannot++;
			}

			System.out.println();

			System.out.println("Fazer uma nova consulta? ");
			answer = sc.next().charAt(0);
			sc.nextLine();

			System.out.println();

		}while(answer != 'n');

		System.out.println("Quantidade de pessoas que:");
		System.out.printf("Podem se alistar: %d.%n", can);
		System.out.printf("Não podem se alistar: %d.", cannot);

		sc.close();
	}

}