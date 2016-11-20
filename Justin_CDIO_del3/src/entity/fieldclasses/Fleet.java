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
public class Fleet extends Ownable {
	int rent, fleetsOwned;


	/**
	 * @param FieldName
	 * @param price
	 * @param owner
	 */
	public Fleet(int fieldNumber, Color color, int price) {
		super(fieldNumber, color, price);
		// TODO Auto-generated constructor stub
	}


	@Override
	void landOnField(Player player)  {
		if (owner != null){
			fleetsOwned = owner.getFleetsOwned();
			switch (fleetsOwned) {
			case 1: rent = 500;		break;
			case 2: rent = 1000;	break;
			case 3: rent = 2000;	break;
			case 4: rent = 4000;	break;
			default: break;
			}
			player.payTo(owner, rent);
		} else if (player.getBalance()>price) {
			super.landOnField(player);
			//			Her skal vi udvide så spilleren har et valgt, så han ikke bare køber automatisk

			//	!!!		Vi må ikke hente fra boundary klasserne ind i entitetsklasserne
			//			Screen.println(ULang.askBuyField(player.getBalance(), price));
			//			if (Keyboard.waitForYesNo()) {
			player.Transaction(-price);
			//			Når man køber en fleet, tæller vi 1 op i vores FleetsOwned metode i player
			setOwner(player);
			player.setFleetsOwned(1+player.getFleetsOwned());

		}		

	}



	@Override
	public int getRent() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

}
