package com.javaex.loop;
import java.lang.Math;
public class LottoNumber {

	public static void main(String[] args) {
		//for문
/*		for (int i = 0; i < 6; i++) {
			System.out.print((int) (Math.random()*45) + 1);
			System.out.print(" ");
		}
		System.out.println();*/
		
		//while문
		/*int index = 0;
		
		while(index<6) {
			System.out.print((int) (Math.random()*45) + 1);
			System.out.print(" ");
			index++;
		}
		System.out.println();*/
		
		
		
		//while문 중복검사
		int lotto[] = new int[6];
				
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
		
			for(int j = 0; j< i; j++){
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				} // 중복 값 제거1
			}
		}
	for(int i=0; i<lotto.length; i++) {
		System.out.print(lotto[i] + " ");
	}
		System.out.println("입니다.");
	}

}
