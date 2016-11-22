package boundary.language;

import entity.GameBoard;

public class LanguageHandler {

	private static LanguageDefinitions selectedLanguage;
	public String getFieldDescription(int id, GameBoard gb) {
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
		return selectedLanguage.AskHowManyPlayer();
	}

	public String askForPlayerName() {
		return selectedLanguage.AskForPlayerName();
	}

	public String askBuyField() {
		return selectedLanguage.askBuyField();
	}


	public String no() {
		return selectedLanguage.no();
	}


	public String yes() {
		return selectedLanguage.yes();
	}


	public String GetOkMove(String s) {
		return selectedLanguage.getOkMove(s);
	}


	public String Ok() {
		return selectedLanguage.Ok();
	}


	public String GameOver(String winner) {
		return selectedLanguage.GameOver(winner);
	}


	public String playerPayTo(String payer, String recipient, int paid) {
		return selectedLanguage.playerPayTo(payer, recipient, paid);
	}
}