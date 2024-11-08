package com.javaex.oop.point.v4;

// v4. 상속
class Point {
	//필드
	protected int x;	//상속받은 자식이 접근을 허용할 수 있게 함
	protected int y;
	
	//기본 생성자
//	public Point() {
//	}
	//초기화
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//Getters(내부에서 데이터 가져와서 돌려준다)
	//Setters(외부에서 데이터 가져와서 저장한다)
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	//메서드
	public void draw() {
		System.out.printf("점 [x=%d, y=%d]을 그렸습니다.%n", x, y);
	}
	
	//메서드 오버로딩
	//한 클래스 내에 같은 이름을 가진 메서드
	//각 메서드는 매개변수의 타입, 순서, 개수에 따라 구별
	public void draw(boolean bshow) {
		String message = String.format("점[x=%d, y=%d]을 ",x, y);
		message += bshow ? "그렸습니다.":"지웠습니다." ;
		System.out.println(message);
	}
	
}
//포인트 상속받아 ColorPoint 클래스
class ColorPoint extends Point {
	//필드
	//x,y,draw는 상속받음 (Point에 있음)
	private String color;
	
	/*
	//생성자
	public ColorPoint() {
		//특별히 지정하지 않으면 부모의 기본 생성자 super()를 선택한다
		super();
	}
	*/
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);	//부모 초기화
		this.color = color;	//자식 초기화
	}
	public ColorPoint(String color) {
//		super(0,0);
//		this.color = color;
		this(0,0,color);
	}
	
	//getters	setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//draw 메서드를 상속받았으나 약간 부족하니 새로 선언한다
	@Override
	public void draw() {
		System.out.printf("색상점[x=%d, y=%d, color=%s]를 그렸습니다.\n",x, y, color);
	}
	
	//overrid는 ColorPoint 여기 안에서만 쓸 수 있다.
	//Point에서 쓰면 안된다
	@Override
	public void draw(boolean bshow) {
		String message = String.format("색상점[x=%d, y=%d, color=%s]를",x, y, color);
		message += bshow ? "그렸습니다.":"지웠습니다." ;
		System.out.println(message);
		
		//override 했지만 부모의 기능을 사용해야 할 때
		super.draw(bshow);
	}
}


public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Point p1 = new Point();
//		p1.setX(5);
//		p1.setY(5);
		Point p1 = new Point(5,5);
		p1.draw();
		p1.draw(true);
		p1.draw(false);
		
//		Point p2 = new Point();
//		p2.setX(10);
//		p2.setY(23);
		Point p2 = new Point(10,23);
		p2.draw();
		p2.draw(true);
		p2.draw(false);
		
		ColorPoint cp1 = new ColorPoint("red");
		cp1.draw();
		cp1.draw(true);
		
		
		ColorPoint cp2 = new ColorPoint(10,10,"blue");
		cp2.draw();
		cp2.draw(false);
	}

}