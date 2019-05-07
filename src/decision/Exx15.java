package decision;

import java.util.Locale;
import java.util.Scanner;

public class Exx15{
	//Informar qual o maior número.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe três números distintos: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		if(n1 == n2 || n1 == n3 || n2 == n3){
			System.out.println("Os números informados devem ser diferentes!");
		}else if(n1 > n2 && n1 > n3){
			System.out.printf("%d é o maior número.", n1);
		}else if(n2 > n1 && n2 > n3){
			System.out.printf("%d é o maior número.", n2);
		}else{
			System.out.printf("%d é o maior números.", n3);
		}

		sc.close();
	}
}