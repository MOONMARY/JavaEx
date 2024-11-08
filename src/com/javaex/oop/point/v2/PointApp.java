package com.javaex.oop.point.v2;

// v2
class Point {
	//필드
	private int x;
	private int y;
	
	//기본 생성자
	public Point() {
		
	}
	public Point(int x, int y) {
		//초기화
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
}

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point();
		p1.setX(5);
		p1.setY(5);
		p1.draw();
		
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(23);
		p2.draw();
	}

}