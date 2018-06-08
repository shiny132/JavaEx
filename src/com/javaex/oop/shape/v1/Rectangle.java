package com.javaex.oop.shape.v1;

//	Shift + Alt + s���� Override/Implement Methods(V) ������ �ٷ� ��� ���� �� ����
public class Rectangle extends Shape {
	//	�ʵ� �߰�
	protected int width;
	protected int height;

	//	������
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double area() {
		return width * height;
	}
	
	@Override	
	public void draw() {
		System.out.printf("�簢�� [x=%d, y=%d, w=%d, h=%d, area=%f]�� �׷Ⱦ��.%n", x, y, width, height, area());
	}

}
