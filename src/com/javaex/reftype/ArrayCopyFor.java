package com.javaex.reftype;

public class ArrayCopyFor {

	public static void main(String[] args) {
		// �迭�� ũ�� ���� �ȵǴ� �� �迭�� ����
		int source[] = {1, 2, 3};
		int target[] = new int[10];
		
		// ����
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
		
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] + " ");
		}
		System.out.println();
	}

}
