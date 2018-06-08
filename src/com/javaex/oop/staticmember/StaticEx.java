package com.javaex.oop.staticmember;

public class StaticEx {
	public static int refCount;	//	Ŭ���� ����
	public static String classVar;	//	Ŭ���� ����
	public String instanceVar;	//	�ν��Ͻ� ����

	// ����ƽ ������� Ŭ���� ���� �ʱ�ȭ
	static {
		refCount = 0;
		classVar = "Static Member";
		System.out.println("Static Block");
//		instanceVar = "Instance Var"
		//	static ���������� static�� ���� ����
	}
	
	//	������
	public StaticEx() {
		refCount++;
		System.out.println("refCount: " + refCount);
		System.out.println("Instance Created");
	}
	
	protected void finalize() throws Throwable {
		refCount--;
		super.finalize();
		System.out.println("Finalize Called");
	}
}
