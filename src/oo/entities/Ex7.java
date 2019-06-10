package oo.entities;

public class Ex7 {

	public String getCategoria(int age) {
		if(age >= 21 && age < 26) {
			return "Profisional.";
		}else if(age >= 16 && age < 21) {
			return "Junior.";
		}else if(age >= 11 && age < 16) {
			return "Juvenil.";
		}else if(age >= 5 && age < 11) {
			return "Infantil.";
		}else {
			return "não há uma categoria para sua faixa etária.";
		}
	}
}
