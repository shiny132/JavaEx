package com.javaex.api.arrays;

import java.util.Arrays;

public class SearchEx {

	public static void main(String[] args) {
		// 기본형 검색
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int index = Arrays.binarySearch(nums, 6);
		System.out.println("6의 인덱스:" + index);
		
		// String 검색: 참조타입 검색
		// 확인 필요
		String[] str = { "Java", "C", "C++", "Python", "Linux" };
		int index2 = Arrays.binarySearch(str, "Java");
		System.out.println("인덱스: " + index2);

	}

}
