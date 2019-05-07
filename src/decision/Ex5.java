package decision;

import java.util.Locale;
import java.util.Scanner;

public class Ex5{
	//Aumentar salário do funcioário.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe seu salário: U$");
		double salary = sc.nextDouble();

		if(salary > 2400.01){
			salary += salary * 0.15;
		}else if(salary > 1100.01){
			salary += salary * 0.20;
		}else if(salary > 600.01){
			salary += salary * 0.25;
		}else{
			salary += salary * 0.30;
		}

		System.out.println("Salário com aumento: U$" + salary);

		sc.close();
	}
}