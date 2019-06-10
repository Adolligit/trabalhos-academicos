package oo.entities;

public class Ex3 {
	
	public double calculaAumentoSalario(double salary) {
		if(salary > 3350) {
			return salary = salary + salary * 0.1;
		}else if(salary  >  2400.01) {
			return salary = salary + salary * 0.15;
		}else if(salary > 1100.01) {
			return salary = salary + salary * 0.20;
		}else if(salary > 600.01) {
			return salary = salary + salary * 0.25;
		}else {
			return salary = salary + salary * 0.30;
		}
	}

}
