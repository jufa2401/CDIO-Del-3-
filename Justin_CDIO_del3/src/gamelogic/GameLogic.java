package gamelogic;

import boundary.GUIHandler;
import boundary.language.LanguageHandler;
import entity.Player;
import entity.fieldclasses.*;
import entity.GameBoard;

public class GameLogic{
	public static void GameRules(int[] Dice, Player p){
//		Når en spillersbalance bliver nul, bliver hans taber status sat til sand.
		final int LossBalance = 0;
		if (p.getBalance() <= LossBalance)
			p.setHasLost(true);

	}
	public static void FieldRules(Field field, Player player) {
		if (field.getPrice() > 0) {
//			hvis feltet kan ejes
			Ownable ofield = (Ownable) field; 
			if (ofield.getOwner() != null) {
				// Der er en ejer af feltet
				ofield.landOnField(player);
			} else {
				// TODO: Der er ingen ejer, skal feltet købes?
				if (GUIHandler.getYesNo(LanguageHandler.askBuyField(), LanguageHandler.yes(), LanguageHandler.no())) {
					ofield.buyField(player);
					GUIHandler.setBalance(player.getName(), player.getBalance());
					GUIHandler.setOwner(GameBoard.getFieldNumber(field), player.getName() );
				}
			}
		} else {
//			hvis feltet ikke kan ejes
			field.landOnField(player);
		}
		
	}

}
