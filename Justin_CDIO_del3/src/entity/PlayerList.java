package entity;

public class PlayerList {
	//Tomt Playerarray
	private static int playerCount;
	private static Player[] players;


	public PlayerList (int playerCount) {
		this.players = new Player[playerCount];
		for (int c = 0; c < playerCount; c++)
			players[c] = new Player();
		this.playerCount = playerCount;
	}


	public void addPlayer(int ID, String name) {
		players[ID] = new Player(name, 30000);

	}
	


	public static Player getPlayer(int ID) {
		
		return players[ID];
	}
	public static int getNumberofPlayer() {
		return playerCount;
	}

/*
 *  Kunne ikke få GUI'en til at vise spillere med samme navn,
 *  og laver derfor kode som stopper brugeren for at gøre dette
*/
	public boolean isNameUsed(int numberOfDefinedPlayers, String name) {
		boolean isUsed = false;
		for (int i = 0; i < numberOfDefinedPlayers; i++) {
			if (players[i].getName().equalsIgnoreCase(name)){
				isUsed = true;	
			}
		}
		return isUsed;
	}


	public static boolean isWinner() {
		// TODO Auto-generated method stub
		return false;
	}


	//// Fjern spiller hvis han taber?
	//if (Player.isHasLost = true) { 
	//	playerCount--;


}

