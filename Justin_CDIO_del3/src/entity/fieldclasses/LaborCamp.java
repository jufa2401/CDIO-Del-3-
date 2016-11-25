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

	/**Constructor til LaborCamp felt.
	 * @param fieldNumber
	 * @param color
	 * @param price
	 */
	public LaborCamp(int fieldNumber, Color color, int price) {
		super(fieldNumber, color, price);
	}

	/* (non-Javadoc)
	 * @see entity.fieldclasses.Field#landOnField(entity.Player)
	 */
	@Override
	public int landOnField(Player player) {
		int rent = 0;
		if (this.owner != null){
			LaborCampsOwned = this.owner.getLaborCampsOwned(); 
			rent = LaborCampsOwned * 100*player.getDiceSum();			
			}
		player.payTo(this.owner, rent); 
		return rent;		
	}
	

	/* (non-Javadoc)
	 * @see entity.fieldclasses.Ownable#buyField(entity.Player)
	 */
	@Override
	public void buyField(Player player) {
		super.buyField(player);
		player.setLaborCampsOwned(1+player.getLaborCampsOwned());
	}


	/* (non-Javadoc)
	 * @see entity.fieldclasses.Field#getPrice()
	 */
	@Override
	public int getPrice() {
		return this.price;
	}

	/* (non-Javadoc)
	 * @see entity.fieldclasses.Field#getRent()
	 */
	@Override
	public int getRent() {
		// Kan evt. udvides til at returnere 100 gange terningkast
		return 0;
	}

	/* (non-Javadoc)
	 * @see entity.fieldclasses.Field#getType()
	 */
	@Override
	public int getType() {
		return 2;	// Labor Camp
	}
}
