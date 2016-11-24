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
	public int landOnField(Player player) {
		int payment = this.taxAmount;
		player.Transaction(-payment);
		return payment;
	}
// Overload metode
	@Override
	public int landOnField(Player player, int rate) {
		int balance = player.getBalance();
		//			Vi beregner assets som resterende penge på kontoen, det kunne have inkluderet værdien af ejendomme
		//			Dette kan evt. implementeres senere
		int payment = rate*balance/100;
		player.Transaction(-payment);
		return payment;
	}

		@Override
	public int getRent() {
		return 0;
	}

	@Override
	public int getPrice() {
		return 0;
	}

	@Override
	public int getType() {
		return 4;	// Tax
	}
	
	@Override
	public int getTaxAmount() {
		return taxAmount;
	}

	@Override
	public int getTaxRate() {
		return taxRate;
	}

}
