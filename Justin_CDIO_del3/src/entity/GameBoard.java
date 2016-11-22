package entity;
import java.awt.Color;
import java.lang.reflect.Array;
import entity.fieldclasses.Field;
import entity.fieldclasses.Fleet;
import entity.fieldclasses.LaborCamp;
import entity.fieldclasses.Refuge;
import entity.fieldclasses.Tax;
import entity.fieldclasses.Territory;
public class GameBoard {
	private static Field[] field;


	public GameBoard() {
		GameBoard.field = new Field[21];

//		Territory parametre: id, feltfarve, feltpris, leje
		field[0] = new Territory(1, Color.RED, 1000, 100);
		field[1] = new Territory(2, Color.RED, 1500, 300);
//		Refuge parametre: id, feltfarve, bonus 
		field[2] = new Refuge(3, Color.CYAN, 5000);
//		Fleet parametre: id, pris
		field[3] = new Fleet(4, Color.BLUE, 4000);
		field[4] = new Territory(5, Color.RED, 2000, 500);
		field[5] = new Territory(6, Color.RED, 3000, 700);
		field[6] = new LaborCamp(7, Color.GREEN, 2500);
//		Tax parametre: id, feltfarve, fast skattebeløv, skatte pct.
		field[7] = new Tax(8, Color.YELLOW, 2000, 0);
		field[8] = new Territory(9, Color.RED, 4000, 1000);
		field[9] = new Territory(10, Color.RED, 4300, 1300);
		field[10] = new Fleet(11, Color.BLUE, 4000);
		field[11] = new LaborCamp(12, Color.GREEN, 2500);
		field[12] = new Territory(13, Color.RED, 4750, 1600);
		field[13] = new Territory(14, Color.RED, 5000, 2000);
		field[14] = new Refuge(15, Color.CYAN, 500);
		field[15] = new Fleet(16, Color.BLUE, 4000);
		field[16] = new Territory(17, Color.RED, 5500, 2600);
		field[17] = new Territory(18, Color.RED, 6000, 3200);
		field[18] = new Tax(19, Color.YELLOW, 4000, 10);
		field[19] = new Territory(20, Color.RED, 8000, 4000);	
		field[20] = new Fleet(21, Color.BLUE, 4000);
	}	
	public static int getNumberOfFields () {
		return Array.getLength(field);
	}
	public Color getFieldColor(int index) {
		return field[index].getColor();
	}
	public int getFieldRent(int index) {
		return field[index].getRent();
	}
	public int getFieldPrice(int index) {
		return field[index].getPrice();
	}

	public Field getField(int i ) {
		return field[i];
	}


	public static int getFieldNumber(Field f) {
		int i;
		for (i = 0; i< getNumberOfFields(); i++){
			if (f.getID() == field[i].getID())
				break;
		}
		return i;
	}

}










