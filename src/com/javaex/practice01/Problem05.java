package com.javaex.practice01;

import java.util.Arrays;
import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int[] num = new int[5];
		for(int i = 0; i < 5; i++) {
			System.out.print("���� : ");
			num[i] = scanner.nextInt();
		}
		Arrays.sort(num);
		
		System.out.printf("�ִ밪�� %d �Դϴ�.", num[num.length-1]);
	}

}
