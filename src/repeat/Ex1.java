package repeat;

import java.util.Locale;
import java.util.Scanner;

public class Ex1{
	//Contar quantos dos números informados estão entre o intervalo 10 e 150.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int count = 0;

		for(int i = 0; i < 80; i++){
			System.out.printf("Informe o %dº número:",i+1);
			int n = sc.nextInt();

			if(n >= 10 && n <= 150){
				count++;
			}
		}

		System.out.println();
		System.out.println("Quantidade de números que estão entre o invervalo 10 e 150: " + count);
		sc.close();
	}

}