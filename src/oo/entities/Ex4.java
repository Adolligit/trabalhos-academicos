package oo.entities;

public class Ex4 {
	
	public String getDescricao(int cod) {
		switch(cod) {
		case 100:
			return "X-Salada com coca-cola.";
		case 200:
			return "Hot dog com suco de laranja.";
		case 300:
			return "Sanduiche natural com suco de uva.";
		case 400:
			return "Misto quente com fanta laranja.";
		case 500:
			return "P�o com manteiga com caf�.";
		case 600:
			return "P�o com manteiga na chapa e caf� com leite.";
		default:
			return "C�digo informado � inv�lido.";
		}
	}

}
