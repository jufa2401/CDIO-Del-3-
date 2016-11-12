package entity;

public class Account {
	private int balance;

	//Constructor: Created a new account instance.
	public Account (int balance){
		this.balance = balance;
	}
	/**
	 * getBalance returns the balance of the account instance.
	 * @return
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * addToCurrentBalance adds amount to the total balance and returns the new balance, note that the balance cannot be negative. 
	 * @param amount
	 * @return
	 */
	public int addToCurrentBalance(int amount){
		balance = balance + amount;
		if(balance < 0){
			balance = 0;
		}return balance;
	}			
	public int taxDeduction(int rate){
		balance = (balance * (100-rate))/100;
			return balance;
	}
}

