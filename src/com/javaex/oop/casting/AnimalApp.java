package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		Animal dog1 = new Dog("Snoopy");	//	��ĳ����
		
		dog1.eat();
		dog1.walk();
//		dog1.bark();	//	����
		
		Dog dog2 = new Dog("Doogy");	//�ٿ�ĳ����
		dog2.eat();
		dog2.walk();
		dog2.bark();
		
		//	�ٿ�ĳ���� : ��������� Ÿ���� ����
		((Dog)dog1).bark();
		
		Animal pet = new Dog("Azi");
		pet.eat();
		pet.walk();
		
		pet = new Cat("Yaong");
		pet.eat();
		pet.walk();
		
//		pet.bark();
		
		if (pet instanceof Dog) {
			((Dog)pet).bark();
		} else if (pet instanceof Cat) {
			((Cat)pet).meow();			
		}
	}

}
