package decision;

import java.util.Locale;
import java.util.Scanner;

public class Ex4x2{
	//Informar por escrito o dia da semana.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Número do dia (semana):");
		int day  = sc.nextInt();
		System.out.println("");

		switch(day){
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-feira");
				break;
			case 3:
				System.out.println("Terça-feira");
				break;

			case 4:
				System.out.println("Quarta-feira");
				break;

			case 5:
				System.out.println("Quinta-feira");
				break;

			case 6:
				System.out.println("Sexta-feira");
				break;

			case 7:
				System.out.println("Sábado");
				break;

			default:
				System.out.println("Dia inválido!");
				break;
		}
		
		sc.close();
	}
}