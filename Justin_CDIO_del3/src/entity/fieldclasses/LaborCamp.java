package entity.fieldclasses;
import java.awt.Color;

/* Denne type felt har en pris,
 * som kan betales for ejerskab.
 * Hvis man lander på en LaborCamp som er ejet,
 * skal man betale en variabel leje til ejeren.
 * Lejen er bestemt efter terningøjesummen.
 */
import entity.Player;
public class LaborCamp extends Ownable {

	public LaborCamp(int fieldNumber, Color color, int price) {
		super(fieldNumber, color, price);
		/*
		 * Vi vil gerne hente terningsummen
		 * fra vores dicecup klasse
		 */
	}

	@Override
	public int landOnField(Player player) {
		int paid = 0;
		if (this.owner != null){
			paid = 100*player.getDiceSum();
			player.payTo(this.owner, paid);
//		} else if (player.getBalance()>price) {
//			super.landOnField(player);
			//			Her skal vi udvide så spilleren har et valgt, så han ikke bare køber automatisk

			//	!!!		Vi må ikke hente fra boundary klasserne ind i entitetsklasserne
			//			Screen.println(ULang.askBuyField(player.getBalance(), price));
			//			if (Keyboard.waitForYesNo()) {
//			player.Transaction(-price);
//			setOwner(player);
		}
		return paid;		

	}
	@Override
	public int getPrice() {
		return this.price;
	}

	@Override
	public int getRent() {
		// Kan evt. udvides til at returnere 100 gange terningkast
		return 0;
	}


}
