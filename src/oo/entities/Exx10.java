package oo.entities;

import java.util.Scanner;

public class Exx10 {

	private int vPair[], pair = 0, vOdd[], odd = 0;
	private int[] vUser = new int [10];
	
	Scanner sc = new Scanner(System.in);
	
	public void buildingVector() {
		for(int i = 0; i < vUser.length; i++) {
			System.out.printf("%dº:", i+1);
			vUser[i] = sc.nextInt();
		}
	}
	
	/*
	 *	NUMEROS PARES
	 */
	
	//	CONTANDO NUMEROS PARES
	public int counterPair() {
		for(int i = 0; i < vUser.length; i++) {
			if(vUser[i] % 2 == 0) {
				pair++;
			}
		}
		vPair = new int[pair];
		return pair;
	}
	
	//	IDENTIFICANDO NUMEROS PARES
	public int[] whichPar() {
		int cFromvPair = 0;
		
		for(int i = 0; i < vUser.length; i++) {
			if(vUser[i] % 2 == 0) {
				vPair[cFromvPair] = vUser[i];
				cFromvPair++;
			}
		}
		return vPair;
	}
	
	/*
	 *	NUMEROS ÍMPARES
	 */
	
	//	CONTANDO NUMEROS IMPARES
	public int counterOdd() {
		for(int i = 0; i < vUser.length; i++) {
			if(vUser[i] % 2 != 0) {
				odd++;
			}
		}
		vOdd = new int[odd];
		return odd;
	}
	
	//	IDENTIFICANDO NUMEROS IMPARES
	public int[] whichOdd() {
		int cFromvOdd = 0;
		
		for(int i = 0; i < vUser.length; i++) {
			if(vUser[i] % 2 != 0) {
				vOdd[cFromvOdd] = vUser[i];
				cFromvOdd++;
			}
		}
		return vOdd;
	}
}
