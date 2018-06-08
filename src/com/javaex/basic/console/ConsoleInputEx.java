package com.javaex.basic.console;

import java.util.Scanner;

public class ConsoleInputEx {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이는? ");
		int age = scanner.nextInt();
		
		System.out.print("이름은? ");
		String name = scanner.next();
		
		System.out.println("Welcome, " + name);
		System.out.println("age : " + age);
		
		scanner.close();
		
	}
}
