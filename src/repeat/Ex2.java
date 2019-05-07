package repeat;

import java.util.Locale;
import java.util.Scanner;

public class Ex2{
	//Exibir mensagem se o usuário for maior ou menor de idade.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < 75; i++){
			System.out.print("Quantos anos vocês tem? ");
			int age = sc.nextInt();

			System.out.println();

			if(age > 17){
				System.out.println("Maior de idade");
			}else{
				System.out.println("Menor de idade");
			}
		}

		sc.close();
	}

}