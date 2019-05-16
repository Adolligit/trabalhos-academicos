package repeat;
import java.util.Locale;
import java.util.Scanner;

public class Exx18 {

	/*
	 * Calcular e exibir o sal�rio de um professor.
	 * 
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salary = 0;
		char answer;

		do {
			System.out.print("Qual o seu n�vel? ");
			int nivel = sc.nextInt();
			
			System.out.print("Quantas horas voc� trabalhou esse m�s? ");
			int hour = sc.nextInt();

			System.out.println();

			switch (nivel) {
			case 1:
				salary = 12.00 * hour;
				System.out.printf("Sal�rio: U$%.2f%n", salary);
				break;
			case 2:
				salary = 17.00 * hour;
				System.out.printf("Sal�rio: U$%.2f%n", salary);
				break;
			case 3:
				salary = 25.00 * hour;
				System.out.printf("Sal�rio: U$%.2f%n", salary);
				break;
			default:
				System.out.printf("O n�vel %d n�o existe, por favor tente novamente!%n", nivel);
				break;
			}

			System.out.println();
			System.out.print("Gostaria de fazer uma nova consulta? ");
			answer = sc.next().charAt(0);
			System.out.println();
			
		}while (answer == 's');

		sc.close();
	}

}
