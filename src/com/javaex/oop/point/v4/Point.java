package com.javaex.oop.point.v4;

public class Point {
	//	v4
	//	�ʵ�
	protected int x;
	protected int y;
	
	// ������
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this(); // �ڱ� �ڽ��� �ٸ� ������
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
		System.out.printf("��[x=%d, y=%d]�� �׷Ƚ��ϴ�.%n", x, y);
	}
	
	//	�޼ҵ� �����ε�
	public void draw(boolean show) {
		String message = String.format("��[x=%d, y=%d]�� ", x, y);
		if (show) {
			message += "�׷Ƚ��ϴ�.";
		} else {
			message += "�������ϴ�.";
		}
		System.out.println(message);
	}
	
}
