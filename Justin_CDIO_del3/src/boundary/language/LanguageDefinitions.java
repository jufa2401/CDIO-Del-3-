  package boundary.language;

	public interface LanguageDefinitions {
	
	public String gameRules();
	
	public String getFieldName(int index);
	
	public String getFieldRent(int rent);
	
	public String getFieldPrice(int price);

	public String getFieldDescription(int type);
	
	public String AskHowManyPlayer();

	public String AskForPlayerName();
	
	public String askBuyField();

	public String no();

	public String yes();

	public String getOkMove(String s);

	public String Ok();

	public String GameOver(String winner);

	public String playerPayTo(String payer, String recipient, int paid);
	
	

	public String playerTax(String name, int paid);

	public String playerBonus(String name, int bonus);

	public String askPayTax();
	
}