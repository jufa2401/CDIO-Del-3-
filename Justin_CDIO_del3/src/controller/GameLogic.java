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

				// Giv besked om betalt leje
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
			int[] tax = field.getTax(player.getBalance());
			int paid;
			if (tax[0] > 0 && tax[1] > 0) {
				/*
				 * Vidste ikke om vi skulle beregne skattefratrækkelsen
				 * for spilleren, eller bare skrive skatteraten,
				 * vi har derfor valgt at give kunden begge muligheder
				 * (se nedenstående udkommenterede kode)
				 */
//				if (GUIh.getYesNo(language.askPayTax(), ""+tax[0], ""+tax[1])) {
				if (GUIh.getYesNo(language.askPayTax(), tax[0]+"", tax[1]+"%")) {
					paid = tax[0];
				} else {
					paid = tax[1]*player.getBalance()/100;
				}
				player.Transaction(-paid);
			} else {
				paid = field.landOnField(player);
			}
			String TaxOrBonus;
			if (paid > 0) {
				TaxOrBonus = language.playerTax(player.getName(), paid);
			} else {
				TaxOrBonus = language.playerBonus(player.getName(), -paid);
			}
			// Giv besked om betalt skat/givet bonus
			GUIh.getButtonPressed(TaxOrBonus, language.Ok());
		}
		GUIh.setBalance(player.getName(), player.getBalance());

	}

}
