package com.javaex.api.arrays;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {
		//	����
		//	���� ��� ȸ��
		char src[] = "Java Programming".toCharArray();
		
		//	�̷� �͵� �ֽ��ϴ�.
		
		//System�� �̿��� ī��
		char target[] = new char[src.length];
		System.arraycopy(src, 0, target, 0, src.length);
		
//		System.out.println(src);
		System.out.println(target);
		
		//	Arrays.copyOf�� �̿��� ī��
		target = Arrays.copyOf(src, src.length);
		System.out.println(target);

		//�Ϻ� ī��
		target = Arrays.copyOfRange(src, 5, src.length);
		System.out.println(target);
	}

}
