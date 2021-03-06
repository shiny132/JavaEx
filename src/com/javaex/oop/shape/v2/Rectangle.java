package com.javaex.oop.shape.v2;

//	Shift + Alt + s에서 Override/Implement Methods(V) 누르면 바로 상속 받을 수 있음
public class Rectangle extends Shape implements Drawable{
	//	필드 추가
	protected int width;
	protected int height;

	//	생성자
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double area() {
		return width * height;
	}
	
//	@Override	
	public void draw() {
		System.out.printf("사각형 [x=%d, y=%d, w=%d, h=%d, area=%f]을 그렸어요.%n", x, y, width, height, area());
	}

}
