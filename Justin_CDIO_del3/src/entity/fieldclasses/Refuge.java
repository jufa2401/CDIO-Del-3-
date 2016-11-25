package entity.fieldclasses;
import java.awt.Color;

import entity.Player;
//TODO: Meddelelse om modtagelse af penge
public class Refuge extends Field {
private int bonus;

	/** Constructor til Refuge felter.
	 * @param fieldNumber
	 * @param color
	 * @param bonus
	 */
	public Refuge(int fieldNumber, Color color, int bonus) {
		super(fieldNumber, color);
		this.bonus = bonus;
	}

	/**
	 *  Hvis man lander på en Refuge
	 *  får man udbetalt en bonus
	 */
	@Override
	public int landOnField(Player player) {
		player.Transaction(this.bonus);
//	betalte beløb er positivt, derfor er det udbetalte beløb negativt
		return -this.bonus;
	}

	/**
	 *  ikke relevant idet feltet ikke er ownable
	 */
	@Override
	public int getRent() {
		return bonus;
	}

	/**
	 *  ikke relevant idet feltet ikke er ownable
	 */
	@Override
	public int getPrice() {
		return 0;
	}

	/**
	 * Returnerer unik id, 
	 * som identificerer denne klasse som Refuge
	 */
	@Override
	public int getType() {
		return 3;	// Refuge
	}
	
}


