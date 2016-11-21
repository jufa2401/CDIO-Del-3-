package entity.fieldclasses;
import java.awt.Color;
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

	public Ownable(int fieldNumber, Color color, int price) {
		super(fieldNumber, color);

		this.price = price;
		this.owner = null;
	}

	public Player getOwner() {
		return owner;
	}
	public void setOwner(Player owner) {
		this.owner = owner;
	}
	
	public void buyField(Player player) {
		player.Transaction(-price);
		setOwner(player);
	
	}
// if (player.hasLost =true 




}
