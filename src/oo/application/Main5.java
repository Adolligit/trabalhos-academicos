package oo.application;

import java.util.Scanner;

import oo.entities.Ex5;

public class Main5 {
	
	/*
	 *	Receber um número e retornar uma mensagem caso esteja entre o valor 100 e 200. 
	 */

	public static void main(String[] args) {
		Ex5 ex5 = new Ex5();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual seu número da sorte? ");
		int valueInfoUser = sc.nextInt();
		
		boolean check = ex5.intervalo100E200(valueInfoUser);
		
		if(check) {
			System.out.printf("O valor %d esta no intervalo.%n", valueInfoUser);
		}else {
			System.out.printf("O valor %d não esta no intervalo.%n", valueInfoUser);
		}
		
		sc.close();
	}

}
