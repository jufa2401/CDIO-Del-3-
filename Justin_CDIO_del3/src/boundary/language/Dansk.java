package boundary.language;

import entity.GameBoard;
import entity.Player;

public class Dansk implements LanguageDefinitions {

	@Override
	public String getFieldName(int id, GameBoard gb) {
		String s;
		String names[] = {
				//			Disse rettes senere til dansk
				"Stamme Lejr",
				"Krater",
				"Befæstede by",
				"Andet Sejl",
				"Bjerg",
				"Kold Ørken",
				"Hytterne i bjergene",
				"Guldmine",
				"Sort Grotte",
				"Varmuren",
				"Havgrotten",
				"Graven",
				"Bjerglandsbyen",
				"Fortet i syd",
				"Kloster",
				"Piraterne",
				"Palads portene ",
				"Tårnet",
				"Karavanen",
				"Slot",
				"Kaperflåden"			
		};
		return names[id];
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
			s = "Pris " + price;
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
	@Override
	public String AskHowManyPlayer() {
		return "Hvor mange spillere? (mellem 2 og 6) ";
	}
	@Override
	public String AskForPlayerName() {
		return "Indtast spillernavn: ";
	}
	@Override
	public String askBuyField() {
		return "Vil du købe dette felt?";
	}
	@Override
	public String getFieldDescription(int id, GameBoard gb) {
		String s;
		int price = gb.getFieldPrice(id);
		if (price > 0) {
			s = getFieldName(id,gb);
		} else {
			//hvis feltet ikke er ownable (price = 0), så returneres en tom streng.
			s = "";
		}
		return s;
	}
	@Override
	public String no() {
		return "Nej";
	}
	@Override
	public String yes() {
		return "Ja";
	}
	@Override
	public String getOkMove(Player player) {
		return "Det er " + player.getName()+ "'s tur, Tryk OK for at starte";
				
	}
	@Override
	public String Ok() {
		return "OK";
	}
}
