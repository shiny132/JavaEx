package com.javac.basic.operation;

public class ConditionalOperEx {
	public static void main(String[] args) {
		// 3�� ������ (Conditional Operator)
		int a, b;
		a = 10;
		b = 30;
		
		boolean result;
		
		result = a % 2 == 0 ? true : false; // ���� ������
		System.out.println(a + "�� ¦��? " + result);
		
		String message;
		
		int score = 85;
		
		message = (score >= 80) ? "Good" : 
							(score < 50) ? "Fail" : "pass"; 
		System.out.println("Score: " + score+ ", Result: " + message);
	}
}
