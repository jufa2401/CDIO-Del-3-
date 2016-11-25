package entity.fieldclasses;
import java.awt.Color;

import entity.Player;

/* Denne type felt har en pris,
 * som kan betales for ejerskab.
 * Hvis man lander på en LaborCamp som er ejet,
 * skal man betale en variabel leje til ejeren.
 * Lejen er bestemt efter hvor mange af denne type ejendom man ejer
 * dvs. at du kan opkræve højere leje, jo flere 'fleets' du ejer
 */
/**
 * @author janus
 *
 */
public class Fleet extends Ownable {
	int rent, fleetsOwned;

	/**
	 * Constructor til Fleet felt objekter/instanser. 
	 * @param fieldNumber
	 * @param color
	 * @param price
	 */
	public Fleet(int fieldNumber, Color color, int price) {
		super(fieldNumber, color, price);
	}

	/* (non-Javadoc)
	 * @see entity.fieldclasses.Field#landOnField(entity.Player)
	 */
	@Override
	public int landOnField(Player player)  {
		int paid = 0;
		if (this.owner != null){
			fleetsOwned = this.owner.getFleetsOwned();
			switch (fleetsOwned) {
			case 1: rent = 500;		break;
			case 2: rent = 1000;	break;
			case 3: rent = 2000;	break;
			case 4: rent = 4000;	break;
			default: break;
			}
			player.payTo(this.owner, rent);
			paid = rent;

		}
		return paid;		

	}

	/* (non-Javadoc)
	 * @see entity.fieldclasses.Ownable#buyField(entity.Player)
	 */
	@Override
	public void buyField(Player player) {
		super.buyField(player);
		player.setFleetsOwned(1+player.getFleetsOwned());
	}

	@Override
	public int getRent() {
		return 0;
	}

	@Override
	public int getPrice() {
		return this.price;
	}

	@Override
	public int getType() {
		return 1;	// Fleet
	}
}
