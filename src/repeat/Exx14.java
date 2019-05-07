package repeat;

import java.util.Locale;
import java.util.Scanner;

public class Exx14{
	/*
		Receber os dados de um funcionário e depois atualizar seu salário.
	*/

	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char a;

		do{
			System.out.print("Nome: ");
			String name = sc.nextLine();

			System.out.print("Idade: ");
			int age = sc.nextInt();

			System.out.print("Sexo (f/m): ");
			char gender = sc.next().charAt(0);

			System.out.print("Salário: U$");
			double salary = sc.nextDouble();

			if(gender == 'm'){
				if(age < 30){
					salary += 50.0;
				}else{
					salary += 100.0;
				}
			}else{
				if(age < 30){
					salary += 80.0;
				}else{
					salary += 200.0;
				}
			}

			System.out.println("Nome: " + name);
			System.out.println("Salário líquido: U$" + salary);

			System.out.println();
			System.out.println("Você gostaria de fazer uma nova a consulta? ");
			a = sc.next().charAt(0);
			sc.nextLine();
			System.out.println();

		}while(a == 's');



		sc.close();
	}

}