package com.javaex.loop;

public class Gugudan {

	public static void main(String[] args) {
		
		for (int dan = 2; dan <=9; dan++) {
			System.out.println("["+dan+"��]");
			for (int num = 1; num <=9; num++) {
				System.out.println(dan + "*" + num + "=" + dan*num);
			}
		}

	}

}
