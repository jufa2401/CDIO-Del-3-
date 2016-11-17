package entity;

import entity.fieldclasses.Field;
import entity.fieldclasses.Fleet;
import entity.fieldclasses.LaborCamp;
import entity.fieldclasses.Refuge;
import entity.fieldclasses.Tax;
import entity.fieldclasses.Territory;
// Hvad er rækkefølgen af felterne?a
public class GameBoard {

	//	Der erklæres et array med 22 elementer, selvom vi kun skal bruge 21. Vi vælger at springe 0 over
	Field[] field = new Field[22];{
		field[1] = new Territory(1, "Tribe Encampment", 1000, 100);
		field[2] = new Territory(2, "Crater", 1500, 300);
		field[3] = new Territory(3, "Mountain", 2000, 500);
		field[4] = new Territory(4, "Cold Desert", 3000, 700);
		field[5] = new Territory(5, "Black Cave", 4000, 1000);
		field[6] = new Territory(6, "The Werewall", 4300, 1300);
		field[7] = new Territory(7, "Mountain village", 4750, 1600);
		field[8] = new Territory(8, "South Citadel", 5000, 2000);
		field[9] = new Territory(9, "Palace gates", 5500, 2600);
		field[10] = new Territory(10, "Tower", 6000, 3200);
		field[11] = new Territory(11, "Castle", 8000, 4000);
		field[12] = new Refuge(12, "Walled City", 5000);
		field[13] = new Refuge(13, "Monastery", 500);
		field[14] = new LaborCamp(14, "Huts in the mountain", 2500);
		field[15] = new LaborCamp(15, "The pit", 2500);
		field[16] = new Tax(16, "Goldmine", 2000, 0);
		field[17] = new Tax(17, "Caravan", 4000, 10);
		field[18] = new Fleet(18, "Second Sail", 4000);
		field[19] = new Fleet(19, "Sea Grove", 4000);
		field[20] = new Fleet(20, "The Buccaneers", 4000);
		field[21] = new Fleet(21, "Privateer armade", 4000);

	}	






}
