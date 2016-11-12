package entity;

public class Tax extends Field{
	private int taxAmount, taxRate;	
	public Tax(int fieldNumber, String fieldName, int taxAmount, int taxRate) {
		super(fieldNumber, fieldName);
		this.taxAmount = taxAmount;
		this.taxRate = taxRate;
	}

	@Override
	void landOnField(Player player) {
		int payment;
		if (taxRate <= 0) {
			payment = taxAmount;
		} else { 
			int balance = player.getBalance();
//			Vi beregner assets som resterende penge på kontoen, det kunne have inkluderet værdien af ejendomme
//			Dette kan evt. implementeres senere
			payment = taxRate* balance/100;
			if (taxAmount < payment) {
				payment = taxAmount;
			}
		}
		player.Transaction(-payment);
//		Tilføj output om skattebetaling og ændret balance
	}

}
