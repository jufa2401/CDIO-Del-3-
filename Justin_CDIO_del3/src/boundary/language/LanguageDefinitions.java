package boundary.language;

import entity.GameBoard;
import entity.Player;

public interface LanguageDefinitions {

	public String getFieldName(int id, GameBoard gb);
	
	
	public String getFieldRent(int id, GameBoard gb);
	
	public String getFieldPrice(int id, GameBoard gb);


	public String notifyLangChange();
	
	
}