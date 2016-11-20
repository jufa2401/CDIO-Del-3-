package entity;

public class PlayerList {
	//Tomt Playerarray
	int playerCount;
	private Player[] players;


	public PlayerList (int playerCount) {
		playerCount = 0;
//		this.players = new Player[playerCount];
//		for (int c = 0; c < playerCount; c++)
//			players[c] = new Player();

	}


	public void addPlayer(String name) {
		players[playerCount] = new Player(name, 30000);
		playerCount++;

	}


	//// Fjern spiller hvis han taber?
	//if (Player.isHasLost = true) { 
	//	playerCount--;


}

