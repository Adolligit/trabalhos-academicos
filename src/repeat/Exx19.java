package repeat;

import java.util.Scanner;

public class Exx19 {

	// Ler idade e classificar usu�rio
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas consultas voc�s deseja realizar? ");
		int amount = sc.nextInt();
		
		for(int i = 0; i < amount; i++) {
			System.out.println(1+i + "� consulta");
			System.out.print("Qual sua idade? ");
			int age = sc.nextInt();
			
			System.out.println();
			
			if(age >= 5 && age <= 7) {
				System.out.println("Infantil  A.");
			}else if(age >= 8 && age <= 10) {
				System.out.println("Infantil  B.");	
			}else if(age >= 11 && age <= 13) {
				System.out.println("Juvenil  A.");					
			}else if(age >= 14 && age <= 17) {
				System.out.println("Juvenil  B.");									
			}else if(age >= 18 && age <= 25) {
				System.out.println("S�nior.");									
			}else {
				System.out.println("Idade fora da faixa et�ria.");
			}
			
			System.out.println();
		}
		
		sc.close();
	}

}
