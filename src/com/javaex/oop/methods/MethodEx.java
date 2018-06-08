package com.javaex.oop.methods;

public class MethodEx {

	public static void main(String[] args) {
		printMessage(); // �Ű�����, ���� ���� �ż���
		
		double squared = square(3.5);
		System.out.println(squared);
		
		System.out.println("4+5 = " + getSum(4, 5));
		
		printDivide(4, 0);
	}
	
	public static void printDivide(int num1, int num2) {
		if (num2 ==0) {
			System.out.println("0���� ���� �� �����");
			return;
		}
		System.out.println(num1 / num2);
	}
	
	//	 �Ű������� ���� ������ ����
	public static double getSum(double num1, double num2) {
		return num1 + num2;
	}
	
	public static void printMessage() {
		System.out.println("Message");
	}
	
	//	���ϰ��� �Ű������� �ִ� �ż���
	public static double square(double num) {
		return num * num;
	}

}
