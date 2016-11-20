package gamelogic;

import boundary.GUIHandler;
import entity.Player;
import entity.fieldclasses.*;

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
				if (GUIHandler.getBoolean(language.askBuyField())) {
					ofield.buyField(player);
				}
			}
		} else {
//			hvis feltet ikke kan ejes
			field.landOnField(player);
		}
		
	}

}
