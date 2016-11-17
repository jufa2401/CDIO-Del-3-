package spilllogik;

import entity.Player;

public class Game{
	public static void GameRules(int[] Dice, Player p){
//		Når en spillersbalance bliver nul, bliver hans taber status sat til sand.
		int LossBalance = 0;
		if (p.getBalance() <= LossBalance)
			p.setHasLost(true);
	}

}
