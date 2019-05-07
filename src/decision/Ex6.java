package decision;

import java.util.Locale;
import java.util.Scanner;

public class Ex6{
	//Informar a descrição do lanche após receber código.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Código do produto: ");
		int cod = sc.nextInt();
		if(cod == 100){
			System.out.println("X-Salada com coca-cola.");
		}else if(cod == 200){
			System.out.println("Hot dog com suco de laranja.");
		}else if(cod == 300){
			System.out.println("Sanduiche natural com suco de uva.");
		}else if(cod == 400){
			System.out.println("Misto Quente com fanta laranja.");
		}else if(cod == 500){
			System.out.println("Pão com manteiga com café.");
		}else if(cod == 600){
			System.out.println("Pão com manteiga na chapa com café com leite.");
		}else{
			System.out.println("Código informado inválido");
		}

		sc.close();
	}
}