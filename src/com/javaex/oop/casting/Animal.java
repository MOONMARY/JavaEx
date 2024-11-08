package com.javaex.oop.casting;

public class Animal {
	protected String name;
	
	//생성자
	public Animal(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.printf(name + " is eating\n");
	}
	public void walk() {
		System.out.printf(name + " is walking\n");
	}
}
