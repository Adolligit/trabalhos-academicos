package decision;

import java.util.Locale;
import java.util.Scanner;

public class Exx10{
	//Calcular a média das notas de um aluno.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome: ");
		String name = sc.next();

		System.out.print("Notas: ");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();

		double avg = (n1 + n2 + n3) / 3;  

		if(avg <= 5){
			System.out.printf("%s, você foi reprovado.", name);
		}else if(avg >= 7){
			System.out.printf("%s, você foi aprovado.", name);
		}else{
			System.out.printf("%s, você esta em recuperação.", name);
		}



		sc.close();
	}
}