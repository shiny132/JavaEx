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
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("--------------------------");
			System.out.print("����>");
			select = scanner.nextInt();
			if (select == 1) {
				System.out.print("���ݾ�>");
				tmoney = money.nextInt();
				total += tmoney;
			} else if (select == 2){
				System.out.print("��ݾ�>");
				tmoney = money.nextInt();
				total -= tmoney;
			} else if (select == 3) {
				System.out.print("�ܰ��>"+total);
			} else if (select == 4) {
				System.out.println("���α׷� ����");
				break;
			} else {
				System.out.print("�ٽ� �Է��� �ּ���");
			}
			System.out.println();
		}
	}
}
