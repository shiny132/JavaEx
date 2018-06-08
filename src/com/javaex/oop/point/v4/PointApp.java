package com.javaex.oop.point.v4;
//v4
public class PointApp {

	public static void main(String[] args) {
//		Point point1 = new Point();
//		point1.setX(5);
//		point1.setY(10);
		Point point1 = new Point(5, 5);
		point1.draw();
		
//		Point point2 = new Point();
//		point2.setX(10);
//		point2.setY(23);
		Point point2 = new Point(10, 23);
		point2.draw();
		
		point2.draw(true);
		point2.draw(false);
	
		ColorPoint cp = new ColorPoint("red");
		cp.draw();
		
		ColorPoint cp2 = new ColorPoint(10, 10, "blue");
		cp2.draw();
	}
}
