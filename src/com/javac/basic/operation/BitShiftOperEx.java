package com.javac.basic.operation;

public class BitShiftOperEx {
	public static void main(String[] args) {
		// ��Ʈ ����Ʈ
		int val = 1;
		
		System.out.println(val);
		System.out.println(Integer.toBinaryString(val));
		System.out.println(Integer.toBinaryString(val << 1));
		System.out.println(Integer.toBinaryString(val << 4));
		
		System.out.println("-----------");
		
		// ���� ��Ʈ ����Ʈ
		int val2 = 0b1000;
		
		System.out.println(Integer.toBinaryString(val2 >> 1));
		System.out.println(Integer.toBinaryString(val2 >> 3));
		
	}
}
