package decision;

import java.util.Locale;
import java.util.Scanner;

public class Ex8{
	//Informar qual número é o maior.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe dois números: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(n1 > n2){
			System.out.printf("%d é o maior entre os dois números informados!", n1);
		}else{
			System.out.printf("%d é o maior entre os dois números informados!", n2);
		}

		sc.close();
	}
}