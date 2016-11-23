package rungame;
import controller.Controller;
import desktop_resources.GUI;
import boundary.GUIHandler;
import boundary.language.LanguageHandler;
import entity.GameBoard;
import entity.PlayerList;
public class Main {
	public static void main (String[]args) {
		GameBoard game = new GameBoard();
		GUIHandler GUIh = new GUIHandler();
//		Sætter sproget til dansk, flere sprog kan udvikles i language pakken, ved at implemente
		LanguageHandler language = new LanguageHandler("Dansk");
		//		PlayerList playerList = new PlayerList();
		GUIh.createGameBoard(game, language);
		GUIh.getGameRules(language.gameRules());
		int playerCount = GUIh.getInteger(language.AskHowManyPlayers(), 2, 6);
		PlayerList playerList = new PlayerList(playerCount);
		for (int i = 0; i < playerCount; i++)
		{
			String name;
			do {
				name = GUIh.getString(language.askForPlayerName());
			} while (playerList.isNameUsed(i,name));
			playerList.addPlayer(i, name);
			GUIh.addPlayer(playerList.getPlayer(i));
		}
		Controller GameController = new Controller(GUIh, language, game, playerList);
		GameController.launchGame();
	}
}


