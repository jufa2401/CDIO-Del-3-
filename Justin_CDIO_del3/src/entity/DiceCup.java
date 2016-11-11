package entity;
import entity.Die;
public class DiceCup {
	
	
	//Creates 2 dice objects. 
	protected Die d1 = new Die();
	protected Die d2 = new Die();
		
	/**
	 * Method rollDiceCup returns the sum of the two dice objects. 
	 * @return
	 */
	public void rollDiceCup(){
		d1.roll();
		d2.roll();	
	}
	
	public int[] getDiceValue()
	{
		int[] array = {d1.getValue(), d2.getValue()};
		return array;
	}	
	
}
