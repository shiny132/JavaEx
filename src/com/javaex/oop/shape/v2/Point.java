package com.javaex.oop.shape.v2;

public class Point implements Drawable {
	//	�ʵ�
	protected int x;
	protected int y;
	
	//������
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void draw() {
		System.out.printf(
				"��[x=%d, y=%d]�� �׷Ƚ��ϴ�%n", x, y);
	}

}
