package com.javaex.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AntiExceptionEx {

	public static void main(String[] args) {
		//	��ĳ�ʷκ��� ���� �Է�
		//	100�� ������ ������
		double result = 0;
		int num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���:");
	
		//���� �߻� ���� ����
		/*
		num = scanner .nextInt();
		result = 100 / num;
		*/
		//	���� �߻� ���� ����
		
		try {
			num = scanner .nextInt();
			result = 100 / num;
		} catch (InputMismatchException e){
			System.out.println("������ ���ּ���");
		} catch (ArithmeticException e){
			System.out.println("0���δ� ���� �� �����");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally");
		}
		
		System.out.println(result);
		scanner.close();

	}

}
