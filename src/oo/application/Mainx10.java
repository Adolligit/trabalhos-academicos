package oo.application;

import oo.entities.Exx10;

public class Mainx10 {

	/*
	 * Leia 10 números inteiros depois imprima:
	 * Par - quantidade, números;
	 * Impar - quantidade, números;
	 */
	
	public static void main(String[] args) {
		Exx10 t = new Exx10();
		
		System.out.println("Somente números inteiros.");
		t.buildingVector();
		
		System.out.println();
		
		System.out.println("*      PARES      *");
		System.out.printf("Quantidade: %d%n", t.counterPair());
		System.out.print("Numero(s): ");
		execute(t.whichPar());
		
		System.out.println();
		System.out.println();
		
		System.out.println("*      ÍMPARES      *");
		System.out.printf("Quantidade: %d%n", t.counterOdd());
		System.out.print("Numero(s): ");
		execute(t.whichOdd());	
	}
	
	public static void execute(int k[]) {
		for(int i = 0; i < k.length; i++) {
			System.out.print(k[i] + " ");
		}
	}
}
