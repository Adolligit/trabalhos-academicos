package repeat;

import java.util.Locale;
import java.util.Scanner;

public class Exx23 {

	/*
	 * 	Calcular a média ponderada das notas de um aluno.
	 * 	Classificar os alunos por sua média. 
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char a;
		
		do {
			int p1 = 2, p2 = 3, p3 = 5;
			int full = p1 + p2 + p3;
			char cft;
			
			System.out.print("Número de matrícula: ");
			int nM = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.println("A seguir, informe as notas referêntes à: ");
			System.out.print("Trabalho de laboratório: ");
			double n1 = sc.nextDouble();
			System.out.print("Avaliação semestral: ");
			double n2 = sc.nextDouble();
			System.out.print("Prova final: ");
			double n3 = sc.nextDouble();
			
			double avg = ((n1*p1) + (n2*p2) + (n3*p3)) / full;
			
			if(avg > 8) {
				cft = 'A';
			}else if(avg > 7) {
				cft = 'B';
			}else if(avg > 6) {
				cft = 'C';
			}else if(avg > 5) {
				cft = 'D';
			}else {
				cft = 'R';
			}
			
			System.out.println("Matrícula nº"+ nM + ". Nome: " + name + ". Nota final: " + avg + ". Classificação: " + cft + ".");
			
			System.out.println();
			System.out.print("Você deseja sair do programa? ");
			a = sc.next().charAt(0);
			
			System.out.println();
			
		}while(a != 's');
		
		sc.close();
	}
}
