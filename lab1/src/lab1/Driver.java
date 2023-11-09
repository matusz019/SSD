package lab1;
import java.lang.Math;


class Driver {
	public final static void main(String [] args) {
			Rectangle rec1 = new Rectangle();
			rec1.setLength(5);
			rec1.setWidth(2);
			System.out.println("This is a rectangle with " + rec1.getSides() + " sides and with the area " + rec1.getArea());
			Circle cir1 = new Circle();
			cir1.setRadius(6);
			System.out.println("This is a cicle with " + cir1.getSides() + " sides and with the area " + cir1.getArea());

	}
}
