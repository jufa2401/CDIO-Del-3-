package entity;

public class Ownable extends Field {
	int price;
	String owner;
	
	public Ownable(int fieldNumber, String fieldName, int price) {
		super(fieldNumber,fieldName);
		
		this.price = price;
		this.owner = "";
		
		
		// TODO Auto-generated constructor stub
	}
	public int getRent (){
		return 0;
	}
	public int getPrice() {
		return price;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	

}
