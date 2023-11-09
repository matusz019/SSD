package lab1;

class Ellipse extends Rectangle{
	private int length;
	private int width;
	
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	public void setLength(int length) {
		this.length = length;
		}
	public int getLength() {
		return length;
	}
	
	public double getArea() {
		return length * width * Math.PI;
	}
	
	Ellipse(){
		
	}
}