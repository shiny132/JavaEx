package com.javaex.oop.shape.v2;

public abstract class Shape {
	//�ʵ�
	protected int x;
	protected int y;
	
	//������
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//�߻� �޼��� ����
//	public abstract void draw();	//	�������̽��� ����
	public abstract double area();
	
}