package com.javaex.collection.hash;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		// ����
		HashSet<String> hs = new HashSet<>();
		
		//	��ü �߰�
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		
		System.out.println(hs);
		System.out.println("hs size = " + hs.size());
		
		//	������ ��ü�� �����ϰ� �ִ°�? : contains()
		System.out.println(hs.contains("C++"));
		System.out.println(hs.contains("Linux"));
		
		//	��ü ����
		hs.remove("C++");
		System.out.println(hs);
		
		hs.remove("C++");

	}

}
