package com.javaex.loop;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���: ");
		int dan = scanner.nextInt();
		
		int i = 1;
		
		//while�� ���
		while(i <= 9) {
			System.out.println(dan + "*" + i + "=" + dan*i);
			i++;
		}
		scanner.close();
		
		//for�� ���
/*		for(i = 1; i<10; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
		scanner.close();*/
	}

}
