package com.javaex.conditional;

public class SwitchEx3 {
	public static void main(String[] args) {
		// 나중에 이 코드를 enum으로 다시 만들 예정
		
		String day = "BIRTHDAY";
		String act;
		
		switch (day) {
		case "SUNDAY":
			act = "휴식";
			break;
		case "MONDAY":
		case "TUESDAY":
		case "WEDNESDAY":
		case "THURSDAY":
			act = "열공";
			break;
		case "FRIDAY":
			act = "열공 후 불금";
			break;
		case "SATURDAY":
			act = "방전";
			break;
		default:
			act = "여긴 어디?";
		}
		System.out.println(act);
		
	}
}
