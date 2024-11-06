package com.javaex.oop.goods.v1;

//Goods V1. 필드
class Goods {
	//필드선언
	String name1;
	int price1;
	String name2;
	int price2;
}

//Goods 테스트 클래스
public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();
		//생성자를 호출 -> 인스턴스 생성 -> camera로 참조
		camera.name1 = "LG그램";
		camera.price1 = 9000_000;
		camera.name2 = "머그컵";
		camera.price2 = 2000;
		System.out.printf("상품이름 : \"%s\" , 가격 : %,d%n",camera.name1, camera.price1);
		System.out.printf("상품이름 : \"%s\" , 가격 : %,d%n",camera.name2, camera.price2);
		
		
	}
	

}
