package com.javaex.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// ������ ����
		Vector<Integer> v = new Vector<>();
		System.out.println("Size: " + v.size()
							+ ", Capacity:" + v.capacity());
		
		//	1���� 10���� ���� ��ƺ��ô�
		for (int i = 1; i <=10; i++) {
			//	���� �־�ô�
			v.addElement(i);	//	��ü�� Boxing��
			//	v.addElement(Integer.valueOf(10));
		}
		System.out.println("Size: " + v.size()
						+ ", Capacity:" + v.capacity());
		//	��뷮 �ʰ�
		v.addElement(11);
		System.out.println("Size: " + v.size()
						+ ", Capacity:" + v.capacity());
		//	�뷮 �ڵ� ����
		
		//	�߰��� ���� �־�ô�
		v.insertElementAt(5, 7);
		System.out.println(v);
		
		//	��ü ��ȸ : Ư�� �ε����� ��ü ��ȯ
		int val = v.elementAt(5);
		System.out.println(val);
		
		//	��ü �ε����� ��ȸ�� ���ô�.
		System.out.println("indexOf(7)" + v.indexOf(7));
		//	���� ��ü�� �ε���
		System.out.println("indexOf(0)" + v.indexOf(0));
		
		//	��ü ���� ���� ��ȯ
		System.out.println("contains(10)" + v.contains(10));
		
		//	��ü ����
		v.removeElement(10);
		System.out.println(v);
		
		//	������ �ϳ��� �ҷ��ͼ� ���
		for (int i = 0; i < v.size(); i++) {
			Integer item = v.elementAt(i);
			System.out.println(item);
		}
		
		//	TODO: ������ ���ô�
		
		//	���۸� ��� ���ô�.
//		v.clear();
		System.out.println("v=" + v);
		System.out.println("Size: " + v.size()
					+ ", Capacity:" + v.capacity());
		
		//	Generic�� Ȱ��
		
		Vector<? super Number> v2 = new Vector<>();
		v2.addElement(Integer.valueOf(10));
		v2.addElement(Float.valueOf(3.14159f));
//		v2.addElement(new String("Java"));	//	String�� Number�� ������� �ʾҴ�.
		System.out.println(v2);
		
		//	Enumeration�� �̿��ؼ� �׸��� ���ʴ�� ���� �� �ִ�.
		Enumeration<Integer> e = v.elements();
		
		System.out.println("Enumeration====");
		
		while(e.hasMoreElements()){
			Integer item = e.nextElement();
			System.out.println(item);
		}
	
	}
}
