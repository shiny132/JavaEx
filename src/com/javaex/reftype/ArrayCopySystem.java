package com.javaex.reftype;

public class ArrayCopySystem {

	public static void main(String[] args) {
		// 
		int source[] = {1, 2, 3};
		int target[] = new int[10];
		
		//	(�����迭, �����ε���, Ÿ�ٹ迭, Ÿ�ٹ迭 �ε���, ������ ����)
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
