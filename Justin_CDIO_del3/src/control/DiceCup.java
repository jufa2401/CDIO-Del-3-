package control;

import entity.Die;


public class DiceCup {
	
	
	//Creates 2 dice objects. 
	Die d1 = new Die();
	Die d2 = new Die();
		
	/**
	 * Method rollDiceCup returns the sum of the two dice objects. 
	 * @return
	 */
	public int rollDiceCup(){
		int v1 = d1.roll();
		int v2 = d2.roll();
		return v1+v2;
		
	}
	
}
