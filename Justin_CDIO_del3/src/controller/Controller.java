package controller;
import gamelogic.GameLogic;
import entity.Player;
import entity.PlayerList;
import entity.fieldclasses.Field;
import entity.DiceCup;
import boundary.GUIHandler;
import boundary.language.LanguageHandler;
import entity.GameBoard;

public class Controller {
	DiceCup dice;
	GameBoard game;
	GUIHandler GUIh;
	LanguageHandler language;
	PlayerList playerList;
	public Controller (GUIHandler GUI, LanguageHandler language, GameBoard gb, PlayerList playerList) {
		dice = new DiceCup();
		this.game = gb;
		this.GUIh = GUI;
		this.language = language;
		this.playerList = playerList;
	}

	public void launchGame() {
		//		if(boundary.getButtonPressed(language.startGame()));
		int nPlayers = playerList.getNumberofPlayer();
		while(playerList.isWinner() == false) {
			for(int i = 0; i < nPlayers; i++) {
				Player player = playerList.getPlayer(i);
				//				Checker om der er en vinder, og spiller 'i' stadig er med i spillet
				if(playerList.isWinner() == false && player.hasLost() == false)
					gameTurn(player);
			}
		}
		// Spillet er slut
		String winner = playerList.getWinner();
		GUIh.getButtonPressed(language.GameOver(winner), language.Ok());
	}

	public void gameTurn(Player player) {
		GUIh.getButtonPressed(language.GetOkMove(player.getName()), language.Ok());
		dice.rollDiceCup();
		GUIh.showDice(dice);
		GUIh.removeCar(player.getCurrentField(), player.getName());
		player.SaveDiceRoll(dice);
		int fieldNumber = player.moveToField(dice.getDiceSum(), game);
		GUIh.setCar(fieldNumber, player.getName());
		//		GUIHandler.getButtonPressed(language.fieldMsg(fieldNumber)); {
		Field field = game.getField(fieldNumber);
		boolean hasLost = player.hasLost();
		GameLogic.FieldRules(GUIh, language, fieldNumber, field, player);	
		if (!hasLost && player.hasLost() == true) {
			for (int n = 0; n <  game.getNumberOfFields(); n++) {
				if (game.removeFieldOwner(n, player) == true)
					GUIh.removeOwner(n);
			}
			GUIh.removeCar(fieldNumber, player.getName());
		}

	}
}
