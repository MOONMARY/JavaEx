package com.javaex.basic.flow;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ifEx();
//		ifEx2();
//		ifEx3();
//		ifPractice01();
		switchEx();
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

	
	
}
