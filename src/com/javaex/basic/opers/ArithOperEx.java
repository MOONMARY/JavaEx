package com.javaex.basic.opers;

public class ArithOperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		arithBasic();
		incrOpers();
	}
	
	private static void incrOpers() {
		//증감 연산자 (1항 연산)
		//++ --
		//앞에 붙으면 : 전위 증감
		//뒤에 붙으면 : 후위 증감
		int a = 7;
		System.out.println("전위증감");
		System.out.println("a:" + a);
		System.out.println("++a:" + ++a);
		System.out.println("final a:" + a);
		
		System.out.println("후위증감");
		a = 7;	//원상복구
		System.out.println("a:" + a);
		System.out.println("a++:" + a++);
		System.out.println("final a:" + a);
	}
	
	private static void arithBasic() {
		//기초 산술 연산자
		int a = 7, b = 3;
		
		System.out.println(a + b);	//덧셈
		System.out.println(a - b);	//뺄셈
		System.out.println(a * b);	//곱셈
		System.out.println(a / b);	//나눗셈
		// int / int = int
		System.out.println(a % b);	//나머지
		
		//정수끼리의 나숫셈을 실수로 얻고자 한다면
		//Casting
		System.out.println((float)a/(float)b);
		System.out.println((float)a/b);
		System.out.println(a/(float)b);
	}

}
