package oo.application;

import java.util.Scanner;

import oo.entities.Ex2;

public class Main2 {

	/*
	 * Receba um n�mero e informe o dia da semana.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Ex2 ex2 = new Ex2();
		
		System.out.print("Qual o dia da semana que voc� mais gosta? (informe somente o n�mero): ");
		int day = sc.nextInt();
		
		System.out.println(ex2.getDescricaoDiaSemana(day));
		
		sc.close();

	}

}
