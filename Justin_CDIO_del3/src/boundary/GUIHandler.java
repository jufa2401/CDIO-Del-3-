package boundary;
import java.awt.Color;

import boundary.language.LanguageHandler;
import desktop_codebehind.Car;
import desktop_codebehind.Car.Builder;
import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;
import entity.DiceCup;
import entity.GameBoard;
import entity.Player;


public class GUIHandler {
	int length = 0;
	/*	
	 * I stedet for at inddele vores felter i de forskellige builder felter,
	 * har jeg valgt at lave et array some deler alle felterne ind i 2 grupper
	 * Ownable og ikke-ownable
	 * for at man kan kende forskel på felttyperne har jeg så inddelt mine 
	 * felte ind i forskelligt farvede objekter.
	 * 
	 */
	public void createGameBoard(GameBoard gb, LanguageHandler language) {
		int id;
		length = gb.getNumberOfFields();
		Field[] fields = new Field[length];
		for (id = 0; id < length; id++) {
			int price = gb.getFieldPrice(id);
			//hvis feltet er ownable erklærer vi en 'street'
			if (price > 0) {
				fields[id] = new Street.Builder()
						.setTitle(language.getFieldName(id, gb))
						.setSubText(language.getFieldPrice(id, gb))
						.setDescription(language.getFieldDescription(id, gb))
						.setBgColor(gb.getFieldColor(id))
						.setRent(language.getFieldRent(id, gb))
						.build();
			} else {
				fields[id] = new Street.Builder()
						.setTitle(language.getFieldName(id, gb))
						.setSubText(language.getFieldPrice(id, gb))
						.setDescription(language.getFieldDescription(id, gb))
						.setBgColor(gb.getFieldColor(id))
						.build();
				

			}
		}
		GUI.create(fields);
//		GUI.setDice(1, 1);
	}
	public int getInteger(String message, int min, int max) {
		return GUI.getUserInteger(message, min, max);
	}

	public String getString(String message) {
		return GUI.getUserString(message);
	}
	public void addPlayer(Player player) {
		Builder carBuilder = new Car.Builder();
		switch (player.getPlayerID()){
		case 0:
			carBuilder
			.typeRacecar()
			.patternHorizontalGradiant()
			.primaryColor(Color.MAGENTA)
			.secondaryColor(Color.DARK_GRAY);
			break;
		case 1:
			carBuilder
			.typeTractor()
			.patternDiagonalDualColor()
			.primaryColor(Color.GREEN)
			.secondaryColor(Color.ORANGE);
			break;
		case 2:
			carBuilder
			.typeRacecar()
			.patternDotted()
			.primaryColor(Color.BLUE)
			.secondaryColor(Color.CYAN);
			break;
		case 3:
			carBuilder
			.typeUfo()
			.patternZebra()
			.primaryColor(Color.YELLOW)
			.secondaryColor(Color.MAGENTA);
			break;
		case 4:
			carBuilder
			.typeTractor()
			.patternCheckered()
			.primaryColor(Color.RED)
			.secondaryColor(Color.BLACK);
			break;
		case 5:
			carBuilder
			.typeUfo()
			.patternHorizontalDualColor()
			.primaryColor(Color.WHITE)
			.secondaryColor(Color.GREEN);
			break;
		default:
			break;
		}
		Car car = carBuilder.build();
		GUI.addPlayer(player.getName(), player.getBalance(), car);
		GUI.setCar(player.getCurrentField()+1, player.getName()); //+1
	}

	public void setCar(int currentField, String name) {
		GUI.setCar(currentField+1, name);						//+1
	}

	public void showDice(DiceCup dice) {
		int[] d = dice.getDiceValue();
		GUI.setDice(d[0], d[1]);
	}
	public void removeCar(int currentField, String name) {
		GUI.removeCar(currentField+1, name);					//+1

	}
	public boolean getYesNo(String message, String Yes, String No) {
		String response = GUI.getUserButtonPressed(message, Yes, No);
		if (response.equals(Yes))
			return true;
		else return false;
	}
	public void setBalance(String name, int newBalance) {
		GUI.setBalance(name, newBalance);
		
	}
	public void setOwner(int currentField, String player) {
		GUI.setOwner(currentField+1, player);	//+1
	}
	public void removeOwner(int i) {
		GUI.removeOwner(i+1);	//+1
	}
	public void getButtonPressed(String getOkMove, String ok) {
		GUI.getUserButtonPressed(getOkMove, ok);
	}
	public void getGameRules(String gameRules) {
		GUI.showMessage(gameRules);
	}

	
}



