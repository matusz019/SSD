package lab1;

class Circle extends Shape{
	private int radius;
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public double getArea() {
		return (double) (Math.PI * Math.pow(radius, 2));
	}
	Circle(){
		super(1);
	}
}