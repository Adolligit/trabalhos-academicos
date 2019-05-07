package decision;

import java.util.Locale;
import java.util.Scanner;

public class Exx18{
	//Exibir uma mensagem após calcular a quantidade de gols de cada time.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("#1______________");
		System.out.print("Nome do time: ");
		String name1 = sc.nextLine();

		System.out.print("Gol(s) marcado(s) na partida: ");
		int gols1 = sc.nextInt();
		sc.nextLine();

		System.out.println();

		System.out.println("#2______________");
		System.out.print("Nome do Time: ");
		String name2 = sc.nextLine();

		System.out.print("Gol(s) marcado(s) na partida: ");
		int gols2 = sc.nextInt();

		System.out.println();

		if(gols1 > gols2){
			System.out.println(name1 + " venceu!");
		}else if(gols1 < gols2){
			System.out.println(name2 + " venceu!");
		}else{
			System.out.println("Emapate");
		}



		

		sc.close();
	}
}