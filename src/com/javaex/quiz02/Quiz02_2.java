package com.javaex.quiz02;

public class Quiz02_2 {
	public static void main(String[] args) {
		int balls = 136;
		int cap = 10;
		
		int result = balls % cap == 0 ? (balls/cap) : (balls/cap)+1;
		System.out.println(result);
		
		//°­»ç´Ô ´ä
//		int cnt = balls / cap;
//		cnt += (balls % cap > 0 ? 1:0);
//		System.out.println();
	}
}
