package repeat;

import java.util.Locale;
import java.util.Scanner;

public class Exx20 {

	/*	
	  	Calcular conta de luz de um usu�rio.  	
	*/
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char answer;
		
		do {
			int day = 0;
			double kwh = 0;
			
			System.out.print("Aparelhos (qnt): ");
			int amount = sc.nextInt();
			
			System.out.print("Watts de pot�ncia: ");
			double watts = sc.nextDouble();
			
			System.out.print("Horas de consumo di�rio: ");
			int hour = sc.nextInt();
			
			System.out.print("O aparelho � ligado todos os dias (s/n)? ");
			if(sc.next().charAt(0) != 's') {
				System.out.print("Quantos dias no m�s ele � ligado? ");
				day = sc.nextInt();		
				kwh = (amount * watts * hour * day) / 1000;
			}else {
				kwh = (amount * watts * hour * 30) / 1000;
			}
			
			System.out.printf("Resultado: seu consumo mensal � de %.2fKW/h.%n", kwh);	
			
			System.out.println();
			System.out.print("Voc� gostaria de refazer uma nova consulta? ");
			answer = sc.next().charAt(0);
			System.out.println();
			
		}while(answer != 'n');
		
		sc.close();
	}

}
