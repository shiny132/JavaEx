package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
		String s1 = "Java";	//	���ͷ�
		String s2 = new String("Java");	//	�޸𸮿� ���� �����
		String s3 = "Java";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));

		//	String ������
		char[] letters = { 'J', 'a', 'v', 'a'};
		String s4 = new String(letters);
		
		//	valueOf �޼���
		String s5 = String.valueOf(3.14159f);
		
		//	������ �޼����
		String str = "Java Programming is Fun?";
		System.out.println(str.charAt(5));	//	5�� �ε����� char
		System.out.println(str.indexOf("Fun"));
		System.out.println(str.indexOf("fun"));
		
		//replace
		System.out.println(str.replace('?', '!'));
		System.out.println(str.replaceAll("Fun", "Funny"));
		
		System.out.println(str);
		
		String s6 = "           Hello           ";
		String s7 = ", Java";
		s6 = s6.trim();	//	Whitespace ������
		System.out.println(s6 + s7);
		
		//	���ڿ� �и� : split();
		String[] split = str.split(" ");
		System.out.println(split);
		for (String data:split) {
			System.out.println(data);
			
		}
	}
}
