package decision;

import java.util.Locale;
import java.util.Scanner;

public class Exx17{
	//Escrever números em ordem crescente.
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
			if(n2 > n3){
				System.out.printf("Números em ordem crescente: %d, %d, %d.", n3, n2, n1);
			}else{
				System.out.printf("Números em ordem crescente: %d, %d, %d.", n2, n3, n1);
			}
		}else if(n2 > n1 && n2 > n3){
			if(n1 > n3){
				System.out.printf("Números em ordem crescente: %d, %d, %d.", n3, n1, n2);
			}else{
				System.out.printf("Números em ordem crescente: %d, %d, %d.", n1, n3, n2);
			}
		}else{
			if(n1 > n2){
				System.out.printf("Números em ordem crescente: %d, %d, %d.", n2, n1, n3);
			}else{
				System.out.printf("Números em ordem crescente: %d, %d, %d.", n1, n2, n3);
			}
		}
		
		sc.close();
	}
}