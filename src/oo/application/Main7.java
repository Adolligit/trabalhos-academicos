package oo.application;

import java.util.Scanner;

import oo.entities.Ex7;

public class Main7 {
	
	/*
	 * Receba a idade de um atleta e informe sua categoria.
	 */

	public static void main(String[] args) {
		Ex7 ex7 = new Ex7();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String name = sc.nextLine();
		
		System.out.print("Idade: ");
		int age = sc.nextInt();
		
		String category = ex7.getCategoria(age);
		
		System.out.printf("%s, %s%n", name, category);
		
		sc.close();

	}

}
