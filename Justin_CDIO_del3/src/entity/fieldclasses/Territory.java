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
	/*	
	 *  Når spilleren lander på feltet får han muligheden for køb, hvis ikke ejet. Hvis den er ejet betaler han leje.
	 *  Vi giver kun spilleren lov til at købe ejendommen, hvis hans balance er større end prisen på ejendommen
	 *  prisen på ejendommen fratrækkes derefter balancen og ejerskabet bliver overført til spilleren
	 *  TODO: Spilleren bør ikke trække leje fra sin egen konto og tilføje dem tilbage, hvis han lander på sit eget felt.
	 */
	/**
	 * Method landOnField checker om der er ejer på et felt,
	 * hvis der er ejer på et felt, betales der til ejeren. 
	 * @return
	 */

	public int landOnField(Player player) {
		int paid = 0;
		if (this.owner != null){
			player.payTo(this.owner, rent);
			paid = rent;
		}
		return paid;
	}

	@Override
	public int getType() {
		return 5; // Territory
	}
}
