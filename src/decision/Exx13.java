package decision;

import java.util.Locale;
import java.util.Scanner;

public class Exx13{
	//Ler dados do usuário e mostrar sua classificação.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome: ");
		String name = sc.next();

		System.out.print("Idade: ");
		int age = sc.nextInt();

		if(age > 4 && age < 11){
			System.out.println("Infantil.");
		}else if(age > 10 && age < 16){
			System.out.println("Juvenil.");
		}else if(age > 15 && age < 21){
			System.out.println("Junior.");
		}else if(age > 20 && age < 26){
			System.out.println("Profissional.");
		}else{
			System.out.printf("%s, infelizmente ainda não há uma categoria para sua idade.", name);
		}

		sc.close();
	}
}