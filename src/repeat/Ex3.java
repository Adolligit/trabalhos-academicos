package repeat;

import java.util.Locale;
import java.util.Scanner;

public class Ex3{
	//Informar se é homem ou mulher.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int countFemale = 0, countMale = 0;

		for(int i = 0; i < 56; i++){
			System.out.print("Nome: ");
			String name = sc.nextLine();

			System.out.print("Sexo: ");
			char gender = sc.nextLine().charAt(0);

			if(gender == 'f'){
				countFemale++;
				System.out.print("(Mulher)");
			}else{
				countMale++;
				System.out.print("(Homem)");	
			}
			System.out.println();
		}

		System.out.println();/*para pular linha é preciso ser printLN e não somente print*/	
		System.out.println("Quantidade de homens: " + countMale);
		System.out.println("Quantidade de mulheres: " + countFemale);	

		sc.close();
	}

}