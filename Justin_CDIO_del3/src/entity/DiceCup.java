package entity;
import entity.Die;
public class DiceCup {


	//Creates 2 dice objects. 
	protected static Die d1 = new Die();
	protected static Die d2 = new Die();

	/**
	 * Method rollDiceCupolls the two dice objects. 
	 * @return
	 */
	public void rollDiceCup() {
		d1.roll();
		d2.roll();	
	}

	public int[] getDiceValue()	{
		int[] array = {d1.getValue(), d2.getValue()};
		return array;
	}	

	/**
	 * Method getDiceSum returns the sum of the two dice objects. 
	 * @return
	 */
	public int getDiceSum()	{
		return d1.getValue() + d2.getValue();
	}	

}
