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
	/* (non-Javadoc)
	 * @see entity.fieldclasses.Field#landOnField(entity.Player)
	 * Når man lander på refuge modtager man en sum penge 
	 */
	@Override
	public int landOnField(Player player) {
		player.Transaction(this.bonus);
//	minus, minus giver plus
		return -this.bonus;
	}


	@Override
	public int getRent() {
		return bonus;
	}

	@Override
	
	public int getPrice() {
		return 0;
	}

	@Override
	public int getType() {
		return 3;	// Refuge
	}
	
}


