package com.javaex.reftype;

public class StringEx {

	public static void main(String[] args) {
		// ������ ����
		String str; // ����
		str = "Java"; // Literal
		String str2 = "Java";
		String str3 = new String("Java");
		
		// �� ������ ���� ���� ������ �ִ�.
		System.out.println(str == str2);
		System.out.println(str2 == str3);
		
		// �� ��
		System.out.println(str.equals(str3));
	}

}
