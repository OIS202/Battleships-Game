
public class testStuff {

	public static void main(String[] args) {
		String value = String.valueOf(true);
		System.out.println(value);
	}
}
/*if(player1HitGrenadeLastTurn == false) {
	gameGrid.displayBoard();
	String[] parameters = gameGrid.firstPlayerShootsRocket();
	if(parameters[0] == "Ship") {
		System.out.println("Player 1 has hit a ship.");
		if(parameters[1] == "Player 1") {
			System.out.println("It was player 1's ship.");
			player1ShipsHit++;
			if(player1ShipsHit == 4) {
				winner = "Player 2";
				break;
			}
		}else if(parameters[1] == "Player 2") {
			System.out.println("It was player 2's ship.");
			player2ShipsHit++;
			if(player2ShipsHit == 4) {
				winner = "Player 1";
				break;
			}
		}
	}else if(parameters[0] == "Grenade") {
		System.out.println("Player 1 has hit a grenade.");
		player1HitGrenadeLastTurn = true;
	}else if(parameters[0] == "Nothing")
		System.out.println("The cell the rocket hit was empty.");
}else if(player1HitGrenadeLastTurn == true)
	player1HitGrenadeLastTurn = false;
if(player2HitGrenadeLastTurn == false) {
	gameGrid.displayBoard();
	String[] parameters = gameGrid.secondPlayerShootsRocket();
	if(parameters[0] == "Ship") {
		System.out.println("Player 2 has hit a ship.");
		if(parameters[1] == "Player 1") {
			System.out.println("It was player 1's ship.");
			player1ShipsHit++;
			if(player1ShipsHit == 4) {
				winner = "Player 2";
				break;
			}
		}else if(parameters[1] == "Player 2") {
			System.out.println("It was player 2's ship.");
			player2ShipsHit++;
			if(player2ShipsHit == 4) {
				winner = "Player 1";
				break;
			}
		}
	}else if(parameters[0] == "Grenade") {
		System.out.println("Player 2 has hit a grenade.");
		player2HitGrenadeLastTurn = true;
	}else if(parameters[0] == "Nothing")
		System.out.println("The cell the rocket hit was empty.");
}else if(player2HitGrenadeLastTurn == true)
	player2HitGrenadeLastTurn = false;
*/
