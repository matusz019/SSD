package lab1;

abstract class Shape {
	
	private int sides;
	
	public int getSides() {
		return sides; //returns the number of sides within the shape
	}
	public void setSides(int sides) {
		this.sides = sides; //sets the number of sides within the shape, uses private in order to only be accessed by subclasses
	}
	abstract public double getArea(); //gets the size of the shapes area
	
	Shape(int sides){
		this.sides = sides; //constructor, param is the number of sides
	}
}