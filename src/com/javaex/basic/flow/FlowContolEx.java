package com.javaex.basic.flow;

public class FlowContolEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		contineEx();
		BreakEx();
	}
	
	private static void contineEx() {
		//continue: 반복 블록 내부에서 남아있는 문장을 실행하지 않고 다음번 루프로 진행
		//1~100루프를 돌면서 2의 배수와 3의 배수가 아닌 숫자만 출력
		
		for(int i = 1;
			i <= 100;
			++i) {
			if (i % 2 == 0 || i % 3 == 0) continue;
			System.out.println(i);
		}
	}
	
	public static void BreakEx() {
		//break: 반복 블록 내부에서 남아있는 문장은 실행하지 않고 블록을 탈출한다
		//6과 14로 모두 나누어 떨어지는 수를 구하자
		
		int num = 1;
		
		while (true) {
			if (num % 6 == 0 && num % 14 == 0)
				break;	//루프탈출
			++num;
		}
		System.out.println("6과 14의 최소공배수(단순무식 버전):" + num);
	}

}
