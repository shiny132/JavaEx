package com.javaex.reftype;

public class ArrayEx {

	public static void main(String[] args) {
		//	�迭�� ����
		String[] names; //	Type []
		int scores[]; //	�ĺ��� []
		
		//	�ʱ�ȭ
		names = new String[] {
			"��",
			"��",
			"��",
			"��"
		};
		
		//	�� ����� �ִٸ�
		float height[] = {
				175.3f,
				170.2f,
				165.3f,
				188
		}; //	����� ���ÿ� �� ���� ȿ��
		
		scores = new int[4];
		
		//	�ε��� ����
		//	0���� ����
		//	�� ���� -1 ����
		
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 88;
//		scores[4] = 100;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%s (%.2f) : score = %d%n", names[i], height[i], scores[i]);
		}
	}
}
