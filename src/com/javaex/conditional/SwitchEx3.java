package com.javaex.conditional;

public class SwitchEx3 {
	public static void main(String[] args) {
		// ���߿� �� �ڵ带 enum���� �ٽ� ���� ����
		
		String day = "BIRTHDAY";
		String act;
		
		switch (day) {
		case "SUNDAY":
			act = "�޽�";
			break;
		case "MONDAY":
		case "TUESDAY":
		case "WEDNESDAY":
		case "THURSDAY":
			act = "����";
			break;
		case "FRIDAY":
			act = "���� �� �ұ�";
			break;
		case "SATURDAY":
			act = "����";
			break;
		default:
			act = "���� ���?";
		}
		System.out.println(act);
		
	}
}
