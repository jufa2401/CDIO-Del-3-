package entity;
//Bør rettes!
public class Player {

	private String name;
	private int balance, fieldnumber, d1, d2, fleetsOwned;
	private boolean hasLost;

	//Constructor:
	public Player(String name, int balance){
		this.name = name;
		this.balance = balance;
		hasLost = false;
		fleetsOwned = 0;
	}
	//getters and setters for navn og balance 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getBalance() {
		return balance;
	}
//	Getters og setters til fleets
	public int getFleetsOwned() {
		return fleetsOwned;
	}
	public void setFleetsOwned(int fleetsOwned) {
		this.fleetsOwned = fleetsOwned;
	}

	public boolean isHasLost() {
		return hasLost;
	}
	public void setHasLost(boolean hasLost) {
		this.hasLost = hasLost;
	}
	/*
	 *  Vi laver metode til at gemme terningsummen, denne metode er lavet specifikt 
	 *  med hensyn til felter hvor aktionen er bestemt af terningsummen.
	 */
	public void SaveDiceRoll(int d1, int d2){
		this.d1 = d1;
		this.d2 = d2;
	}
	public int getDiceSum() {
		return d1 + d2;
	}
	/**
	 * addToCurrentBalance adds amount to the total balance and returns the new balance, note that the balance cannot be negative. 
	 * @param amount
	 * @return
	 */
	//	Metode til overførsel af penge
	public int Transaction(int amount){
		balance = balance + amount;
		//	Hvis balancen ryger under nul bliver balancen sat til 0
		if(balance < 0){
			balance = 0;
		}return balance;
	}	
	/*	
	 *  DEPRECATED: Metode til skattebetaling, som vi har
	 * 	valgt at rykket over (og videreudviklet) i taxfelterne  i stedet.

	public int taxDeduction(int rate){
		balance = (balance * (100-rate))/100;
		return balance;
	}
	 */

	//	Giver muligheden for at betale til andre spillere, afslutter med at returnere den ændrede balance
	public int payTo (Player recipient, int amount) {
		recipient.Transaction(amount);
		Transaction(-amount);
		return balance;
	}
	//	Getters and setters for fieldnumber
	public int getFieldnumber() {
		return fieldnumber;
	}
	public void setFieldnumber(int fieldnumber) {
		this.fieldnumber = fieldnumber;
	}


}






