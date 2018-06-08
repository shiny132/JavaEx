package com.javac.basic.console;

public class ConsoleOutputEx {

	public static void main(String[] args) {
		System.out.print("Hello ");
		System.out.println("Java");
		
		String str1 = "Hello";
		String str2 = "Java";
		
		System.out.println(str1 + " " + str2);
		
		//이스케이프 문자
		System.out.println("Hello\nJava");
		System.out.println("Hello\tJava");
		System.out.println("Hello, \"Java\"");
		System.out.println("\\ 역슬래시");
		
		String dir = "D:\\javastudy\\eclipse";
	}

}
