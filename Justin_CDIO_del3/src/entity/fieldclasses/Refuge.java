package entity.fieldclasses;

import entity.Player;

public class Refuge extends Field {
private int bonus;
	public Refuge(int fieldNumber, int bonus) {
		super(fieldNumber);
		
		this.bonus = bonus;
	}

	@Override
	void landOnField(Player player) {
		player.Transaction(this.bonus);
//		output bør indsættes her for at angive at spilleren har modtaget penge
	}


	@Override
	public int getRent() {
		return 0;
	}

	@Override
	
	public int getPrice() {
		return 0;
	}

	
		
	}


