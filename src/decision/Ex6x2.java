package decision;

import java.util.Locale;
import java.util.Scanner;

public class Ex6x2{
	//Informar a descrição do lanche após receber código.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Código do produto: ");
		int cod = sc.nextInt();

		switch(cod){
			case 100:
				System.out.println("X-Salada com coca-cola.");
			break;
			case 200:
				System.out.println("Hot dog com suco de laranja.");
			break;
			case 300:
				System.out.println("Sanduiche natural com suco de uva.");
			break;
			case 400:
				System.out.println("Misto Quente com fanta laranja.");
			break;
			case 500:
				System.out.println("Pão com manteiga com café.");
			break;
			case 600:
				System.out.println("Pão com manteiga na chapa com café com leite.");
			break;
			default:
				System.out.println("Código informado inválido");
			break;

		}
		
		sc.close();
	}
}