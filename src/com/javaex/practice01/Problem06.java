package com.javaex.practice01;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		
		//내가 짠 코드
		/*int Result1 = 0;
		int Result2 = 0;
		
		for (int i = 1; i<=num; i++) {
			if (i % 2 == 0) {
				Result1 += i;
			} else {
				Result2 += i;
			}
			
		}
		System.out.println("짝수의 합 = " + Result1);
		System.out.println("홀수의 합 = " + Result2);
		
		scanner.close();*/
		
		//강사님 코드
		int startNum = (num % 2 == 0) ? 2:1;
		int sum = 0;
		
		for (int i = startNum; i <= num; i += 2) {
			sum +=i;
		}
		
		System.out.println("결과: " + sum);
		scanner.close();
	}

}
