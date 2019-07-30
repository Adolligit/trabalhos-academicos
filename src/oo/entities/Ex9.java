package oo.entities;

public class Ex9 {
	
	public int procuraValor(int k[], int n) {
		int result = 0;
		for(int i = 0; i < k.length; i++) {
			if(k[i] == n) result = i+1;
		}
		return result;
	}
}
