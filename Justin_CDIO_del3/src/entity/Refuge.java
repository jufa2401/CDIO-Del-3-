package entity;

public class Refuge extends Field {
private int bonus;
	public Refuge(int fieldNumber, String fieldName, int bonus) {
		super(fieldNumber, fieldName);
		
		this.bonus = bonus;
	}

	@Override
	void landOnField(Player player) {
		player.Transaction(this.bonus);
//		output bør indsættes her for at angive at spilleren har modtaget penge
	}

	
		
	}


