package com.javaex.basic.types;
import java.util.Scanner;

//논리형 (1byte) - true or false
public class BooleanEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		int var1 = 3, var2 = 5;
		boolean result = var1 > var2;
		//비교연사, 논리연산 결과를 boolean
		
		System.out.println(result);
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("a:");
		int a = sc.nextInt();
		System.out.println("b:");
		int b = sc.nextInt();
		sc.close();

		
		if (a > b) {
			System.out.println("a가 크다.");
		}
		else {
			System.out.println("b가 크다.");
		}
	}

}
