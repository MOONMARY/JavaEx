package com.javaex.basic.flow;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ifEx();
//		ifEx2();
//		ifEx3();
//		ifPractice01();
//		switchEx();
//		switchEx2();
		switchPractice();
	}
	
	private static void ifEx() {
		//if , else
		Scanner scanner = new Scanner(System.in);
		
//		점수를 입력 받아서 60점 이상이면 합격입니다!
		System.out.print("점수를 입력하세요:");
		int score = scanner.nextInt();
		
		if (score >= 60) {
			System.out.println("합격입니다!");
		}
		else {
			System.out.println("바보");
		}
		scanner.close();
		
	}
	
	//if , else if , else
	//정수 입력받았을 때 양수 or 0 or 음수 판단
	
	private static void ifEx2() {
		
		//일반적인 순차 조건 분기
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int num = scanner.nextInt();
		
		if (num == 0) {
			System.out.println("0입니다~");
		}
		else if(num > 0) {
			System.out.println("양수입니다.");
		}
		else {
			System.out.println("음수입니다.");
		}
		scanner.close();
	}
	
	private static void ifEx3() {
		
		//중첩 if
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int num = scanner.nextInt();
		
		if (num == 0) {
			System.out.println("0입니다!");
		}
		else {
			if (num > 0) {
				System.out.println("양수입니다.");
			}
			else {
				System.out.println("음수입니다.");
			}
		}
	}
	
	private static void ifPractice01() {
		System.out.println("과목을 선택하세요.\n"
				+ "(1.자바 2.C 3.C++ 4.파이썬)");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("과목번호 : ");
		
		int code = scanner.nextInt();
		
		if (code == 1) {
			System.out.println("R101호 입니다.");
		}
		else if (code == 2) {
			System.out.println("R102호 입니다.");
		}
		else if (code == 3) {
			System.out.println("R103호 입니다.");
		}
		else if (code == 4) {
			System.out.println("R104호 입니다.");
		}
		else {
			System.out.println("상담원에게 문의하세요~");
		}
		scanner.close();
		
	}
	
	private static void switchEx() {
		//ifPractice01 -> switch ~ case 문으로
		System.out.println("과목을 선택하세요.");
		System.out.println("(1.자바 2.C 3.C++ 4.파이썬)");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("과목번호 : ");
		
		int code = scanner.nextInt();
		
		switch(code) {
		case 1 :
			System.out.println("R101호 입니다.");
			break;
		case 2 :
			System.out.println("R102호 입니다.");
			break;
		case 3 :
			System.out.println("R103호 입니다.");
			break;
		case 4 :
			System.out.println("R104호 입니다.");
			break;
		default :
			System.out.println("상담원에게 문의하세요~");
			break;
		}
		scanner.close();
		
	}
	
	private static void switchEx2() {
		//1,3,5,7,8,10,12월 -> 31일
		//2 -> 28일
		//4,6,9,11월 -> 30일
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("월을 입력하세요 : ");
		
		int month = scanner.nextInt();
		
		switch(month) {
		case 1,3,5,7,8,10,12 :
			System.out.println("31일");
		break;
		case 4,6,9,11 :
			System.out.println("30일");
		break;
		case 2 :
			System.out.println("28일");
		break;
		default :
			System.out.println("1~12월 중에서만 입력하세요!");
			break;
		}
		scanner.close();
	}
	
	private static void switchPractice() {
		//TODO: 이 코드를 나중에 enum(열거형) 객체로 다시 만들 예정
		
		//문자열 변수에 문자열로 요일 정보를 입력
		//"SUNDAY" -> 휴식
		//"MONDAY"~"THURSDAY" -> 열공
		//"FRIDAY" -> 열공후 불금
		//"SATURDAY" -> 주말
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("요일을 영어 대문자로 작성하세유 :");
		
		String day = scanner.next().toUpperCase();
		
		switch(day) {
		case "SUNDAY" :
			System.out.println("휴식");
			break;
		case "MONDAY" :
		case "TUESDAY" :
		case "WEDNESDAY" :
		case "THURSDAY" :
			System.out.println("열공");
			break;
		case "FRIDAY" :
			System.out.println("열공 후 불금");
			break;
		case "SATURDAY" :
			System.out.println("주말");
			break;
		default:
			System.out.println("다시 쓰세유");
		}
		scanner.close();
		
		
	}

	
	
}
