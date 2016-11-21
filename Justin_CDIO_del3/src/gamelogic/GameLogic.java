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
				int paid = ofield.landOnField(player);
				
				//TODO: giv besked om betalt leje
				GUIHandler.getButtonPressed(LanguageHandler.playerPayTo(player.getName(), ofield.getOwner().getName(), paid), LanguageHandler.Ok());
				GUIHandler.setBalance(ofield.getOwner().getName(), ofield.getOwner().getBalance());
			} else {
				if (player.getBalance() > ofield.getPrice()) {
					if (GUIHandler.getYesNo(LanguageHandler.askBuyField(), LanguageHandler.yes(), LanguageHandler.no())) {
						ofield.buyField(player);
						GUIHandler.setOwner(player);
					}
				}
			}
		} else {
			//			hvis feltet ikke kan ejes
			field.landOnField(player);
			//TODO: giv besked om betalt skat/givet bonus
		}
		GUIHandler.setBalance(player.getName(), player.getBalance());

	}

}
