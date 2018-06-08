package com.javaex.conditional;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// switch문에서 char 사용
		char grade = 'A';
		String message;
		
		switch (grade) {
		case 'A' :
			message = "Excellent!";
			break;
		case 'B' :
			message = "Good!";
		case 'C' :
			message = "So so!";
		case 'D' :
			message = "Pass!";
		case 'F' :
			message = "Fiil";
		default :
			message = "?";
		}
		System.out.println(message);

	}

}
