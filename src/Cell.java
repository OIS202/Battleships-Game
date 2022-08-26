
public class Cell {
private String elementType;//whether element is ship grenade or nothing
private String owner;//Whether the given cell is owned by player1 or player 2
private boolean called;//whether this cell has been called or not

public Cell() {
	this.called = false;
	this.elementType = "Nothing";
	this.owner = "";
}
public String getElementType() {
	return elementType;
}
public String getOwner() {
	return owner;
}
public boolean isCalled() {
	return called;
}
public void setElementType(String elementType) {
	this.elementType = elementType;
}
public void setOwner(String owner) {
	this.owner = owner;
}
public void setCalled(boolean called) {
	this.called = called;
}
}
