package oo.entities;

public class Ex8 {

	public double getValorDaCompra(int choose, double purchasePrice) {
		switch (choose) {
			case 1:
				return purchasePrice = purchasePrice - purchasePrice * 0.1;
			case 2:
				return purchasePrice = purchasePrice - purchasePrice * 0.05;
			case 3:
				return purchasePrice;
			case 4:
				return purchasePrice = purchasePrice + purchasePrice * 0.05;
			case 5:
				return purchasePrice = purchasePrice - purchasePrice * 0.08;
			case 6:
				return purchasePrice = purchasePrice - purchasePrice * 0.07;
			default:
				return 0;
		}
	}

}
