package com.javaex.oop.shape.v2;

public class Circle extends Shape implements Drawable{
	protected double radius;

	//	������
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}
//	@Override
	public void draw() {
		System.out.printf("��[x=%d, y=%d, r=%f, area=%f]�� �׷Ⱦ��.%n", x, y, radius, area());
	}
	
	@Override
	public double area() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	
}
