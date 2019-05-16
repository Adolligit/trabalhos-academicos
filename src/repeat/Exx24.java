package repeat;

import java.util.Scanner;

public class Exx24 {
	
	/* 
	 * 
	 * Ler dados do usu�rio e verificar se esta apto a concess�o de seguro.
	 * Verificar em qual dos grupos de riscos o usu�rio est� e por fim imprimir
	 * alguns de seus dados e o seguro no qual possui disponibilidade de aquisi��o.
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char a;
		
		do {
			int age = 0, opt = 0, group = 0;
			
			System.out.println();
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("ATEN��O: Somente pessoas entre 17 e 70 anos podem adquirir os seguros!");
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			
			System.out.print("Nome completo: ");
			String name = sc.nextLine();
			
			while(age < 17 || age  > 70) {
				System.out.print("Idade: ");
				age = sc.nextInt();	
			}
			
			System.out.println("Baixo[1] | M�dio[2] | Alto[3]");
			
			while(group == 0) {
				System.out.print("Digite o n�mero do seu grupo de risco: ");
				opt = sc.nextInt();
				
				switch(opt) {
					// baixo
					case 1:
						if(age > 64) {
							group = 7;
						}else if(age > 34) {
							group = 4;
						}else if(age > 24) {
							group = 3;
						}else if(age > 20) {
							group = 2;	
						}else {
							group = 1;
						}
						break;
					// m�dio
					case 2:
						if(age > 64) {
							group = 8;
						}else if(age > 34) {
							group = 5;
						}else if(age > 24) {
							group = 4;
						}else if(age > 20) {
							group = 3;	
						}else {
							group = 2;
						}
						break;
					// alto
					case 3:
						if(age > 64) {
							group = 9;
						}else if(age > 34) {
							group = 6;
						}else if(age > 24) {
							group = 5;
						}else if(age > 20) {
							group = 4;	
						}else {
							group = 3;
						}
						break;
					default:
						System.out.println();
						System.out.println("Op��o inv�lida!");
						System.out.println();
						break;	
				}
			}
			
			
			System.out.println();
			System.out.println(":::::R E S U L T A D O:::::");
			System.out.printf("Nome: %s.%n", name);
			System.out.printf("Idade: %d.%n", age);
			System.out.printf("N� do seguro: %d.%n", group);
			
			System.out.println();
			System.out.print("Voc� deseja consultar um novo perfil? ");
			a = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.println();
			
		}while(a != 'n');
		
		sc.close();
	}

}
