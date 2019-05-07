package repeat;

import java.util.Locale;
import java.util.Scanner;

public class Exx12{
	/*
		Ler dados do usuário,
		calcular seu salário de acordo com algumas condições,
		imprimir seu novo salário.
		No final mostrar o valor acrescido na folha de pagamento.

	*/

	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double payroll = 0;

		for(int i = 0; i < 584; i++){
			double readjust = 0;

			System.out.print("Nome: ");
			String name = sc.nextLine();

			System.out.print("Salário: U$");
			double salary = sc.nextDouble();

			System.out.print("Salário mínimo: U$");
			double minimumWage = sc.nextDouble();
			sc.nextLine();

			if(salary < minimumWage*3){
				readjust = salary*0.5;
				salary += readjust;
			}else if(salary >= minimumWage*3 && salary <= minimumWage*10){
				readjust = salary*0.2;
				salary += readjust;
			}else if(salary > minimumWage*10 && salary <= minimumWage*20){
				readjust = salary*0.15;
				salary += readjust;
			}else{
				readjust = salary*0.1;
				salary += readjust;
			}

			payroll += readjust;

			System.out.println();
			System.out.println(":::Cadastro atualizado:::");
			System.out.println("Nome: " + name);
			System.out.println("Reajuste: U$" + readjust);
			System.out.println("Salário: U$" + salary);
			System.out.println();
		}

		System.out.printf("Valor acrescido na folha de pagamento: U$%.2f%n", payroll);

		sc.close();
	}

}