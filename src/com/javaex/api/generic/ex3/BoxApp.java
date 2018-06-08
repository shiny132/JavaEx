package com.javaex.api.generic.ex3;

public class BoxApp {

	public static void main(String[] args) {
		// Box �ϳ� ����� int ���� ����
		Box<String, Integer> intBox = new Box<>();
		intBox.setKey("Integer");
//		intBox.setKey(123);
		intBox.setContent(123);
//		intBox.setContent("Java");	//	�����Ͻ� üũ
		
		//	���� ������ ���ô�.
		int retVal = intBox.getContent();	//	ĳ���� ���ʿ�
		System.out.println(intBox.getKey());
		System.out.println(retVal);
		
		Box<String, String> strBox = new Box<>();
		strBox.setKey("String");
		strBox.setContent("Java");
		
		String strVal = strBox.getContent();	//	ĳ���� ���ʿ�
		System.out.println(strBox.getKey());
		System.out.println(strVal);
		
		//	���� ĳ������ �߸� �ߴٸ�?
//		strVal = (String)intBox.getContent();
		//	������ Ÿ�ӿ��� üũ: ������ Ȯ��
		
//		Effective Java
//		abstract -> interface
//		�����ϸ� Generic
//		�÷��� - �迭 -> ��ü
	}

}
