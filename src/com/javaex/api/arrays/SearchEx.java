package com.javaex.api.arrays;

import java.util.Arrays;

public class SearchEx {

	public static void main(String[] args) {
		// �⺻�� �˻�
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int index = Arrays.binarySearch(nums, 6);
		System.out.println("6�� �ε���:" + index);
		
		// String �˻�: ����Ÿ�� �˻�
		// Ȯ�� �ʿ�
		String[] str = { "Java", "C", "C++", "Python", "Linux" };
		int index2 = Arrays.binarySearch(str, "Java");
		System.out.println("�ε���: " + index2);

	}

}
