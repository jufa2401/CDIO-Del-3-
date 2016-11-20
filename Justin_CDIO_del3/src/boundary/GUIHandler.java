package boundary;
import java.awt.Color;

import boundary.language.LanguageHandler;
import desktop_codebehind.Car;
import desktop_codebehind.Car.Builder;
import desktop_fields.Brewery;
import desktop_fields.Field;
import desktop_fields.Refuge;
import desktop_fields.Shipping;
import desktop_fields.Street;
import desktop_fields.Tax;
import desktop_resources.GUI;
import entity.DiceCup;
import entity.GameBoard;
import entity.Player;

//omgcr

public class GUIHandler {
	
	public void createGameBoard(GameBoard gb, LanguageHandler language) {
		int id;
		int length = gb.getNumberOfFields();
		Field[] fields = new Field[length];
		for (id = 0; id < length; id++) {
			int price = gb.getFieldPrice(id);
			//hvis feltet er ownable erklærer vi en 'street'
			if (price > 0) {
				fields[id] = new Street.Builder()
						.setTitle(language.getFieldName(id, gb))
						.setSubText(language.getFieldPrice(id, gb))
						.setBgColor(gb.getFieldColor(id))
						.build();
			} else {
				fields[id] = new Refuge.Builder()
						.setTitle(language.getFieldName(id, gb))
						.setSubText(language.getFieldPrice(id, gb))
						.setBgColor(gb.getFieldColor(id))
						.build();

			}
		}
		GUI.create(fields);
		GUI.setDice(1, 1);
	}
}
