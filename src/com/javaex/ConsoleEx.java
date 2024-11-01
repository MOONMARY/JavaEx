package com.javaex;

import java.util.Scanner;

// Tip : Ctrl + Shift + O : 알아서 import 해준당
// Tip : Crlt + Space : 코드 자동완성

//java.lang (자바 문법에 관련된 기본적인 기능들) 은 import 안해도 됨

//Console
//표준 입력 : stdin -> System.in
//표준 출력 : stdout -> System.out
//표준 에러 : stderr -> System.err
public class ConsoleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		consoleOutput();
		consoleInput();
	}
	
	// 콘솔 입력
	public static void consoleInput() {
		//표준 입력 : stdin -> System.in
		//데이터 소스로부터 입력을 받는 Scanner 클래스를 사용
		//java.lang 이외의 기능을 불러올 때는 import 필요
		
		Scanner scanner = new Scanner(System.in);
		
		//이름, 나이 물어봐서 출력하는 프로그램
		System.out.print("너 누구야?");
		String name = scanner.next();
		
		System.out.print("몇살이야?");
		int age = scanner.nextInt();
		
		System.out.println("Welcome," + name);
		System.out.println("당신의 나이는" + age + "세 입니다."); 
		
		//시스템 자원은 다 쓰고 돌려줘야 함.
		//닫아주기!!!
		scanner.close();
	}
	
	
	// 콘솔 출력
	public static void consoleOutput() {
		//표준 출력
		//print : 개행 X
		//println : 개행 O
		//printf : 형식 지정 문자열 출력
		System.out.print("Hello");		//개행X
		System.out.println("Java!");	//개행O
		System.out.println("Java!");	//개행O
		
		//이스케이프 문자
		System.out.println("Hello\nJava");		// \n : 개행문자
		System.out.println("Hello\tJava");		// \t : 탭
		System.out.println("Hello, \"Java!\"");
		
		System.out.println("\\: 역슬래시");		// \\ -> \ : 하나 쓰려면 역슬래시2개 써야함
	}

}
