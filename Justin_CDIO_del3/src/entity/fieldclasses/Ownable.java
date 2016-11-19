package entity.fieldclasses;

import entity.Player;

/*
 * Ownable er en underklasse til Fieldklassen,
 * som er superklasse til alle felter der kan ejes
 * Ownable indeholder således alle de metoder, den arver fra Field
 * og de metoder som kun er generelle,
 * for de felter der kan ejes.
 */
public abstract class Ownable extends Field {
	int price;
	Player owner;

	public Ownable(int fieldNumber, String fieldName, int price) {
		super(fieldNumber,fieldName);

		this.price = price;
		this.owner = null;


		// TODO Auto-generated constructor stub
	}

	public Player getOwner() {
		return owner;
	}
	public void setOwner(Player owner) {
		this.owner = owner;
	}
// if (player.hasLost =true 




}
