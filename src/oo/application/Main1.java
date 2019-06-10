package oo.application;

import java.util.Scanner;

import oo.entities.Ex1;

public class Main1 {

	/*
	 *	Informe se o valor informado for par (true) ou impar (false).
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Ex1 ex1 = new Ex1();
		
		System.out.print("Informe um valor: ");
		int value = sc.nextInt();
		
		System.out.println(ex1.parOuImpar(value));
		
		sc.close();

	}

}
