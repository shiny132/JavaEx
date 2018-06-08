package com.javaex.practice01;

import java.util.Arrays;
import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int[] num = new int[5];
		for(int i = 0; i < 5; i++) {
			System.out.print("숫자 : ");
			num[i] = scanner.nextInt();
		}
		Arrays.sort(num);
		
		System.out.printf("최대값은 %d 입니다.", num[num.length-1]);
	}

}
