package entity;

public class Territory extends Ownable{
	int rent;
	public Territory(int fieldNumber,String fieldName, int price, int rent) {
		super(fieldNumber, fieldName, price);
		this.rent = rent;


	}
	public int getRent() {
		return rent;
	}


}
