package rungame;
import boundary.language.LanguageHandler;
import boundary.GUIHandler;
import entity.GameBoard;
import entity.PlayerList;

public class Main {
	public static void main (String[]args) {
		GameBoard spil = new GameBoard();
		GUIHandler GUI = new GUIHandler();
		LanguageHandler language = new LanguageHandler("Dansk");
		//PlayerList playerList = new PlayerList();
		GUI.createGameBoard(spil, language);
		
		PlayerList playerList = new PlayerList(boundary.getInteger(language.askForNumberOfPlayers(), 2, 6));
		for(int i = 0; i < playerList.getPlayers().length; i++)
		{
			String name;
			do {
				name = boundary.getString(language.askForPlayerName(i+1));
			} while (playerList.isNameTaken(name));
			playerList.addPlayer(i, name);
			boundary.addPlayer(playerList.getPlayer(i));
		}
	
	}

	


}


