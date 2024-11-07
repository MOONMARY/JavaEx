package com.javaex.oop;

public class MethodEx {
	
	//매서드 작성 연습
	//매개변수 -> 입력, 리턴 -> 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//매개변수 X, 리턴 X
//		printMessage();
		//매개변수 X, 리턴 O
//		String message = getMessage();
//		System.out.println("getMessage: " + message);
		//매개변수 O, 리턴 X
//		printSum(10,20);
		//매개변수 O, 리턴 O
//		System.out.println(getSum(10,20));
//		System.out.println(getSum(10,20,30));
		
		//매개변수 개수를 알 수 없을 때의 해결방법
		//방법1. 배열을 전달한다
		System.out.println("getSumArr:" + getSumArr(new double[] {1, 2, 3, 4, 5, 6, 7, 8}));
		
		//방법2. 가변인수를 사용한다
		System.out.println("getSumVar: " + getSumVar(1, 2, 3, 4, 5, 6, 7, 8));
	}
	//방법2
	private static double getSumVar(double ... values) {
		double total = 0;
		
		for (double value: values) {
			total += value;
		}
		return total;
	}
	//방법1
	private static double getSumArr(double[] values) {
		double total = 0;
		
		for (int i = 0; i < values.length; ++i) {
			total += values[i];
		}
		
		return total;
	}
	
	
	
	
	//매개변수 X -> 파라미터 X
	//리턴 X -> void
	private static void printMessage() {
		System.out.println("매개변수 없고, 리턴도 없음");
	}
	
	//매개변수 X -> 파라미터 X
	//리턴 O -> 리턴 데이터타입 명시
	private static String getMessage() {
		//return으로 데이터 변환
		return "입력은 없지만, 출력은 있는 매서드";
	}
	
	//매개변수 O -> 파라미터 O
	//리턴 X -> void
	private static void printSum(double num1, double num2) {
		System.out.println(num1 + num2);
	}
	
	//매개변수 O -> 파라미터 O
	//리턴 O -> 리턴 데이터타입 명시
	private static double getSum(double num1, double num2) {
		return num1 + num2;
	}
	
	//매서드 오버로딩 (초과적재) -> 다형성의 일부
	private static double getSum(double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}
}
