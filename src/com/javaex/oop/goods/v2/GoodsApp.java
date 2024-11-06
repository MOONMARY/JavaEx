package com.javaex.oop.goods.v2;

//Goods V2. 필드
class Goods {
	//필드선언
	String name;
	int price;
}

//Goods 테스트 클래스
public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();
		//생성자를 호출 -> 인스턴스 생성 -> camera로 참조
		camera.name = "LG그램";
		camera.price = 9000_000;
		System.out.printf("name : %s, price : %,d", camera.name, camera.price);
		
		
	}
	

}
