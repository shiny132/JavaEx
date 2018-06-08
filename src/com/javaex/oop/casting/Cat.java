package com.javaex.oop.casting;

public class Cat extends Animal {
	
//	public Cat() {	//	이 코드가 에러나는 이유는 상속받은 Animal에서 생성자 형태와 다르기 때문임.(Animal 생성자를 생성 안했으면 에러안남)
//		super();
//	}
	
	public Cat(String name) {
		super(name);
	}
	
	public void meow() {
		System.out.println(name + ":야옹!");
	}
}
