package com.javaex.practice;

import java.util.Scanner;

public class JavaEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program();
	}
	
	private static void Program() {
		//두개의 숫자 입력받아
		//둘 중 큰수와 작은수 분류
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력해주세욧");
		System.out.print("숫자1 : ");
		int num1 = scanner.nextInt();
		
		System.out.print("숫자2 : ");
		int num2 = scanner.nextInt();
		
		if (num1 > num2) {
			System.out.println("큰수 : " + num1 + "\t" + "작은수 : " + num2 + "입니다.");
		}
		else {
			System.out.println("큰수 : " + num2 + "작은수 : " + num1 + "입니다.");
		}
		scanner.close();
	}

}
