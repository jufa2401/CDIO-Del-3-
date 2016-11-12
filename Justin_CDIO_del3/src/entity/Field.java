package entity;

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

	//	Kaldes n�r en spiller lander et felt
	public void LandOn (Player player){
	}

	abstract int getRent();
	abstract int getPrice();
	abstract void landOnField(Player player);

}




