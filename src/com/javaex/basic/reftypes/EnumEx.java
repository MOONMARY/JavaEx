package com.javaex.basic.reftypes;

public class EnumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		usingEnum();
		switchEnumPractice();
		//switchPractice()의 enum 버전
		
	}
	
	private static void usingEnum() {
		Week today = Week.TUESDAY;
		
		System.out.printf("Today if %s(%d)%n",today.name(), today.ordinal());
		
		String dayStr = "FRIDAY";
		//String -> 열거 상수 Convert
		Week obj = Week.valueOf(dayStr);
		System.out.printf(obj.name() + " " + obj.ordinal());
		
		//열거 상수 목록
		System.out.println("Enum Week");
		Week [] days = Week.values();
		
		for (int i = 0; i < days.length; ++i) {
			Week day = days[i];
			System.out.printf("%s -> %d%n", day.name(), day.ordinal());
		}
		
		//compareTo : 두 객체 사이의 순서를 비교하는 매서드
		Week otherDay = Week.FRIDAY;
		//TUESDAY 와 FRIDAY의 순번 비교
		System.out.println(today.compareTo(otherDay));
	}
	
	private static void switchEnumPractice() {
		//ConditionalEx::switchPractice의 enum버전
		Week day = Week.TUESDAY;
		String action;
		
		switch(day) {
		case SUNDAY:
			action = "휴식";
			break;
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
			action = "열공";
			break;
		case FRIDAY:
			action = "열공 후 불금";
			break;
		case SATURDAY:
			action = "주말";
			break;
		default:
			action = "뭐야";
			break;
		}
		System.out.println(day.name() + "에는" +  action);
	}

}
