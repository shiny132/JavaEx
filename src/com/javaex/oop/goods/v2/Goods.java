package com.javaex.oop.goods.v2;

public class Goods {
	// �ʵ� ����
	private String name;
	private int price;
	
	//	�ܺ� ������ ���� getter, setter
	
	//	Getters
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	//	Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("��ǰ��: " + name);
		System.out.println("����: " + price);
	}
}
