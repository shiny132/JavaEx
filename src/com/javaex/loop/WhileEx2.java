package com.javaex.loop;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("단을 입력하세요: ");
		int dan = scanner.nextInt();
		
		int i = 1;
		
		//while문 사용
		while(i <= 9) {
			System.out.println(dan + "*" + i + "=" + dan*i);
			i++;
		}
		scanner.close();
		
		//for문 사용
/*		for(i = 1; i<10; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
		scanner.close();*/
	}

}
