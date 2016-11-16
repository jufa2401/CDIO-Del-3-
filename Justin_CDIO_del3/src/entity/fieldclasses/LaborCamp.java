package entity.fieldclasses;
/* Denne type felt har en pris,
 * som kan betales for ejerskab.
 * Hvis man lander på en LaborCamp som er ejet,
 * skal man betale en variabel leje til ejeren.
 * Lejen er bestemt efter terningøjesummen.
 */

import entity.Player;
import entity.DiceCup;
public class LaborCamp extends Ownable {
	int baseRent;

	/**
	 * @param FieldName
	 * @param price
	 * @param owner
	 */
	public LaborCamp(int fieldNumber,String fieldName, int price, int baseRent) {
		super(fieldNumber,fieldName, price);
/*
 * Vi vil gerne hente terningsummen
 * fra vores dicecup klasse
 */
		
//		baseRent = 100*(d2.getvalue + d2.getvalue);
		this.baseRent = baseRent;
		// TODO Auto-generated constructor stub
	}

	@Override
	void landOnField(Player player) {
		if (owner != null){
			player.payTo(owner, baseRent);
		} else if (player.getBalance()>price) {
			super.landOnField(player);
//	!!!		Vi må ikke hente fra boundary klasserne ind i entitetsklasserne
//			Screen.println(ULang.askBuyField(player.getBalance(), price));
//			if (Keyboard.waitForYesNo()) {
				player.Transaction(-price);
				setOwner(player);
				
			}		
		
	}

	@Override
	public int getRent() {
		// TODO Auto-generated method stub
		return baseRent;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
