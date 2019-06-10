package oo.application;

import java.util.Locale;
import java.util.Scanner;

import oo.entities.Ex3;

public class Main3 {

	/*
	 *	Ler um salário e atualiza-lo.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Ex3 ex3 = new Ex3();
		
		System.out.print("Salário: U$");
		double salary = sc.nextDouble();
		
		double increase = ex3.calculaAumentoSalario(salary);
		
		System.out.printf("Salário + aumento: U$%.2f.%n", increase);
		
		sc.close();

	}

}
