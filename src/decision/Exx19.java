package decision;

import java.util.Locale;
import java.util.Scanner;

public class Exx19{
		//Calcular que tipo de contexto se encaixa os números informados e exibir uma mensagem.
		public static void main(String[] args){
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Qual o dia e o mês do seu aniversário? ");
			int day = sc.nextInt();
			int month = sc.nextInt();

			if(day > month){
				System.out.println("Primeiro maior");
			}else if(day < month){
				System.out.println("Segundo maior");
			}else{
				System.out.println("Números iguais.");
			}

			sc.close();
	}
}