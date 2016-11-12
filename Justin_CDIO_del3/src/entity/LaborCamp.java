package entity;

public class LaborCamp extends Ownable {
	int baseRent;

	/**
	 * @param FieldName
	 * @param price
	 * @param owner
	 */
	public LaborCamp(int fieldNumber,String fieldName, int price) {
		super(fieldNumber,fieldName, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	void landOnField(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getRent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
