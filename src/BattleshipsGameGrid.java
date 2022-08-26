import java.util.Scanner;

/**
 * 
 */

/**
 * @author oimbs
 *
 */

public class BattleshipsGameGrid {
	Cell[][] gameGrid;
	int firstPlayerShipsNum = 4;
	int seccondPlayerShipsNum = 4;
	Scanner scanner;
	
public BattleshipsGameGrid() {
	this.gameGrid = new Cell[8][8];
	for(int i = 0;i<gameGrid.length;i++){
		for(int j = 0;j<gameGrid[i].length;j++){
			gameGrid[i][j] = new Cell();
		}
	}
	scanner = new Scanner(System.in);
}
private int rowConverter(char row){
	switch(row){
		case 'A': case 'a':
			return 0;
		case 'B': case 'b':
			return 1;
		case 'C': case 'c':
			return 2;
		case 'D': case 'd':
			return 3;
		case 'E': case 'e':
			return 4;
		case 'F': case 'f':
			return 5;
		case 'G': case 'g':
			return 6;
		case 'H': case 'h':
			return 7;
	}
	return -1;
}
public void greetings() {
	System.out.println("This is a battleship game.");
	System.out.println("it is a multiplayer game where two players shoot rockets at a grid.");
	System.out.println("If a player hits a ship or nothing the game goes on.");
	System.out.println("If a player hits a grenade he loses a turn.");
	System.out.println("The game goes on until one of the players sinks all of the other players ships and by that he wins.");
}
public void printCell(int row, int col) {
	System.out.println(gameGrid[row][col].getElementType());
	System.out.println(gameGrid[row][col].getOwner());
	System.out.println(gameGrid[row][col].isCalled());
}
public void firstPlayerChoosingShips() {
	System.out.println("You will be choosing 4 ships first then 6 grenade positions.");
	System.out.println("Choose a row between A and H and a column number between 0 and 7.");
	int numberOfShipsChosen = 0;
	while(true) {
		System.out.println("Choose a position for your ship:");
		String coordinate = scanner.nextLine();
		int row = this.rowConverter(coordinate.charAt(0));
		int column = Integer.parseInt(String.valueOf(coordinate.substring(1)));
		if((row == -1)||(column > 7)||(column < 0)){
			System.out.println("This is an invalid coordinate.");
			System.out.println("Please enter a row between A and H, and a column between 0 and 7.");
			continue;
		}
		if(this.isCellEmpty(row, column)==true) {
			this.chooseFirstPlayerShip(row, column);
			numberOfShipsChosen++;
			System.out.println("Ship has been placed.");
		}
		else{
			System.out.println("The coordinate you have chosen is occupied.");
			System.out.println("PLease choose another coordinate.");
			continue;
		}
		if(numberOfShipsChosen == 4){
			System.out.println("That's 4 ships.");
			break;
		}
	}
}
public void firstPlayerChoosingGrenades(){
	System.out.println("Now you will be choosing the 6 postions for your grenade.");
	System.out.println("Choose a row between A and H and a column number between 0 and 7.");
	int numberOfGrenadesChosen = 0;
	while(true) {
		System.out.println("Choose a position for your grenade:");
		String coordinate = scanner.nextLine();
		int row = this.rowConverter(coordinate.charAt(0));
		int column = Integer.parseInt(String.valueOf(coordinate.substring(1)));
		if((row == -1)||(column > 7)||(column < 0)){
			System.out.println("This is an invalid coordinate.");
			System.out.println("Please enter a row between A and H, and a column between 0 and 7.");
			continue;
		}
		if(this.isCellEmpty(row, column)==true) {
			this.chooseFirstPlayerGrenade(row, column);
			numberOfGrenadesChosen++;
			System.out.println("Grenade has been placed.");
		}
		else{
			System.out.println("The coordinate you have chosen is occupied.");
			System.out.println("PLease choose another coordinate.");
			continue;
		}
		if(numberOfGrenadesChosen == 6) {
			System.out.println("That's 6 grenades.");
			break;
		}
	}
}
private void chooseFirstPlayerShip(int row, int column){
	this.gameGrid[row][column].setElementType("Ship");
	this.gameGrid[row][column].setOwner("Player 1");
}
private void chooseFirstPlayerGrenade(int row, int column){
	this.gameGrid[row][column].setElementType("Grenade");
	this.gameGrid[row][column].setOwner("Player 1");
}
public void secondPlayerChoosingShips() {
	System.out.println("You will be choosing 4 ships first then 6 grenade positions.");
	System.out.println("Choose a row between A and H and a column number between 0 and 7.");
	int numberOfShipsChosen = 0;
	while(true) {
		System.out.println("Choose a position for your ship:");
		String coordinate = scanner.nextLine();
		int row = this.rowConverter(coordinate.charAt(0));
		int column = Integer.parseInt(String.valueOf(coordinate.substring(1)));
		if((row == -1)||(column > 7)||(column < 0)){
			System.out.println("This is an invalid coordinate.");
			System.out.println("Please enter a row between A and H, and a column between 0 and 7.");
			continue;
		}
		if(this.isCellEmpty(row, column)==true) {
			this.chooseSecondPlayerShip(row, column);
			numberOfShipsChosen++;
			System.out.println("Ship has been placed.");
		}
		else{
			System.out.println("The coordinate you have chosen is occupied.");
			System.out.println("PLease choose another coordinate.");
			continue;
		}
		if(numberOfShipsChosen == 4){
			System.out.println("That's 4 ships.");
			break;
		}
	}
}
public void secondPlayerChoosingGrenades() {
	System.out.println("Now you will be choosing the 6 postions for your grenade.");
	System.out.println("Choose a row between A and H and a column number between 0 and 7.");
	int numberOfGrenadesChosen = 0;
	while(true) {
		System.out.println("Choose a position for your grenade:");
		String coordinate = scanner.nextLine();
		int row = this.rowConverter(coordinate.charAt(0));
		int column = Integer.parseInt(String.valueOf(coordinate.substring(1)));
		if((row == -1)||(column > 7)||(column < 0)){
			System.out.println("This is an invalid coordinate.");
			System.out.println("Please enter a row between A and H, and a column between 0 and 7.");
			continue;
		}
		if(this.isCellEmpty(row, column)==true) {
			this.chooseSecondPlayerGrenade(row, column);
			numberOfGrenadesChosen++;
			System.out.println("Grenade has been placed.");
		}
		else{
			System.out.println("The coordinate you have chosen is occupied.");
			System.out.println("PLease choose another coordinate.");
			continue;
		}
		if(numberOfGrenadesChosen == 6) {
			System.out.println("That's 6 grenades.");
			break;
		}
	}
}
private void chooseSecondPlayerShip(int row, int column){
	this.gameGrid[row][column].setElementType("Ship");
	this.gameGrid[row][column].setOwner("Player 2");
}
private void chooseSecondPlayerGrenade(int row, int column) {
	this.gameGrid[row][column].setElementType("Grenade");
	this.gameGrid[row][column].setOwner("Player 2");
}
private boolean isCellEmpty(int row, int column) {
	boolean ownerNull = false;
	boolean typeNothing = false;
	if(this.gameGrid[row][column].getOwner()=="")
		ownerNull = true;
	if(this.gameGrid[row][column].getElementType()=="Nothing")
		typeNothing = true;
	return (ownerNull && typeNothing);
}
public void displayBoard() {
	for(int i = 0;i<8;i++) {
		System.out.println("\t");
		for(int j = 0;j<8;j++) {
			if(this.gameGrid[i][j].isCalled()==true) {
				if(this.gameGrid[i][j].getOwner()=="Player 1") {
					if(this.gameGrid[i][j].getElementType()=="Ship")
						System.out.print("S1 ");
					if(this.gameGrid[i][j].getElementType()=="Grenade")
						System.out.print("G1 ");
				}else if(this.gameGrid[i][j].getOwner()=="Player 2") {
					if(this.gameGrid[i][j].getElementType()=="Ship")
						System.out.print("S2 ");
					if(this.gameGrid[i][j].getElementType()=="Grenade")
						System.out.print("G2 ");
				}else if(this.gameGrid[i][j].getElementType()=="Nothing")
					System.out.print("* ");
			}else if(this.gameGrid[i][j].isCalled()==false)
				System.out.print("_ ");
		}
		System.out.println();
	}
}
public String[] firstPlayerShootsRocket() {
	int row = 0;
	int column = 0;
	System.out.println("Its time for the first player to shoot a rocket.");
	while(true) {
	System.out.println("Choose a row between A and H and a column between 0 and 7 for your rocket to hit:");
	String coordinate = scanner.nextLine();
	row = this.rowConverter(coordinate.charAt(0));
	column = Integer.parseInt(String.valueOf(coordinate.substring(1)));
	if((row == -1)||(column > 7)||(column < 0)){
		System.out.println("This is an invalid coordinate.");
		System.out.println("Please enter a row between A and H, and a column between 0 and 7.");
		continue;
	}else
		break;
	}
	String[] parameters = shootRocket(row,column);
	return parameters;
	
}
public String[] secondPlayerShootsRocket() {
	int row = 0;
	int column = 0;
	System.out.println("Its time for the second player to shoot a rocket.");
	while(true) {
	System.out.println("Choose a row between A and H and a column between 0 and 7 for your rocket to hit:");
	String coordinate = scanner.nextLine();
	row = this.rowConverter(coordinate.charAt(0));
	column = Integer.parseInt(String.valueOf(coordinate.substring(1)));
	if((row == -1)||(column > 7)||(column < 0)){
		System.out.println("This is an invalid coordinate.");
		System.out.println("Please enter a row between A and H, and a column between 0 and 7.");
		continue;
	}else
		break;
	}
	String[] parameters = shootRocket(row,column);
	return parameters;
}
private String[] shootRocket(int row, int col) {
	String[] parameters = new String[3];
	parameters[2] = String.valueOf(this.gameGrid[row][col].isCalled());
	this.gameGrid[row][col].setCalled(true);
	parameters[0] = this.gameGrid[row][col].getElementType();
	parameters[1] = this.gameGrid[row][col].getOwner();
	return parameters;
}
}
