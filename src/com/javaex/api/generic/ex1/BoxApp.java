package com.javaex.api.generic.ex1;

public class BoxApp {

	public static void main(String[] args) {
		// Box �ϳ� ����� int ���� ����
		Box intBox = new Box();
		intBox.setContent(123);
		
		//	���� ������ ���ô�.
		int retVal = (int)intBox.getContent();
		System.out.println(retVal);
		
		Box strBox = new Box();
		strBox.setContent("Java");
		
		String strVal = (String)strBox.getContent();
		System.out.println(strVal);
		
		//	���� ĳ������ �߸� �ߴٸ�?
		strVal = (String)intBox.getContent();

	}

}
