package boundary;


public class ULang {

	/**
	 * The method gameRules returns a string which contains the game rules.
	 * @return String
	 */

	
	
	public static String LandOnText(String fieldName){
	String s = "Du er landet på " + fieldName;
	return s;
	}
	
	public static String askBuyField(int balance, int price){
	String s = "Din balance er: "+ balance + ", prisen er: " +price + ". Vil du købe denne ejendom? (J/N)" ;
	return s;
	}
	
	public static String YesChar(){
		return "Jj";
		}
	

	
	
	
	
	
	//	public static String gameRulesText()
//	{
//		String gameRules = "";
//		gameRules = "Reglerne i dette spil er som følger: \n"
//			      + "Begge spiller starter med en balance på 1000. \n"
//				  + "Den første til at opnå en balance på 3000 vinder spillet.\n"
//				  + "Hvis begge spilleres balance er over 3000 i den runde, hvor mindst en spiller opnår 3000 vinder spilleren med flest point. \n"
//				  + "Skulle balancerne være ens er spillet uafgjort. \n"
//				  + "Der kastes med to terninger, terningernes udfald bestemmer feltet man lander på. \n"
//				  + "Et felt har et navn, og en værdi som påvirker ens balance. \n"
//				  + "Good luck, have fun.";
//		return gameRules;
//	}
//	
//	public static String confirmText(){
//		String confirm = "<< indtast >>Y<< for at bekræfte, eller >>retur<< for at rette navnet";
//		return confirm;
//	}
//	
//	public static String nameEnteredText(){
//		String nameEntered = "Du har indtastet >>";
//		return nameEntered;
//	}
//	
//	public static String enterNameP1Text(){
//		String enterNameP1 = "Spiller 1 indtast dit navn: ";
//		return enterNameP1;
//	}
//	public static String enterNameP2Text(){
//		String enterNameP2 = "Spiller 2 indtast dit navn: ";
//		return enterNameP2;
//	}
//	
//	public static String throwDiceText(){
//		String throwDice = " kast med terningerne - tryk enter";
//		return throwDice;
//	}
//	public static String congratsText(){
//		String congrats = "Tillykke ";
//		return congrats;
//	}
//	
//	public static String winnerText(){
//		String winner = " - Du har vundet!";
//		return winner;
//	}
//	
//	public static String DiceSumText(){
//		String DiceSum = "Du har slået: ";
//		return DiceSum;
//	}
//	
//	public static String balanceAffectedText(){
//		String balanceAffected = ". Det har påvirket din balance med: ";
//		return balanceAffected;
//	}
//	public static String landOnText(){
//		String landOn = "Du er landet på ";
//		return landOn;
//	}
//	public static String currentBalanceText(){
//		String currentBalance = "Din balance er nu: ";
//		return currentBalance;
//	}
//	public static String stalemateText(){
//		String stalemate = "Spillet ender uafgjort - I har begge lige høj balance";
//		return stalemate;
//	}
//	public static String accountText(){
//		String account = " konto: ";
//		return account;
//	}
	
}
