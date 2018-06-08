package com.javaex.collection.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// ���� ����
		Stack<Integer> stack = new Stack<>();
		
		// ���� 10�� push
		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}
		System.out.println(stack);
		
		//pop�� �� ���ô� : ��� ��ġ�� Ȯ��
		System.out.println(stack.pop());
		System.out.println(stack);
		
		//peek�� �غ��ô�
		System.out.println(stack.peek());
		System.out.println(stack);
		
//		while(true) {
//			System.out.println(stack.pop());
//		}
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
	}

}
