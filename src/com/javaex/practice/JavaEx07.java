package com.javaex.practice;

import java.util.Scanner;

public class JavaEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		agePg();
	}
	private static void agePg() {
		//나이를 입력받아
		//입장료가 출력되도록 프로그램 작성
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		System.out.println("나이 : ");
		
		int age = scanner.nextInt();
		
		if (age <= 7) {
			System.out.println("취학전아동/무료 입니다.");
		}
		else if (age > 7 && age < 14) {
			System.out.println("초등학생/2000원 입니다.");
		}
		else if (age > 13 && age < 17) {
			System.out.println("중학생/3000원 입니다.");
		}
		else if (age > 16 && age < 20) {
			System.out.println("고등학생/4000원 입니다.");
		}
		else {
			System.out.println("성인/5000원 입니다.");
		}
		scanner.close();
	}
}
