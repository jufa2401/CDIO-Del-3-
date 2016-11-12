package entity;

public abstract class Ownable extends Field {
	int price;
	Player owner;
	
	public Ownable(int fieldNumber, String fieldName, int price) {
		super(fieldNumber,fieldName);
		
		this.price = price;
		this.owner = null;
		
		
		// TODO Auto-generated constructor stub
	}
	abstract int getRent();
	abstract int getPrice();
	
	public Player getOwner() {
		return owner;
	}
	public void setOwner(Player owner) {
		this.owner = owner;
	}
	
	
	

}
