package entity.fieldclasses;
/*
 * Field klassen er vores øverste 'feltklasse'
 * Den beskriver metoder som er generelle for ALLE felttyper.
 * Vi har valgt at lave en fieldnumber, da vi i udvi
 */
import boundary.Screen;
import boundary.ULang;
import entity.Player;

public abstract class Field {
	private String name;
	private int number;

	// Constructor used to create fields: 
	public Field(int fieldNumber, String fieldName){
		super();
		this.name = fieldName; 
		this.number = fieldNumber;
	}

	public int getNumber() {
		return number;
	}


	/**
	 * The getFName method returns the String name of the field. 
	 * @return
	 */
	public String getfieldName(){
		return name;
	}

	void landOnField(Player player){
		Screen.println(ULang.LandOnText(name));

	}
}





