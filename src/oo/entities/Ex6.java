package oo.entities;

public class Ex6 {

	public String getSituacaoDoAluno(double n1, double n2, double n3) {
		
		double avg = (n1 + n2 + n3) / 3;

		if(avg > 6.9) {
			return "Aprovado.";
		}else if(avg > 5) {
			return "Em repuração.";
		}else {
			return "Reprovado.";
		}
	}

}
