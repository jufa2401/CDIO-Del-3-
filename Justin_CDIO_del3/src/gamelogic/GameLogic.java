package gamelogic;

import boundary.GUIHandler;
import boundary.language.LanguageHandler;
import entity.GameBoard;
import entity.Player;
import entity.PlayerList;
import entity.fieldclasses.Field;
import entity.fieldclasses.Ownable;

public class GameLogic{

	//	TODO: Fjern ejendomme når en spiller dør.
//	public static void GameRules(Player player, Field field){
//
//		Ownable ofield = (Ownable) field; 
//		for(int i = 0; i < GameBoard.getNumberOfFields(); i++){
//			if (PlayerList.getPlayer(i).hasLost() == true) { 
//				ofield.setOwner(null);
//
//
//			}
//		}
//	}



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
