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
			return "Pão com manteiga com café.";
		case 600:
			return "Pão com manteiga na chapa e café com leite.";
		default:
			return "Código informado é inválido.";
		}
	}

}
