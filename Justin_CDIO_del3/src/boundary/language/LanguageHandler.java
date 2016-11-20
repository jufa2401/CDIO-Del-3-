package boundary.language;

import entity.GameBoard;
import entity.Player;

public class LanguageHandler {

	private static LanguageDefinitions selectedLanguage;

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

	public String AskHowManyPlayers() {
		// TODO d stub
		return selectedLanguage.AskHowManyPlayer();
	}

	public String askForPlayerName() {
		// TODO Auto-generated method stub
		return selectedLanguage.AskForPlayerName();
	}
}