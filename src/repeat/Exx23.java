package repeat;

import java.util.Locale;
import java.util.Scanner;

public class Exx23 {

	/*
	 * 	Calcular a m�dia ponderada das notas de um aluno.
	 * 	Classificar os alunos por sua m�dia. 
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char a;
		
		do {
			int p1 = 2, p2 = 3, p3 = 5;
			int full = p1 + p2 + p3;
			char cft;
			
			System.out.print("N�mero de matr�cula: ");
			int nM = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.println("A seguir, informe as notas refer�ntes �: ");
			System.out.print("Trabalho de laborat�rio: ");
			double n1 = sc.nextDouble();
			System.out.print("Avalia��o semestral: ");
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
			
			System.out.println("Matr�cula n�"+ nM + ". Nome: " + name + ". Nota final: " + avg + ". Classifica��o: " + cft + ".");
			
			System.out.println();
			System.out.print("Voc� deseja sair do programa? ");
			a = sc.next().charAt(0);
			
			System.out.println();
			
		}while(a != 's');
		
		sc.close();
	}
}
