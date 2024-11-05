package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 5개를 입력해봐");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int e = scanner.nextInt();
		
		float sum = (a+b+c+d+e)/5;
		
		System.out.printf("평균은 %.4s 입니다.", sum);
		//int array[] = {a,b,c,d,e};
		scanner.close();
	}

}
