package com.javaex.practice;

import java.util.Scanner;

public class JavaEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program();
	}
	private static void Program() {
		//태어난 년도 입력받기
		//15세미만, 65세이상 -> "(나이)살 무료예방접종 대상자 입니다" 출력
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("태어난 년도를 입력해 주세요");
		System.out.print("태어난 년도 : ");
		int year = scanner.nextInt();
		int Y = 2024 - year;
		
		if (Y >= 15 && Y < 65) {
			System.out.println(Y + "살 무료예방접종 대상자 아닙니다.");
		}
		else {
			System.out.println(Y + "살 무료예방접종 대상자 입니다.");
		}
		scanner.close();
	}
}
