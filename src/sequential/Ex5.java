package sequential;

import java.util.Locale;
import java.util.Scanner;

public class Ex5{
	//Calcular média das notas de um aluno
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome: ");
		String name = sc.next();

		System.out.print("Quais são suas três notas? ");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();

		double media = (n1 + n2 + n3) / 3;

		System.out.println("");
		System.out.println("Aluno: " + name);
		System.out.printf("Média: %.2f", media);

		sc.close();
	}
}