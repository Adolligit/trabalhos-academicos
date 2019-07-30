package array;

import java.util.Scanner;

public class Ex8 {

	/*
	 * Ler dados e depois imprimi-los a parti da busca do usuário pelo nome do cliente.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[30];
		int[] phone = new int[30];
		String[] local = new String[30];
		
		System.out.println("Cadastre os cliente na ordem a seguir:");
		
		for(int i = 0; i < name.length; i++) {
			System.out.printf("*	%dº	*%n", i+1);
			System.out.print("Nome: ");
			name[i] = sc.nextLine();
			
			System.out.print("Telefone: (11) ");
			phone[i] = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Endereço: ");
			local[i] = sc.nextLine();
			System.out.println();
		}
		
		System.out.println("_____________________________");
		System.out.print("Buscar: ");
		String search = sc.nextLine();
		System.out.println();
		
		int amount = 0;
		for(int i = 0; i < name.length; i++) {
			if(name[i].indexOf(search) > -1) {
				System.out.printf("*	%dº	*%n", i+1);
				System.out.printf("Nome: %s.%n", name[i]);
				System.out.printf("Telefone: %d.%n", phone[i]);
				System.out.printf("Endereço: %s.%n", local[i]);
				System.out.println();
			}else {
				System.out.printf("O cliente '%s' não foi encontrado.", search);
			}
			amount++;
		}
		System.out.printf("Resultado: %d cadastro(s) encontrado(s).%n", amount);
		
		sc.close();
		
	}

}
