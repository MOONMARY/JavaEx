package com.javaex.practice04;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3의 배수의 개수와 합
		
		int[] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
		//data[i]%3==0 -> 3의 배수
		
		int count = 0;
		int sum = 0;
		
		for (int i = 0; i < data.length; i++) {
			//data[i] % 3;
			if (data[i]%3 == 0) {
				count++;
				sum += data[i];
			}
		}
		System.out.println("주어진 배열에서 3의 배수의 개수 : " + count);
		System.out.println("주어진 배열에서 3의 배수의 합 : " + sum);
		
	}

}
