package com.javaex.reftype;

public class EnumEx2 {
	public static void main(String[] args) {
		Week today = Week.THURSDAY;
		String act;
		
		switch(today) {
			case SUNDAY:
				act = "�޽�";
				break;
			case MONDAY:
			case TUESDAY:
			case WEDNESDAY:
			case THURSDAY:
				act = "����";
				break;
			case FRIDAY:
				act = "���� �� �ұ�";
				break;
			case SATURDAY:
				act = "�׳� �߷�";
				break;
			default:
				act = "�� ����?";
		}
		System.out.println(act);
	}
}
