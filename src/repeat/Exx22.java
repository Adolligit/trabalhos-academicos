package repeat;

import java.util.Locale;
import java.util.Scanner;

public class Exx22 {

	/*
	 * 	Calcular a média ponderada das notas de um aluno.
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char a;
		
		do {
			int p1 = 2, p2 = 3, p3 = 5;
			int full = p1 + p2 + p3;
			
			System.out.print("Qual seu nome? ");
			String name = sc.nextLine();
			
			System.out.println("A seguir, informe as notas referêntes à: ");
			System.out.print("Trabalho de laboratório: ");
			double n1 = sc.nextDouble();
			System.out.print("Avaliação semestral: ");
			double n2 = sc.nextDouble();
			System.out.print("Prova final: ");
			double n3 = sc.nextDouble();
			
			double avg = ((n1*p1) + (n2*p2) + (n3*p3)) / full;
			
			
			System.out.println(name + ", sua nota final foi de " + avg + ".");
			
			System.out.println();
			System.out.print("Reiniciar programa? ");
			a = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.println();
			
		}while(a != 'n');
		
		sc.close();
	}
}
