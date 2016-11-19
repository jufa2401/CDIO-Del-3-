package entity;

public class Bank {
	
private int balance;

	
	public int getBalance() {
	return balance;
}

	//	Metode til overførsel af penge
	public int Transaction(int amount){
		balance = balance + amount;
		//	Hvis balancen ryger under nul bliver balancen sat til 0
		if(balance < 0){
			balance = 0;
		}return balance;
	}	
	
//	Giver muligheden for at betale til andre spillere, afslutter med at returnere den ændrede balance
	public int payTo (Player recipient, int amount) {
		recipient.Transaction(amount);
		Transaction(-amount);
		return balance;
	}

}
