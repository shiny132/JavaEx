package com.javaex.api.generic.ex2;

public class BoxApp {

	public static void main(String[] args) {
		// Box �ϳ� ����� int ���� ����
		Box<Integer> intBox = new Box<Integer>();
		intBox.setContent(123);
//		intBox.setContent("Java");	//	�����Ͻ� üũ
		
		//	���� ������ ���ô�.
		int retVal = intBox.getContent();	//	ĳ���� ���ʿ�
		System.out.println(retVal);
		
		Box<String> strBox = new Box<>();
		strBox.setContent("Java");
		
		String strVal = strBox.getContent();	//	ĳ���� ���ʿ�
		System.out.println(strVal);
		
		//	���� ĳ������ �߸� �ߴٸ�?
//		strVal = (String)intBox.getContent();
		//	������ Ÿ�ӿ��� üũ: ������ Ȯ��
		

	}

}
