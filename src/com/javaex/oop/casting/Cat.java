package com.javaex.oop.casting;

public class Cat extends Animal {
	
//	public Cat() {	//	�� �ڵ尡 �������� ������ ��ӹ��� Animal���� ������ ���¿� �ٸ��� ������.(Animal �����ڸ� ���� �������� �����ȳ�)
//		super();
//	}
	
	public Cat(String name) {
		super(name);
	}
	
	public void meow() {
		System.out.println(name + ":�߿�!");
	}
}
