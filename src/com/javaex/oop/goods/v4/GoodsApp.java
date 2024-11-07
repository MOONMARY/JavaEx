package com.javaex.oop.goods.v4;

//Goods V4. this
//this : 현재 인스턴스 자체
//this(...) : 현재 클래스 내부의 다른 생성자를 지칭

class Goods {
	private String name;
	private int price;
	
	//생성자
	public Goods(String name) {
		this.name = name;
	}
	public Goods(String name, int price) {
		//this.name = name;
		this(name);	//다른 생성자 호출
		this.price = price;
	}
	
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
		System.out.printf("가격: %,d원\n", price);
	}
}
//Goods 테스트 클래스
public class GoodsApp {

	public static void main(String[] args) {
//		Goods camera = new Goods();
//		camera.setName("Nikon");
//		camera.setPrice(400_000);
		
		Goods camera = new Goods("Nikon", 400_000);
		camera.showInfo();
	}
}
