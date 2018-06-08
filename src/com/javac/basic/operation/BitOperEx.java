package com.javac.basic.operation;

public class BitOperEx {
	public static void main(String[] args) {
		// ��Ʈ ����
		// �ϵ���� ����, �̹��� ���μ���
		// �̼��� ���� ������ ��� ���
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		int result = b1 & b2; // bit and ����
		System.out.println(Integer.toBinaryString(result));
		
		result = b1 | b2; // bit or ����
		System.out.println(Integer.toBinaryString(result));
		
		result = b1 ^ b2; // bit xor ����
		System.out.println(Integer.toBinaryString(result));
		
		result = ~b1; // bit not ����
		System.out.println(Integer.toBinaryString(result));		
		
	}
}
