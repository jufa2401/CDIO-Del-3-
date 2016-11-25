package entity.fieldclasses;
import java.awt.Color;

import entity.Player;

/**
 * @author janus
 *
 */
/**
 * @author janus
 *
 */
public abstract class Field {
	private int ID;
	private Color color;
	/**
	 * Constructor som laver et felt.
	 * @param fieldNumber
	 * @param color
	 */
	public Field(int fieldNumber, Color color) {
		this.ID = fieldNumber;
		this.color = color;
	}
	public int[] getTax(int balance) {
		int[] tax = {0,0}; 
		return tax;
	}


	/**
	 * @return
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @return
	 */
	public Color getColor() {
		return color;
	}

	/*
	 * Defineres til at hente rent og price fra Fieldklassen. 
	 * Det bliver smart når vi skal lave referencer i vores GUI-array
	 * Alle underklasserne har denne metode med, selvom de ikke bruger dem
	 * De vil returnere med 0, hvis de ikke skal bruge dem.
	 * Definerer type til at genkende felternes type fra hinanden.
	 */
	public abstract int getRent();
	public abstract int getPrice();
	public abstract int getType();


	/**
	 * @param player
	 * @return
	 */
	public abstract int landOnField(Player player);

	/**
	 * @param player
	 * @param taxRate
	 * @return
	 */
	public int landOnField(Player player, int taxRate) {
		return 0;
	}
	
	/**
	 * @return
	 */
	public int getTaxAmount() {
		return 0;
	}
	
	public int getTaxRate() {
		return 0;
	}

}




