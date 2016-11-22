package entity.fieldclasses;
import java.awt.Color;

import entity.Player;

public class Refuge extends Field {
private int bonus;
	public Refuge(int fieldNumber, Color color, int bonus) {
		super(fieldNumber, color);
		this.bonus = bonus;
	}

	@Override
	public int landOnField(Player player) {
		player.Transaction(this.bonus);
//		output bør indsættes her for at angive at spilleren har modtaget penge
		return -this.bonus;
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
		return 3;	// Refuge
	}

	
}


