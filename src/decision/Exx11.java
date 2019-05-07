package decision;

import java.util.Locale;
import java.util.Scanner;

public class Exx11{
	//Informar se são números diferentes ou não.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Me diga: qual o número do dia e do mês na data de hoje? ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		if(n1 != n2){
			System.out.printf("%d e %d são números diferentes.", n1, n2);
		}else{
			System.out.printf("%d e %d são números iguais.", n1, n2);
		}

		sc.close();
	}
}