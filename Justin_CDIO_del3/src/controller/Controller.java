package controller;
import java.util.Scanner;
import entity.Player;
import entity.PlayerList;
import entity.DiceCup;
import boundary.GUIHandler;

public class Controller {
	DiceCup dice;
	public Controller () {
		dice = new DiceCup();
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
		boundary.removeCar(player.getOnField(), player.getName());
		player.setLastRoll(diceCup.getSum());
		player.movePlayer(diceCup.getSum());
		int fieldNumber = player.getOnField();
		Field field = gameBoard.getField(fieldNumber);
		boundary.setCar(fieldNumber, player.getName());
		boundary.getButtonPressed(language.fieldMsg(fieldNumber));
		if(field.isOwnable()) {
			
		}
	}
}
