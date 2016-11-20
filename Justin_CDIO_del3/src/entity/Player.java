package entity;
import entity.GameBoard;
public class Player {

	private String name;
	private int balance, currentField, d1, d2, fleetsOwned, Identifier;
	private boolean hasLost;
	private static int AvailableIdentifer = 0;
	//Constructor:
	public Player (String name, int balance){
		this.name = name;
		this.balance = balance;
		fleetsOwned = 0;
		hasLost = false;
		Identifier = AvailableIdentifer++;
	}
	public Player() {
		// TODO Auto-generated constructor stub
	}
	//getters and setters for navn og balance 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	 metode der tjekker om en spiller har tabt
	public boolean hasLost() {
		if (balance <= 0) {
			hasLost = true;
		}
		return hasLost;
	}
	public void setHasLost(boolean hasLost) {
		this.hasLost = hasLost;
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


	/*
	 *  Vi laver metode til at gemme terningsummen, denne metode er lavet specifikt 
	 *  med hensyn til felter hvor aktionen er bestemt af terningsummen.
	 */
	public void SaveDiceRoll(DiceCup dice){
		int[] d = dice.getDiceValue();
		this.d1 = d[0];
		this.d2 = d[1];
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
	public int getCurrentField() {
		return currentField;
	}
	
	public int moveToField(int roll, GameBoard gb) {
		int length = gb.getNumberOfFields();
		this.currentField += roll;
		while(this.currentField > length)
			this.currentField -= length+1;
		return this.currentField;
	}
	
	public int getPlayerID() {
		return this.Identifier;
	}



}






