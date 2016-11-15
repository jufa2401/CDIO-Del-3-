package entity;
//Bør rettes!
public class Player {

	private String name;
	private int balance, fieldnumber ;
	
	//Constructor:
	public Player(String name, int balance){
		this.name = name;
		this.balance = balance;
		//		hasLost = false;
		//		fleetsOwned = 0;
	}
	//getters and setters. 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getBalance() {
		return balance;
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
//	Metode til skattebetaling, returnerer ændret balance
	public int taxDeduction(int rate){
		balance = (balance * (100-rate))/100;
		return balance;
	}
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






