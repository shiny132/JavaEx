package com.javaex.oop.staticmember;

public class Calculator {
	public static final double PI = 3.14159;
		//	static final ���
	
	public static double getSum(double ... nums) {
		double total =0;
		
		for(double num : nums) {
			total += num;
		}
		
		return total;
	}
}
