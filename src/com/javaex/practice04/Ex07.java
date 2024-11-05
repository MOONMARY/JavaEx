package com.javaex.practice04;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		//정수로 된 돈의 액수를 입력받아
		//50000, 10000, 5000, 1000, 500, 100, 50, 1
		//각각 몇 개롤 변환되는지 작성
		
		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액 : ");
		
		int amount = scanner.nextInt();
		
		for (int i = 0; i < wonArray.length; i++) {
			int count = amount / wonArray[i];
			
			if (count > 0) {
				//System.out.printf("%s원: %s개%n",wonArray[i],count);
				amount %= wonArray[i];
			}
			System.out.printf("%s원: %s개%n",wonArray[i],count);
		}
	}
}
