package entity;

import java.lang.reflect.Array;

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
			field[1] = new Territory(1, 1000, 100);
			field[2] = new Territory(2, 1500, 300);
			field[3] = new Refuge(3, 5000);
			field[4] = new Fleet(4, 4000);
			field[5] = new Territory(5, 2000, 500);
			field[6] = new Territory(6, 3000, 700);
			field[7] = new LaborCamp(7, 2500);
			field[8] = new Tax(8, 2000, 0);
			field[9] = new Territory(9, 4000, 1000);
			field[10] = new Territory(10, 4300, 1300);
			field[11] = new Fleet(11, 4000);
			field[12] = new LaborCamp(12, 2500);
			field[13] = new Territory(13, 4750, 1600);
			field[14] = new Territory(14, 5000, 2000);
			field[15] = new Refuge(15, 500);
			field[16] = new Fleet(16, 4000);
			field[17] = new Territory(17, 5500, 2600);
			field[18] = new Territory(18, 6000, 3200);
			field[19] = new Tax(19, 4000, 10);
			field[20] = new Territory(20, 8000, 4000);	
			field[21] = new Fleet(21, 4000);
		}
	}	
	public int getNumberOfFields () {
		return Array.getLength(field)-1;
	}
	public int getFieldRent(int index) {
		return field[index].getRent();
	}
	public int getFieldPrice(int index) {
		return field[index].getPrice();
	}


	public Field[] getField() {
		return field;
	}
	/*	Når en spiller dør, bliver deres  ejendomme ejerløse, og kan købes igen.
	public void releasePlayersFields(Player player) {
		for(int i = 0; i < field.length; i++)
			if(field[i].isOwnable())
				if(fields[i].getOwner() != null)
					if(getField(i).getOwner().getName().equals(player.getName()))
						fields[i].setOwner(null);

	 */





}
