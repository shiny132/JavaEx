package com.javaex.practice01;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		int count = 0;
		int rValue = 0;
		boolean switcher = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("-----------");
		System.out.println("���ڸ��߱� ���� ����");
		System.out.println("-----------");
		while(switcher) {
			if (count==0) {
				rValue = (int)(Math.random()*100)+1;
			}
			
			System.out.print(">>");
			int input = scanner.nextInt();
			
			if (input==rValue) {
				System.out.println("�¾ҽ��ϴ�.");
				System.out.println("������ �����Ͻðڽ��ϱ�? (y/n)");
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
				System.out.println("�� ũ��");
				count+=1;
			} else {
				System.out.println("�� �۰�");
				count+=1;
			}
		}
	}						
}
