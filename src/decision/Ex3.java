package decision;

import java.util.Locale;
import java.util.Scanner;

public class Ex3{
	//Validar senha digitada
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Senha: ");
		String password = sc.next();

		if(!password.equals("MinhaSenha")){
			System.out.println("Você não tem acesso ao sistema.");
		}
		else{
			System.out.println("Acesso permitido.");
		}

		sc.close();
	}
}