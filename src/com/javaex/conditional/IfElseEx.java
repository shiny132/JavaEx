package com.javaex.conditional;

import java.util.Scanner;

public class IfElseEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
/*		System.out.print("���� �Է� : ");
		
		int score = scanner.nextInt();
		
		if (score>=60) {
			System.out.println("�հ�");
		}
		else {
			System.out.println("���հ�");
		}*/
		
		// if - else if - else
		
		int num = scanner.nextInt();
		
		if (num > 0) {
			System.out.println("����Դϴ�.");
		} else if (num < 0){
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("0�Դϴ�.");
		}
		
		//��ø if
		if (num > 0) {
			System.out.println("����Դϴ�.");
		} else {
			if (num == 0) {
				System.out.println("0�Դϴ�.");
			} else {
				System.out.println("�����Դϴ�.");
			}
		}
		scanner.close();
	}
}
