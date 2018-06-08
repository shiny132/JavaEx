package com.javaex.api.wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		//	�⺻ : �����
		Integer i = new Integer(10);
		Character c = new Character('c');
		
		//	jdk9���� new Wrapper�� deprecated
		Float f = Float.valueOf(3.14159f);
		Boolean b = Boolean.valueOf(true);
		
		//	���ڿ��� �־ �˴ϴ�.
		Integer i1 = Integer.valueOf("10");
		Double d1 = Double.valueOf("3.14159");
		Boolean b1 = Boolean.valueOf("false");
		//	���� : ���ڿ��� ���°� �ش� �⺻���� ���¸� ����� �Ѵ�.
		
		//	�ڵ� �ڽ�(Auto Boxing)
		Integer i2 = 10;	//	==	Integer i2 = Integer.valueOf(10);
		
		//	parse �迭 �޼��� : ���ڿ��� �̿�, �ش� Ÿ������ ��ȯ, �ٸ� ���·� ���
		System.out.println(Integer.parseInt("-123"));	//	���ڿ� -> ����
		System.out.println(Integer.parseInt("10", 16));	//	16���� ���ڿ� -> ����
		System.out.println(Integer.toBinaryString(28)); //	������ ���ڿ���
		System.out.println(Integer.toHexString(28));	//	16���� ���ڿ���
		
		//	����ȯ
		System.out.println(i2.doubleValue());
		
		//	����� ���� ��
		Integer i3 = Integer.valueOf(2018);
		Integer i4 = Integer.valueOf(2018);
		
		System.out.println(i3 == i4);
		
		//	��ڽ� ��
		System.out.println(i3.intValue() == i4.intValue());
		
		//	��ڽ� ��2
		System.out.println(i3.equals(i4));
	}

}
