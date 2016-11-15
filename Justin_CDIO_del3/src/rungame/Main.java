package rungame;

import entity.fieldclasses.Field;
import entity.fieldclasses.Territory;

public class Main {

	public static void main(String[] args) {
		Field[] field = new Field[22];{
			field[1] = new Territory(1, "Tribe Encampment", 1000, 100);
			field[2] = new Territory(1, "Tribe Encampment", 1000, 100);
			field[3] = new Territory(1, "Tribe Encampment", 1000, 100);
			field[4] = new Territory(1, "Tribe Encampment", 1000, 100);
			field[5] = new Territory(1, "Tribe Encampment", 1000, 100);

			System.out.println(field[1].getfieldName());
			field[1].getRent();
		}

	}

}
