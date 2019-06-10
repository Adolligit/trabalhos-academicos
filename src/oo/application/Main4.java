package oo.application;

import java.util.Scanner;

import oo.entities.Ex4;

public class Main4 {

	/*
	 *	Receber o código do produto e retornar a descrição.
	 */
	
	public static void main(String[] args) {
		
		Ex4 ex4 = new Ex4();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Código: ");
		int codInfoUser = sc.nextInt();
		
		System.out.print(ex4.getDescricao(codInfoUser));
		
		sc.close();
	}

}
