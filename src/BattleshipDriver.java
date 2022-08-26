
public class BattleshipDriver {

	public static void main(String[] args) {
		BattleshipsGameGrid gameGrid= new BattleshipsGameGrid();
		gameGrid.greetings();
		gameGrid.firstPlayerChoosingShips();
		gameGrid.firstPlayerChoosingGrenades();
		gameGrid.secondPlayerChoosingShips();
		gameGrid.secondPlayerChoosingGrenades();
		//gameGrid.displayBoard();
		String winner = "";
		int player1ShipsHit = 0;
		int player2ShipsHit = 0;
		boolean player1HitGrenadeLastTurn = false;
		boolean player2HitGrenadeLastTurn = false;
		while(true) {
			if(player1HitGrenadeLastTurn == false) {
				gameGrid.displayBoard();
				String[] parameters = gameGrid.firstPlayerShootsRocket();
				if(parameters[0] == "Ship") {
					System.out.println("p1 hit ship");
					if(parameters[2] == "false") {
						if(parameters[1] == "Player 1") {
							System.out.println("It was p1 ship");
							player1ShipsHit++;
							if(player1ShipsHit == 4) {
								winner = "p2";
								break;
							}
						}else if(parameters[1] == "Player 2") {
							System.out.println("It was p2 ship");
							player2ShipsHit++;
							if(player2ShipsHit == 4) {
								winner = "p1";
								break;
							}
						}
					}else if(parameters[2] == "true")
						System.out.println("It has already been called so it doesn't count.");
				}else if(parameters[0] == "Grenade") {
					System.out.println("First player hit a grenade.");
					if(parameters[2] == "false") {
						System.out.println("He will lose a turn.");
						player1HitGrenadeLastTurn = true;
					}else if(parameters[2] == "true")
						System.out.println("It was already called so he will no lose a turn.");
				}else if(parameters[0] == "Nothing")
					System.out.println("The cell was empty nothing will happen.");
			}else if(player1HitGrenadeLastTurn == true) {
				player1HitGrenadeLastTurn = false;
			}
			if(player2HitGrenadeLastTurn == false) {
				gameGrid.displayBoard();
				String[] parameters = gameGrid.secondPlayerShootsRocket();
				if(parameters[0] == "Ship") {
					System.out.println("p2 hit ship");
					if(parameters[2] == "false") {
						if(parameters[1] == "Player 1") {
							System.out.println("It was p1 ship");
							player1ShipsHit++;
							if(player1ShipsHit == 4) {
								winner = "p2";
								break;
							}
						}else if(parameters[1] == "Player 2") {
							System.out.println("It was p2 ship");
							player2ShipsHit++;
							if(player2ShipsHit == 4) {
								winner = "p1";
								break;
							}
						}
					}else if(parameters[2] == "true")
						System.out.println("It has already been called so it doesn't count.");
				}else if(parameters[0] == "Grenade") {
					System.out.println("Second player hit a grenade.");
					if(parameters[2] == "false") {
						System.out.println("He will lose a turn.");
						player2HitGrenadeLastTurn = true;
					}else if(parameters[2] == "true")
						System.out.println("It was already called so he will no lose a turn.");
				}else if(parameters[0] == "Nothing")
					System.out.println("The cell was empty nothing will happen.");
			}else if(player2HitGrenadeLastTurn == true) {
				player2HitGrenadeLastTurn = false;
			}
		}
		System.out.println("Winner is"+winner);
	}

}
