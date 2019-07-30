package array;

import java.util.Scanner;

public class Exx12 {

	/*
	 * Crie um vetor com as posições defenidas pelo usuário e que armazene nomes.
	 * Faça as funções a seguir:
	 * ===== MENU =====
	 * 1) - Cadastrar nome
	 * 2) - Pesquisar nome
	 * 3) - Listar todos os nomes
	 * 0) - Sair do programa
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;

		System.out.print("Quantos clientes você quer cadastrar? ");
		int client = sc.nextInt();
		sc.nextLine();
		String[] name = new String[client];

		System.out.println();

		System.out.println("Informe o nome do cliente na ordem a seguir.");
		for (int i = 0; i < name.length; i++) {
			System.out.printf("%dº: ", i + 1);
			name[i] = sc.nextLine();
		}

		do {
			System.out.println();
			System.out.println("======Menu======");
			System.out.println("1) Cadastrar");
			System.out.println("2) Pesquisar");
			System.out.println("3) Listar");
			System.out.println("4) Sair");
			System.out.print(">");
			int swt = sc.nextInt();
			sc.nextLine();
			System.out.println("===============");

			System.out.println();

			switch (swt) {
			/*
			 * CADASTRANDO NOVO NOME
			 */
			case 1:
				System.out.print("Em qual posição você gostaria de inseri-lo? ");
				int pos = sc.nextInt();
				sc.nextLine();

				if (pos > 0 && pos <= client) {
					System.out.print("Nome: ");
					String insertName = sc.nextLine();

					System.out.println();

					System.out.printf(
							"ATENÇÃO: Sua lista tem um limite de %d posições. Caso continue, o nome '%s' será substituído.%n",
							client, name[pos - 1]);
					System.out.print("Você tem certeza em continuar? (s/n)");
					char answer = sc.next().charAt(0);
					if (answer == 's') {
						name[pos - 1] = insertName;
						System.out.println();
						
						System.out.println("Cadastro realizado com sucesso!");
					}
				} else {
					System.out.println();

					System.out.printf("Não há posição %d na sua lista. Por favor, tente novamente.%n", pos);
				}
				break;
			case 2:
				/*
				 * FAZENDO PESQUISA POR NOME
				 */
				int amount = 0;

				System.out.print("Nome: ");
				String search = sc.nextLine();
				System.out.println();

				for (int i = 0; i < name.length; i++) {
					if (name[i].indexOf(search) > -1) {
						amount++;
						System.out.printf("Posição: %dª.%n", i + 1);
						System.out.printf("Nome: %s.%n", name[i]);
						System.out.println();
					}
				}
				System.out.printf("%d cadastro(s) encontrado(s).%n", amount);
				System.out.println();
				System.out.println("Pesquisa realizada com sucesso!");
				break;
			case 3:
				/*
				 * LISTANDO NOMES
				 */
				for (int i = 0; i < name.length; i++) {
					System.out.printf("%d: %s.%n", i + 1, name[i]);
				}
				System.out.println();
				System.out.println("Listagem realizada com sucesso!");
				break;
			case 4:
				/*
				 * SAINDO DO LAÇO/PROGRAMA.
				 */
				System.out.println("Obrigado por utilizar nossos serviços. Seja sempre bem-vindo!");
				exit = true;
				break;
			default:
				System.out.println("Opção invalída! Por favor, tente novamente.");
				break;
			}
		} while (!exit);
		sc.close();
	}

}
