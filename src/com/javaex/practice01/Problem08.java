package com.javaex.practice01;

import java.util.Scanner;

public class Problem08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner money = new Scanner(System.in);
		int total = 0;
		int tmoney;
		int select = 0;
		while(true) {
			tmoney=0;
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.print("선택>");
			select = scanner.nextInt();
			if (select == 1) {
				System.out.print("예금액>");
				tmoney = money.nextInt();
				total += tmoney;
			} else if (select == 2){
				System.out.print("출금액>");
				tmoney = money.nextInt();
				total -= tmoney;
			} else if (select == 3) {
				System.out.print("잔고액>"+total);
			} else if (select == 4) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.print("다시 입력해 주세요");
			}
			System.out.println();
		}
	}
}
