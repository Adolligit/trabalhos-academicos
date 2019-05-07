package sequential;

import java.util.Locale;
import java.util.Scanner;

public class Ex3{
	//Calcular consumo médio de um veículo
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Distância: ");
		int v1 = sc.nextInt();
		System.out.print("Combustível: ");
		int v2 = sc.nextInt();

		System.out.printf("Consumo médio: %.2f%n", v1*v2/10.0);

		sc.close();
	}
}