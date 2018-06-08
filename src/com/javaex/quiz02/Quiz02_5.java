package com.javaex.quiz02;

public class Quiz02_5 {
	public static void main(String[] args) {
		int num1 = 13579;
		int num2 = 13579;
		
//		String a;
//		a = num2 - num1 == 0 ? "같음" : "다름";
//		System.out.println(a);
		
		//강사님 답
		System.out.println(++num1 + 1 == num2++ + 1 ? "같음" : "다름");
		System.out.println(num1);
		System.out.println(num2);
	}
}
