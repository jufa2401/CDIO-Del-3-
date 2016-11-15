package entity;
/* Denne type felt har en pris,
 * som kan betales for ejerskab.
 * Hvis man lander på en LaborCamp som er ejet,
 * skal man betale en variabel leje til ejeren.
 * Lejen er bestemt efter terningøjesummen.
 */

public class LaborCamp extends Ownable {
	int baseRent;

	/**
	 * @param FieldName
	 * @param price
	 * @param owner
	 */
	public LaborCamp(int fieldNumber,String fieldName, int price) {
		super(fieldNumber,fieldName, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	void landOnField(Player player) {
		// TODO Auto-generated method stub
		
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
