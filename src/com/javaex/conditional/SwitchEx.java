package com.javaex.conditional;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �����ϼ���\n(1.Java 2.C 3.C++ 4.Python)\n �����ȣ : ");
		int subject = scanner.nextInt();
		
		switch(subject) {
		case 1:
			System.out.println("R101");
			break;
		case 2:
			System.out.println("R202");
			break;
		case 3:
			System.out.println("R303");
			break;
		case 4:
			System.out.println("R404");
			break;
		default :
			System.out.println("�����ڿ��� �����ϼ���.");
			break;
		}
		
		scanner.close();
	}

}
