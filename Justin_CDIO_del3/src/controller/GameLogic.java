package controller;

import boundary.GUIHandler;
import boundary.language.LanguageHandler;
import entity.Player;
import entity.fieldclasses.Field;
import entity.fieldclasses.Ownable;

public class GameLogic{

	public static void FieldRules(GUIHandler GUIh, LanguageHandler language, int fieldNumber, Field field, Player player) {
		if (field.getPrice() > 0) {
			//			hvis feltet kan ejes
			Ownable ofield = (Ownable) field; 
			if (ofield.getOwner() != null) {
				// Der er en ejer af feltet
				int paid = ofield.landOnField(player);

				//TODO: giv besked om betalt leje
				GUIh.getButtonPressed(language.playerPayTo(player.getName(), ofield.getOwner().getName(), paid), language.Ok());
				GUIh.setBalance(ofield.getOwner().getName(), ofield.getOwner().getBalance());
			} else {
				if (player.getBalance() > ofield.getPrice()) {
					if (GUIh.getYesNo(language.askBuyField(), language.yes(), language.no())) {
						ofield.buyField(player);
						GUIh.setOwner(fieldNumber, player.getName());
					}
				}
			}
		} else {
			//			hvis feltet ikke kan ejes
			field.landOnField(player);
			//TODO: giv besked om betalt skat/givet bonus
		}
		GUIh.setBalance(player.getName(), player.getBalance());

	}

}
