  package boundary.language;

  	import entity.GameBoard;

	public interface LanguageDefinitions {

	
	public String getFieldName(int id, GameBoard gb);
	
	public String getFieldRent(int id, GameBoard gb);
	
	public String getFieldPrice(int id, GameBoard gb);

	public String getFieldDescription(int id, GameBoard gb);

	public String notifyLangChange();

	public String AskHowManyPlayer();

	public String AskForPlayerName();
	
	public String askBuyField();

	public String no();

	public String yes();

	public String getOkMove(String s);

	public String Ok();

	public String GameOver(String winner);

	public String playerPayTo(String payer, String recipient, int paid);
	
}