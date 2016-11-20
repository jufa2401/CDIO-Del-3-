package boundary.language;

import entity.GameBoard;

public class Dansk implements LanguageDefinitions {

	@Override
	public String getFieldName(int id, GameBoard gb) {
		String s;
		String names[] = {
				//			Disse rettes senere til dansk
				"Tribe Encampment",
				"Crater",
				"Walled City",
				"Second Sail",
				"Mountain",
				"Cold Desert",
				"Huts in the mountain",
				"Goldmine",
				"Black Cave",
				"The Werewall",
				"Sea Grove",
				"The pit",
				"Mountain village",
				"South Citadel",
				"Monastery",
				"The Buccaneers",
				"Palace gates",
				"Tower",
				"Caravan",
				"Castle",
				"Privateer armade"			
		};
		// ID starter ved 1, arrayet starter ved 0
		return names[id-1];
	}
	@Override

	public String getFieldRent(int id, GameBoard gb) {
		String s;
		int rent = gb.getFieldRent(id);
		if (rent > 0) {
			s = "Lejen er:" + rent;
		} else {
			//hvis feltet ikke er ownable (rent = 0), så returneres en tom streng.
			s = "";
		}
		return s;
	}

	@Override
	public String getFieldPrice(int id, GameBoard gb) {
		String s;
		int price = gb.getFieldPrice(id);
		if (price > 0) {
			s = "Prisen er:" + price;
		} else {
			//hvis feltet ikke er ownable (price = 0), så returneres en tom streng.
			s = "";
		}
		return s;
	}
	@Override
	public String notifyLangChange(){
		return "Sproget er sat til Dansk";
	}
}
