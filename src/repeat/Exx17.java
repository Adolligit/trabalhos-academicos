package repeat;

import java.util.Scanner;

public class Exx17 {
	
	/*
	 *	Ler três valores e informar qual triângulos eles formam.
	 *	Regra: "o comprimento de cada lado de um triângulo é menor do que a 
	 *	soma dos comprimentos dos outros dois lados.".
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char answer = 's';
		
		while(answer == 's') {
			System.out.print("Informe três números: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			System.out.println();
			
			if(a + b < c || a + c < b || b + c < a) {
				System.out.println("O comprimento de um lado deve ser menor que a soma dos outros dois.");
			}else if(a == b && b == c) {
				System.out.printf("%d, %d e %d formam um triângulo Equilátero.%n", a, b, c);
			}else if(a == b || a == c || b == c) {
				System.out.printf("%d, %d e %d formam um triângulo Isóscele.%n", a, b, c);
			}else{
				System.out.printf("%d, %d e %d formam um triângulo Escaleno.%n", a, b, c);
			}
			
			System.out.println();
			System.out.print("Você gostaria de reiniciar o programa? ");
			answer = sc.next().charAt(0);
			System.out.println();
		}
		
		sc.close();
	}

}
