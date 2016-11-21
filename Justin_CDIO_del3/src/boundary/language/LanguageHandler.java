package boundary.language;

import entity.GameBoard;
import entity.Player;

public class LanguageHandler {

	private static LanguageDefinitions selectedLanguage;
	public String getFieldDescription(int id, GameBoard gb){
		return selectedLanguage.getFieldDescription(id, gb);
		
	}
	

	public LanguageHandler(String language) {
		setLanguage(language);
	}

	public void setLanguage(String language) {
		switch(language) {
		case "Dansk": selectedLanguage = new Dansk(); break;
//		case "English": selectedLanguage = new English(); break;
		default: selectedLanguage = new Dansk();
		}
	}

	/**
	 * Notifies of language change
	 * @return String
	 */
	public String notifyLangChange(){
		return selectedLanguage.notifyLangChange();
	}

	public String getFieldName(int id, GameBoard gb) {
		return selectedLanguage.getFieldName(id, gb);
	}

	public String getFieldPrice(int id, GameBoard gb) {
		return selectedLanguage.getFieldPrice(id, gb);
	}
	
	public String getFieldRent(int id, GameBoard gb) {
		return selectedLanguage.getFieldRent(id, gb);
	}

	public String AskHowManyPlayers() {
		// TODO d stub
		return selectedLanguage.AskHowManyPlayer();
	}

	public String askForPlayerName() {
		// TODO Auto-generated method stub
		return selectedLanguage.AskForPlayerName();
	}

	public static String askBuyField() {
		return selectedLanguage.askBuyField();
	}


	public static String no() {
		return selectedLanguage.no();
	}


	public static String yes() {
		return selectedLanguage.yes();
	}


	public static String GetOkMove(Player player) {
		
		return selectedLanguage.getOkMove(player);
	}


	public static String Ok() {
		return selectedLanguage.Ok();
	}


	public static String GameOver(String winner) {
		return selectedLanguage.GameOver(winner);
	}


	public static String playerPayTo(String payer, String recipient, int paid) {
		return selectedLanguage.playerPayTo(payer, recipient, paid);
	}
}