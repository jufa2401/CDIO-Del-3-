package entity.fieldclasses;
import entity.Player;

public abstract class Field {
	private String name;
	private int ID;

	// Constructor der skaber felter 
	public Field(int fieldIdentifier, String fieldName){
		super();
		this.name = fieldName; 
		this.ID = fieldIdentifier;
	}

	public int getID() {
		return ID;
	}


	/**
	 * The getFName method returns the String name of the field. 
	 * @return
	 */
	public String getfieldName(){
		return name;
	}
	
//	Defineres til at hente rent og price fra Fieldklassen. Det bliver smart når vi skal lave referencer i vores GUI-array
	public abstract int getRent();
	public abstract int getPrice();

	void landOnField(Player player){
//		Screen.println(ULang.LandOnText(name));

	}
}





