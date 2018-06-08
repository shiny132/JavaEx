package com.javaex.reftype;

public class StringFormatEx {

	public static void main(String[] args) {
		// %s, %d, %n
		String fruit = "Apple";
		int total = 10;
		int eat = 3;
		
		System.out.println(total + "���� " + fruit + " �߿� " + eat + "���� �Ծ���.");
		
		// -> format
		System.out.printf("%d���� %s �߿� %d���� �Ծ���.%n",total, fruit, eat);
		
		// %f
		float pi = 3.14159f;
		System.out.printf("���̰��� %f �Դϴ�.%n", pi);
		System.out.printf("���̰��� %.3f �Դϴ�.%n", pi);
		
		// ���� ������ String������ ����� �� �ִ�.
		String str = String.format("%d���� %s �߿� %d���� �Ծ���.%n", total, fruit, eat);
		System.out.println(str);
	}

}
