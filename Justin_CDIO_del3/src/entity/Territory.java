package entity;
import boundary.*;

public class Territory extends Ownable{
	int rent;
	public Territory(int fieldNumber,String fieldName, int price, int rent) {
		super(fieldNumber, fieldName, price);
		this.rent = rent;


		
	}
	
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
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
	void landOnField(Player player) {
		if (owner != null){
			player.payTo(owner, rent);
		} else if (player.getBalance()>price) {
			super.landOnField(player);
			Screen.println(ULang.askBuyField(player.getBalance(), price));
			if (Keyboard.waitForYesNo()) {
				player.Transaction(-price);
				setOwner(player);
				
			}
		}
	}


}
