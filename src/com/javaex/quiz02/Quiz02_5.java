package com.javaex.quiz02;

public class Quiz02_5 {
	public static void main(String[] args) {
		int num1 = 13579;
		int num2 = 13579;
		
//		String a;
//		a = num2 - num1 == 0 ? "����" : "�ٸ�";
//		System.out.println(a);
		
		//����� ��
		System.out.println(++num1 + 1 == num2++ + 1 ? "����" : "�ٸ�");
		System.out.println(num1);
		System.out.println(num2);
	}
}
