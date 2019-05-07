package repeat;

import java.util.Locale;
import java.util.Scanner;

public class Exx13{
	/*
		Receber um número do mês e escrever seu nome.
	*/

	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String answer;

		do{
			System.out.print("Mês: ");
			int month = sc.nextInt();
			switch(month){
				case 1:
					System.out.println("Janeiro.");
				break;
				case 2:
					System.out.println("Fevereiro.");
				break;
				case 3:
					System.out.println("Março.");
				break;
				case 4:
					System.out.println("Abril.");
				break;
				case 5:
					System.out.println("Maio.");
				break;
				case 6:
					System.out.println("Junho.");
				break;
				case 7:
					System.out.println("Julho.");
				break;
				case 8:
					System.out.println("Agosto.");
				break;
				case 9:
					System.out.println("Setembro.");
				break;
				case 10:
					System.out.println("Outubro.");
				break;
				case 11:
					System.out.println("Novembro.");
				break;
				case 12:
					System.out.println("Dezembro.");
				break;
				default:
					System.out.println("Mês inválido.");
				break;
			}
			System.out.println();
			System.out.println("Deseja fazer uma nova consulta? ");
			answer = sc.next();
			System.out.println();

		}while(answer.equals("sim"));


		sc.close();
	}

}