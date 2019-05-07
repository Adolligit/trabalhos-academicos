package repeat;

import java.util.Locale;
import java.util.Scanner;

public class Exx10{
	//Escrever números por extenso.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String answer;

		do{
			System.out.print("De 1 a 5, qual é número de digitos da sua conta? "); 
			int oneToFive = sc.nextInt();

			switch(oneToFive){
				case 1:
					System.out.println("Um.");
				break;
				case 2:
					System.out.println("Dois.");
				break;
				case 3:
					System.out.println("Três.");
				break;
				case 4:
					System.out.println("Quatro.");
				break;
				case 5:
					System.out.println("Cinco.");
				break;
				default:
					System.out.println("´Número inválido.");
				break;
			}

			System.out.println();
			System.out.print("Você gostaria de reiniciar o programa? ");
			answer = sc.next();
			System.out.println();

		}while(answer.equals("sim"));

		sc.close();
	}

}