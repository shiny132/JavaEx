package com.javaex.reftype;

public class ArrayCopySystem {

	public static void main(String[] args) {
		// 
		int source[] = {1, 2, 3};
		int target[] = new int[10];
		
		//	(원본배열, 시작인덱스, 타겟배열, 타겟배열 인덱스, 복사할 길이)
		System.arraycopy(source, 0, target, 3, source.length);
		
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] + " ");
		}
		System.out.println();
		
		//	Enhanced For
		for (int val:target) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

}
