package decision;

import java.util.Locale;
import java.util.Scanner;

public class Exx12{
	//Validar acesso e informar mensagem.
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Senha: ");
		String pass = sc.next();

		if(pass.equals("batatafrita")){
			System.out.println("Acesso permitido.");
		}else{
			System.out.println("Você não tem acesso ao sistema.");
		}

		sc.close();
	}
}