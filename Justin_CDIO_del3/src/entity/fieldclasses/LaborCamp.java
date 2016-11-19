package entity.fieldclasses;
/* Denne type felt har en pris,
 * som kan betales for ejerskab.
 * Hvis man lander på en LaborCamp som er ejet,
 * skal man betale en variabel leje til ejeren.
 * Lejen er bestemt efter terningøjesummen.
 */
import entity.Player;
public class LaborCamp extends Ownable {
	/**
	 * @param FieldName
	 * @param price
	 * @param owner
	 */
	public LaborCamp(int fieldNumber,String fieldName, int price) {
		super(fieldNumber,fieldName, price);
		/*
		 * Vi vil gerne hente terningsummen
		 * fra vores dicecup klasse
		 */



		// TODO Auto-generated constructor stub
	}

	@Override
	void landOnField(Player player) {
		if (owner != null){
			int rent = 100*player.getDiceSum();
			player.payTo(owner, rent);
		} else if (player.getBalance()>price) {
			super.landOnField(player);
			//			Her skal vi udvide så spilleren har et valgt, så han ikke bare køber automatisk

			//	!!!		Vi må ikke hente fra boundary klasserne ind i entitetsklasserne
			//			Screen.println(ULang.askBuyField(player.getBalance(), price));
			//			if (Keyboard.waitForYesNo()) {
			player.Transaction(-price);
			setOwner(player);

		}		

	}
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRent() {
		// Kan evt. udvides til at returnere 100 gange terningkast
		return 0;
	}


}
