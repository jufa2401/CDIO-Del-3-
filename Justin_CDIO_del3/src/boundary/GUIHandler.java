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
	public void createGameBoard(GameBoard gb) {

		int length = gb.getNumberOfFields();
		Field[] fields = new Field[length];
		for (int i = 0; i < length; i++) {
			int price = gb.getFieldPrice(i);
			//hvis feltet er ownable erklærer vi en 'street'
			if (price > 0) {
				fields[i] = new Street.Builder()
						.setTitle(LanguageHandler.getFieldName(i, gb))
						.setSubText(LanguageHandler.getFieldPrice(i, gb))
						.setBgColor(Color.RED)
						.build();
			} else {
				fields[i] = new Refuge.Builder()
						.setTitle(LanguageHandler.getFieldName(i, gb))
						.setSubText(LanguageHandler.getFieldPrice(i, gb))
						.setBgColor(Color.YELLOW)
						.build();

			}

			GUI.create(fields);
			GUI.setDice(1, 1);
		}

	}
}
