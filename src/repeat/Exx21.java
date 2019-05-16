package repeat;

import java.util.Locale;
import java.util.Scanner;

public class Exx21 {
	
	/*
	 * Ler dados de uma pessoa e mostrar e depois calcular o peso ideal para ela.
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String answer;
		
		do {
			double idealWeight = 0;
			
			System.out.println("A seguir, informe seus dados:");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("Idade: ");
			int age = sc.nextInt();
			
			System.out.print("Sexo (f/m): ");
			char gender = sc.next().charAt(0);
			
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			sc.nextLine();

			// Feminino
			if(gender == 'f' && height > 1.5) {
				idealWeight = (62.1 * height) - 44.7;
			}else if(gender == 'f' && height <= 1.5) {
				if(age < 35) {
					idealWeight = (62.1 * height) - 49;
				}else {
					idealWeight = (62.1 * height) - 45;
				}
			}

			// Masculino
			if (gender == 'm' && height > 1.7) {
				if (age <= 20) {
					idealWeight = (72.7 * height) - 58;
				} else if (age > 20 && age < 40) {
					idealWeight = (72.7 * height) - 53;
				} else {
					idealWeight = (72.7 * height) - 45;
				}
			} else if (gender == 'm' && height <= 1.7) {
				if (age <= 40) {
					idealWeight = (72.7 * height) - 50;
				} else {
					idealWeight = (72.7 * height) - 58;
				}
			}
			
			System.out.printf("%s, seu peso ideal é %.2fKG.%n", name, idealWeight);
			

			System.out.println();
			System.out.print("Você gostaria de fazer uma nova consulta? ");
			answer = sc.nextLine();
			System.out.println();
		}while(answer.equals("sim") || answer.equals("Sim") || answer.equals("s") || answer.equals("S"));
		
		sc.close();
	}

}
