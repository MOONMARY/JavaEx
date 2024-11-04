package com.javaex.practice;

import java.util.Scanner;

public class JavaEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMI();
	}
	private static void BMI() {
		//키, 몸무게 입력받아
		//BMI 계산 후 저체중, 정상체중, 과체중 구분출력
		//18.5 <= BMI <= 24.9
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해 주십시오.");
		System.out.print("키 : ");
		double length = scanner.nextDouble();
		System.out.print("몸무게 : ");
		double height = scanner.nextDouble();
		
		double leng = length / 100;
	
		double Bmi = height/(leng * leng);
		
		if (Bmi < 18.4) {
			System.out.println("저체중입니다. bmi = " + Bmi);
		}
		else if (Bmi > 25) {
			System.out.println("과체중입니다.bmi = " + Bmi);
		}
		else {
			System.out.println("정상체중입니다.bmi = " + Bmi);
		}
		scanner.close();
	}

}
