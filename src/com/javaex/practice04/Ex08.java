package com.javaex.practice04;

import java.util.Random;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[45];
		
		for (int i = 0; i < 45; i++) {
			num[i] = i + 1;
		}
		//랜덤하게 섞기
		Random random = new Random();
		
		for (int i = 0; i < num.length; i++) {
			//현재 인덱스와 랜덤한 인덱스의 값을 서로 교환
			int randomIndex = random.nextInt(45);
			int temp = num[i];
			num[i] = num[randomIndex];
			num[randomIndex] = temp;
		}
		System.out.println("미니로또 번호: ");
		for (int i = 0; i < 6; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
