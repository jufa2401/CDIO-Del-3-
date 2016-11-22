package rungame;
import controller.Controller;
import boundary.GUIHandler;
import boundary.language.LanguageHandler;
import entity.GameBoard;
import entity.PlayerList;
public class Main {
	public static void main (String[]args) {
		GameBoard game = new GameBoard();
		GUIHandler GUI = new GUIHandler();
//		Sætter sproget til dansk, flere sprog kan udvikles i language pakken, ved at implemente
		LanguageHandler language = new LanguageHandler("Dansk");
		//		PlayerList playerList = new PlayerList();
		GUI.createGameBoard(game, language);
		int playerCount = GUIHandler.getInteger(language.AskHowManyPlayers(), 2, 6);
		PlayerList playerList = new PlayerList(playerCount);
		for (int i = 0; i < playerCount; i++)
		{
			String name;
			do {
				name = GUIHandler.getString(language.askForPlayerName());
			} while (playerList.isNameUsed(i,name));
			playerList.addPlayer(i, name);
			GUIHandler.addPlayer(playerList.getPlayer(i));
		}
		Controller GameController = new Controller(game);
		GameController.launchGame();
	}
}


