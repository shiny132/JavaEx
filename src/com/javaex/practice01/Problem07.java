package com.javaex.practice01;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		int count = 0;
		int rValue = 0;
		boolean switcher = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("-----------");
		System.out.println("숫자맞추기 게임 시작");
		System.out.println("-----------");
		while(switcher) {
			if (count==0) {
				rValue = (int)(Math.random()*100)+1;
			}
			
			System.out.print(">>");
			int input = scanner.nextInt();
			
			if (input==rValue) {
				System.out.println("맞았습니다.");
				System.out.println("게임을 종료하시겠습니까? (y/n)");
				count = 0;
				String input2 = scanner.next();
				
				if (input2.equals("y") || input2.equals("Y")) {
					System.out.println("y");
					switcher = false;
					break;
				} else if (input2.equals("n") || input2.equals("N")) {
					System.out.println("n");
				}
				
			} else if (input<rValue) {
				System.out.println("더 크게");
				count+=1;
			} else {
				System.out.println("더 작게");
				count+=1;
			}
		}
	}						
}
