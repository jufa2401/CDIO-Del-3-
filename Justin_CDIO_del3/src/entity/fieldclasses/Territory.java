package entity.fieldclasses;
import java.awt.Color;
import entity.Player;
/*
 * Denne type felt har en pris,
 * som kan betales for ejerskab.
 * Hvis man lander på en LaborCamp som er ejet,
 * skal man betale en fast leje til ejeren.
 * 
 */
public class Territory extends Ownable{
	int rent;
	public Territory(int fieldNumber, Color color, int price, int rent) {
		super(fieldNumber, color, price);
		this.rent = rent;	
	}

	public int getPrice() {
		return this.price;
	}
	public int getRent() {
		return rent;
	}
	@Override
	/*	Når spilleren lander på feltet får han muligheden for køb, hvis ikke ejet. Hvis den er ejet betaler han leje.
	 *  Vi giver kun spilleren lov til at købe ejendommen, hvis hans balance er større end prisen på ejendommen
	 *  Hvis spilleren vil købe ejendommen skal han svare med J (kig i Ulang),
	 *  prisen på ejendommen fratrækkes derefter balancen og ejerskabet bliver overført til spilleren
	 *  
	 */
	public void landOnField(Player player) {
		if (owner != null){
			player.payTo(owner, rent);
//		} else if (player.getBalance()>price) {
//			super.landOnField(player);
			//
			//			Screen.println(ULang.askBuyField(player.getBalance(), price));
			//			if (Keyboard.waitForYesNo()) {
//			player.Transaction(-price);
//			setOwner(player);
		}
	}
}
