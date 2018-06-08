package com.javaex.conditional;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("과목을 선택하세요\n(1.Java 2.C 3.C++ 4.Python)\n 과목번호 : ");
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
			System.out.println("관리자에게 문의하세요.");
			break;
		}
		
		scanner.close();
	}

}
