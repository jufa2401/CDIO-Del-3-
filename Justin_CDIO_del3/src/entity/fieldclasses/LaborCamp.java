package entity.fieldclasses;
import java.awt.Color;

/* Denne type felt har en pris,
 * som kan betales for ejerskab.
 * Hvis man lander på en LaborCamp som er ejet,
 * skal man betale en variabel leje til ejeren.
 * Lejen er bestemt efter terningøjesummen,
 * og antal af LaborCamps udlejeren ejer.
 */
import entity.Player;
public class LaborCamp extends Ownable {
	int rent, LaborCampsOwned;

	public LaborCamp(int fieldNumber, Color color, int price) {
		super(fieldNumber, color, price);
	}

	@Override
	public int landOnField(Player player) {
		int paid = 0;
		if (this.owner != null){
			LaborCampsOwned = this.owner.getFleetsOwned();
			switch (LaborCampsOwned) {
			case 1: rent = 100*player.getDiceSum();						break;
			case 2: rent = LaborCampsOwned * 100*player.getDiceSum();	break;
			default: break;
			}
			player.payTo(this.owner, paid);
			paid = rent;

		}
		return paid;		
	}

	@Override
	public void buyField(Player player) {
		super.buyField(player);
		player.setLaborCampsOwned(1+player.getLaborCampsOwned());
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

	@Override
	public int getType() {
		return 2;	// Labor Camp
	}
}
