package com.javaex.basic.types;

//Casting (형변환)
//특정 자료를 다른 자료형으로 바꾸는 작업
public class CastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testPromotion();
		testCasting();
	}
	
	private static void testCasting() {
		//강제 casting
		//표현 범위가 넓은 자료형 -> 표현 범위가 좁은 자료형
		//자료 유실 위험! -> 강제로 변환해줘야 함
		byte b;
		int i = 2024;
		float f = 123.456f;
		
		b = (byte)i;
		System.out.println(i);
		System.out.println(b);
		
		//실수 -> 정수 Casting
		i = (int)f;
		System.out.println(f);
		System.out.println(i);
	}

	private static void testPromotion() {
		// 암묵적 casting
		// 표현 범위가 좁은 자료형 -> 표현 범위가 넓은 자료형
		// 변환하지 않아도 자동으로 변환
		byte b = 25; // 1바이트 정수
		System.out.println(b);

		short s = b; // 2바이트 정수
		System.out.println(s);

		int i = s; // 4바이트 정수
		System.out.println(i);

		long l = i; // 8바이트 정수
		System.out.println(l);

		float f = l; // 4바이트 실수
		System.out.println(f);

		double d = f; // 8바이트 실수
		System.out.println(d);

//		char ch = 'A';
//		short s2 = ch2;
//		int i2 = ch;
	}

}
