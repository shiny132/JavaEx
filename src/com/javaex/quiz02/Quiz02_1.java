//https://github.com/namsk/bl-java/blob/master/Quiz/Quiz02.md
package com.javaex.quiz02;

public class Quiz02_1 {
	public static void main(String[] args) {
		int a =3;
		int b = 6;
		char c = 'A';
		
		//q1
		System.out.println(a % 2 == 0);
		
//		boolean result;
//		result = a % 2 == 0? true : false;
//		System.out.println(result);
		
		//q2
		System.out.println(b % 3 == 0);
		
//		result = b % 3 == 0? true : false;
//		System.out.println(result);
		
		//q3
		boolean r1 = a % 2 == 0 && b % 3 == 0;
		System.out.println(r1);
		
		//q4
		char r2 = (char)(c+4);
		System.out.println(r2);
		
//		System.out.println(Integer.toBinaryString(c >> 4));
	
	}
}
