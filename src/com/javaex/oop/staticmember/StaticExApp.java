package com.javaex.oop.staticmember;

public class StaticExApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//첫번째 인스턴스가 생성되기 전에 클래스가 먼저 메모리에 로드
		//static 블록에서 static영역 초기화 -> 생성자 호출
		StaticEx s1 = new StaticEx();	//인스턴스생성
		System.out.println("refCount: " + StaticEx.refcount);
		
		StaticEx s2 = new StaticEx();	//인스턴스생성
		System.out.println("refCount: " + StaticEx.refcount);
		
		//s1 참조해제
		s1 = null;
		System.gc();	//가비지 컬렉터 호출 -> 직접 호출은 사양(가급적 사용하지마)
		try {
			Thread.sleep(3000);	//3초간 대기
			System.out.println("refCount: " + StaticEx.refcount);
		} catch (Exception e) {
			
		}
		
	}

}
