package com.javaex.oop.goods.v2;

//Goods V2. 접근제한자
class Goods {
	//필드선언 -> private
	//정보는 은닉하고 Getter와 Setter를 통한 우회 접근이 필요
	//데이터를 다루는 기능 (메서드) 함께 구현
	private String name;
	private int price;
	
	//Getters	Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		//this : 현재 인스턴스 자체
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//일반 메서드
	public void showInfo() {
		System.out.println("상품명: " + name);
		System.out.printf("가격: %,d원%n" + price);
	}
	
}
//Goods 테스트 클래스
public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();
		//생성자를 호출 -> 인스턴스 생성 -> camera로 참조
//		camera.name = "Nikon";
//		camera.price = 400_000;
		
		camera.setName("Nikon");
		camera.setPrice(400_000);
		
//		System.out.printf("name : %s , price : %d", camera.name, camera.price);
//		System.out.printf("name : %s , price : %,d", camera.getName(), camera.getPrice());
		camera.showInfo();
	}
}
