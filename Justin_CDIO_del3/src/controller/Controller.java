package controller;
import java.util.Scanner;
import gamelogic.GameLogic;
import entity.Player;
import entity.PlayerList;
import entity.fieldclasses.Field;
import entity.DiceCup;
import boundary.GUIHandler;
import entity.GameBoard;
public class Controller {
	DiceCup dice;
	GameBoard game;
	public Controller (GameBoard gb) {
		dice = new DiceCup();
		this.game = gb;
		
	}
	
	public void launchGame() {
//		if(boundary.getButtonPressed(language.startGame()));
		while(PlayerList.isWinner() == false) {
			for(int i = 0; i < PlayerList.getNumberofPlayer(); i++)
//				Checker om der er en vinder, og spiller 'i' stadig er med i spillet
				if(PlayerList.isWinner() == false && PlayerList.getPlayer(i).hasLost() == false)
					gameTurn(PlayerList.getPlayer(i));
		}
	// Spillet er slut
	//	boundary.getButtonPressed(language.winnerMsg(playerList.whoIsTheWinner()));
	}
	
	public void gameTurn(Player player) {
		//boundary.getButtonPressed(language.preMsg(player));
		dice.rollDiceCup();
		GUIHandler.showDice(dice);
		GUIHandler.removeCar(player.getCurrentField(), player.getName());
		player.SaveDiceRoll(dice);
		int fieldNumber = player.moveToField(dice.getDiceSum(), game);
		GUIHandler.setCar(fieldNumber, player.getName());
//		GUIHandler.getButtonPressed(language.fieldMsg(fieldNumber)); {
		Field field = game.getField(fieldNumber);
		GameLogic.FieldRules(field, player);	
		
	}
}

