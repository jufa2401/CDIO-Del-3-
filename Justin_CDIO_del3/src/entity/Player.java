package entity;
//Bør rettes!
public class Player {

	private String name;
	private boolean hasLost;
	private int fleetsOwned, laborcampsOwned;
	
	//Constructor:
	public Player(String name){
		this.name = name;
		hasLost = false;
		fleetsOwned = 0;
		setLaborcampsOwned(0);
		
		
		}

	//getters and setters. 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the laborcampsOwned
	 */
	public int getLaborcampsOwned() {
		return laborcampsOwned;
	}

	/**
	 * @param laborcampsOwned the laborcampsOwned to set
	 */
	public void setLaborcampsOwned(int laborcampsOwned) {
		this.laborcampsOwned = laborcampsOwned;
	}
	
	public void lossStatus(boolean condition) {
		hasLost = condition;
	}
	
	public
	
// Nedenstående kode refererer til "name" og "balance" fra UserLanguage klassen. 
//	
//public String toString (){
//	return (" pengebalance: " + balance);
//}
	
	
}

