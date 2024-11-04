package com.javaex.practice;

import java.util.Scanner;

public class JavaEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		agePg();
	}
	private static void agePg() {
		//나이 입력받아
		//19이상 65미만 = 1번그룹
		//나머지 = 2번그룹
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이 : ");
		
		int age = scanner.nextInt();
		
		if (age < 19 || age >= 65) {
			System.out.println("2번그룹 입니다.");
		}
		else {
			System.out.println("1번그룹 입니다.");
		}
		scanner.close();
	}
}
