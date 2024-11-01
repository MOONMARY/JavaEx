package com.javaex.basic.opers;

public class CondOperEx {
	
	//3항 연산자
	//조건에 따라 선택적으로 값을 선택하는 연산자

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		//a가 짝수면 true, 홀수면 false
		if (a % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		String result;
		result =  a % 2 == 0 ? "짝수" : "홀수";
		System.out.println(result);
		
		//점수 80점 이상이면 Good
		//점수 50 ~ 80 사이면 Pass
		//점수 50점 안되면 Fail
		
		String message;
		int score = 85;
		message = (score >= 80) ? "Good":
			(score >= 50) ? "Pass": "Fail";
		System.out.println(score + "결과:" + message);
		// 추천하는 방법은 아님..
		
		
	}

}
