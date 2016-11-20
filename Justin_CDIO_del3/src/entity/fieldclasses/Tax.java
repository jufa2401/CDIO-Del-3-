package entity.fieldclasses;
import java.awt.Color;
import entity.Player;

/*
 * Man kan ikke eje tax og dens superklasse er derfor Field.	
 * Når man lander på dette felt,
 * skal man betale en pris.
 * Prisen er den mindste af enten
 * den faste betalingssum, eller skatteprocenten.
 */
public class Tax extends Field{
	private int taxAmount, taxRate;	
	public Tax(int fieldNumber, Color color, int taxAmount, int taxRate) {
		super(fieldNumber, color);
		this.taxAmount = taxAmount;
		this.taxRate = taxRate;
	}

	@Override
	public void landOnField(Player player) {
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

	@Override
	public int getRent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
