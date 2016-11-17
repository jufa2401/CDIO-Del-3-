package entity;

import entity.fieldclasses.Field;
import entity.fieldclasses.LaborCamp;
import entity.fieldclasses.Refuge;
import entity.fieldclasses.Territory;

public class GameBoard {
/*	
 	Tribe Encampment	Territory	Rent 100	Price 1000
	Crater	Territory	Rent 300	Price 1500
	Mountain	Territory	Rent 500	Price 2000
	Cold Desert	Territory	Rent 700	Price 3000
	Black cave	Territory	Rent 1000	Price 4000
	The Werewall	Territory	Rent 1300	Price 4300
	Mountain village	Territory	Rent 1600	Price 4750
	South Citadel	Territory	Rent 2000	Price 5000
	Palace gates	Territory	Rent 2600	Price 5500
	Tower	Territory	Rent 3200	Price 6000
	Castle	Territory	Rent 4000	Price 8000
	Walled city	Refuge	Receive 5000
	Monastery	Refuge	Receive 500
	Huts in the mountain	Labor camp	Pay 100 x dice	Price 2500
	The pit	Labor camp	Pay 100 x dice	Price 2500
	Goldmine	Tax	Pay 2000
	Caravan	Tax	Pay 4000 or 10% of total assets
	Second Sail	Fleet	Pay 500-4000	Price 4000
	Sea Grover	Fleet	Pay 500-4000	Price 4000
	The Buccaneers	Fleet	Pay 500-4000	Price 4000
	Privateer armade
	*/
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
		field[14] = new LaborCamp(15, "Huts in the mountain", 2500);
		

 
	


}
