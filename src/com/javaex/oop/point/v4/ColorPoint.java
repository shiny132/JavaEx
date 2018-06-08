package com.javaex.oop.point.v4;

public class ColorPoint extends Point{
	private String color;
	
	//	������
	public ColorPoint() {
		super();
	}
	
	public ColorPoint(String color) {
		super();
		this.color = color;
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	// getters	/	setters
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void draw() {
//		System.out.printf("������[color=%s, x=%d, y=%d]�� �׷Ƚ��ϴ�.%n", color, getX(), getY());	//	private
		System.out.printf("������[color=%s, x=%d, y=%d]�� �׷Ƚ��ϴ�.%n", color, x, y);	//	protected
	}
}
