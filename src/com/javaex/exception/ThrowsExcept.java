package com.javaex.exception;

import java.io.IOException;

public class ThrowsExcept {
	public void executeException() throws IOException {
		System.out.println("���� ���� �߻�");
		throw new IOException("���� ����");
	}
	
	public void executeRuntimeException() {
		System.out.println("��Ÿ�� ����");
		throw new RuntimeException("Runtime Exception");
	}
	
	public double divide(int num1, int num2) {
		if (num2 ==0) {
			throw new ArithmeticException();
		}
		return num1/ num2;
	}
}
