package entity.fieldclasses;
import java.awt.Color;

import entity.Player;

public abstract class Field {
	private int ID;
	private Color color;

	// Constructor der skaber felter 
	public Field(int fieldNumber, Color color) {
		this.ID = fieldNumber;
		this.color = color;
	}
	public int[] getTax(int balance) {
		int[] tax = {0,0}; 
		return tax;
	}


	public int getID() {
		return ID;
	}

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


	public abstract int landOnField(Player player);
	public int landOnField(Player player, int taxRate) {
		return 0;
	}
	
	public int getTaxAmount() {
		return 0;
	}
	
	public int getTaxRate() {
		return 0;
	}

}




