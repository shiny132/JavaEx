package com.javaex.oop.point.v2;

public class Point {
	//v2
	//	�ʵ�
	private int x;
	private int y;
	
	// ������
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
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
		System.out.printf("��[x= %d, y= %d]�� �׷Ƚ��ϴ�.%n", x, y);
	}
	
}
