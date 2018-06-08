package com.javaex.oop.methods;

public class MethodEx2 {

	public static void main(String[] args) {
		System.out.println(getSum(new double[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
		System.out.println(getSumVar(new double[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
		printTotal("�հ�", 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
		
	}
	
	//	���� �Ű������� ���� �μ��� �Բ� �� �� �ִ�
	public static void printTotal(String message, double ... values) {
		System.out.println(message + " " + getSumVar(values));
	}
	
	//	���� �μ��� �̿��� �ټ��� �μ� ����
	public static double getSumVar(double ... values ) {
		/*double total = 0;
		
		for (double value:values) {
			total += value;
		}
		return total;*/
		return getSum(values);
	}
	
	//	�迭�� �̿��� ���� �μ� ����
	public static double getSum(double[] values) {
		double total = 0;
		
		for (double value:values) {
			total += value;
		}
		
		return total;
	}
	

	
}
