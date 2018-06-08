package com.javaex.oop.staticmember;

public class Singleton {
	private static Singleton instance = new Singleton();
	
	private Singleton() {
		//	new ȣ�� �Ұ�
	}
	
	public static Singleton getInstance() {
		return instance;
	}
	
}
