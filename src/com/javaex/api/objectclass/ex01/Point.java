package com.javaex.api.objectclass.ex01;

//object ex01
public class Point {
	private int x;
	private int y;
	
	//생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
}
