package com.javaex.basic.console;

import java.util.Scanner;

public class ConsoleInputEx {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���̴�? ");
		int age = scanner.nextInt();
		
		System.out.print("�̸���? ");
		String name = scanner.next();
		
		System.out.println("Welcome, " + name);
		System.out.println("age : " + age);
		
		scanner.close();
		
	}
}
