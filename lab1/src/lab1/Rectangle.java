package lab1;

class Rectangle extends Shape{
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
		return (length * width);
	}
	Rectangle(){
		super(4);
	}
}
