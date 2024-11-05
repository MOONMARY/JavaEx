package com.javaex.practice04;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doubleArray();
	}
	
	private static void doubleArray() {
		double[] arr = new double[3];
		
		arr[0] = 1.2;
		arr[1] = 3.3;
		arr[2] = 6.7;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
