package com.javaex.conditional;

import java.util.Scanner;

public class IfElseEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �����ϼ���\n(1.�ڹ� 2.C 3.C++ 4.���̽�)\n �����ȣ : ");
		int subject = scanner.nextInt();
		
		if (subject == 1) {
			System.out.println("R101ȣ �Դϴ�.");
		} else if(subject == 2) {
			System.out.println("R202ȣ �Դϴ�.");
		} else if(subject == 3) {
			System.out.println("R303ȣ �Դϴ�.");
		} else if(subject == 4) {
			System.out.println("R404ȣ �Դϴ�.");
		} else {
			System.out.println("�����ڿ��� �����ϼ���.");
		}
		
		scanner.close();

	}

}
