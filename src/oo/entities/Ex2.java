package oo.entities;

public class Ex2 {
	
	public String getDescricaoDiaSemana(int day) {
		switch(day) {
			case 1:
				return "Domingo";
			case 2:
				return "Segunda-feira";
			case 3:
				return "Ter�a-feira";
			case 4:
				return "Quarta-feira";
			case 5:
				return "Quinta-feira";
			case 6:
				return "Sexta-feira";
			case 7:
				return "S�bado";
			default:
				return "Dia inv�lido. Por favor, tente novamente.";
		}
	}

}
