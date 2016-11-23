package boundary.language;

import entity.GameBoard;

public class Dansk implements LanguageDefinitions {

	@Override
	public String getFieldName(int id, GameBoard gb) {
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
//	TODO: udskriv ting fra entiterne med lavere kobling
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
		int type =  gb.getFieldType(id);
		switch (type) {
		case 1: 	s = "Flåde";		break;
		case 2: 	s = "Arbejdslejr";	break;
		case 3: 	s = "Helle";		break;
		case 4: 	s = "Skat";			break;
		case 5: 	s = "Territorie";	break;
		default:	s = "";				break;
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
	public String getOkMove(String playerName) {
		return "Det er " + playerName+ "'s tur, Tryk OK for at kaste terningerne og rykke";
				
	}
	@Override
	public String Ok() {
		return "OK";
	}
	@Override
	public String GameOver(String winner) {
		return "Spillet er slut. Vinderen er: " + winner + ". Tillykke!";
	}
	@Override
	public String playerPayTo(String payer, String recipient, int paid) {
		return "Spiller '" + payer + "' betaler "+ paid + " til '" + recipient + "'.";
	}
	@Override
	public String gameRules() {
		return "\t Dette spil kan spilles af 2-6 spillere. \n"
				+ "\t Spillet tabes ved at gå bankerot, den sidste spiller med likvide midler vinder spillet. \n"
				+ "\t Alle spillere starter med en balance på 30.000. \n"
				+ "\t Visse felter kan købes, andre kan medføre en betaling. \n"
				+ "\t Hvis en spiller lander på et ejet felt, betales en sum til ejeren. \n " ;
	}
}
