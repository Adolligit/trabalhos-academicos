package oo.application;

import java.util.Locale;
import java.util.Scanner;

import oo.entities.Ex6;

public class Main6 {

	/*
	 * Receber a média de notas do aluno e informar a situação dele.
	 */
	
	public static void main(String[] args) {
		Ex6 ex6 = new Ex6();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe suas três notas: ");
		double n1InfoUser = sc.nextDouble();
		double n2InfoUser = sc.nextDouble();
		double n3InfoUser = sc.nextDouble();
		
		String desc = ex6.getSituacaoDoAluno(n1InfoUser, n2InfoUser, n3InfoUser);
		
		System.out.println(desc);
		
		sc.close();

	}

}
