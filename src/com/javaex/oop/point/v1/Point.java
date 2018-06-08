package com.javaex.oop.point.v1;

public class Point {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.printf("��[x= %d, y= %d]�� �׷Ƚ��ϴ�.", x, y);
	}
	
}
