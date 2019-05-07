package decision;

import java.util.Locale;
import java.util.Scanner;

public class Ex4{
	//Informar por escrito o dia da semana.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o número do dia:");
		int day = sc.nextInt();
		System.out.println("");

		if(day == 1){
			System.out.println("Domingo");
		}
		else if(day == 2){
			System.out.println("Segunda-feira");
		}
		else if(day == 3){
			System.out.println("Terça-feira");
		}
		else if(day == 4){
			System.out.println("Quarta-feira");		
		}
		else if(day == 5){
			System.out.println("Quinta-feira");
		}
		else if(day == 6){
			System.out.println("Sexta-feira");
		}
		else if(day == 7){
			System.out.println("Sábado");
		}
		else {
			System.out.println("Dia inválido!");
		}
		sc.close();
	}
}