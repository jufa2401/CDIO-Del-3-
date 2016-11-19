package entity;

import entity.fieldclasses.Field;
import entity.fieldclasses.Fleet;
import entity.fieldclasses.LaborCamp;
import entity.fieldclasses.Refuge;
import entity.fieldclasses.Tax;
import entity.fieldclasses.Territory;
// Hvad er rækkefølgen af felterne?a
public class GameBoard {
	private Field[] field;


	//	Der erklæres et array med 22 elementer, selvom vi kun skal bruge 21. Vi vælger at springe 0 over
	public GameBoard() {
	this.field = new Field[22];{
		field[1] = new Territory(1, "Tribe Encampment", 1000, 100);
		field[2] = new Territory(2, "Crater", 1500, 300);
		field[3] = new Refuge(3, "Walled City", 5000);
		field[4] = new Fleet(4, "Second Sail", 4000);
		field[5] = new Territory(5, "Mountain", 2000, 500);
		field[6] = new Territory(6, "Cold Desert", 3000, 700);
		field[7] = new LaborCamp(7, "Huts in the mountain", 2500);
		field[8] = new Tax(8, "Goldmine", 2000, 0);
		field[9] = new Territory(9, "Black Cave", 4000, 1000);
		field[10] = new Territory(10, "The Werewall", 4300, 1300);
		field[11] = new Fleet(11, "Sea Grove", 4000);
		field[12] = new LaborCamp(12, "The pit", 2500);
		field[13] = new Territory(13, "Mountain village", 4750, 1600);
		field[14] = new Territory(14, "South Citadel", 5000, 2000);
		field[15] = new Refuge(15, "Monastery", 500);
		field[16] = new Fleet(16, "The Buccaneers", 4000);
		field[17] = new Territory(17, "Palace gates", 5500, 2600);
		field[18] = new Territory(18, "Tower", 6000, 3200);
		field[19] = new Tax(19, "Caravan", 4000, 10);
		field[20] = new Territory(20, "Castle", 8000, 4000);	
		field[21] = new Fleet(21, "Privateer armade", 4000);

	}	
	
	}


	public Field[] getField() {
		return field;
	}
//	Når en spiller dør, bliver deres  ejendomme ejerløse, og kan købes igen.
	public void releasePlayersFields(Player player) {
		for(int i = 0; i < field.length; i++)
			if(field[i].isOwnable())
				if(fields[i].getOwner() != null)
					if(getField(i).getOwner().getName().equals(player.getName()))
						fields[i].setOwner(null);

	





}
