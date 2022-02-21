package com.te.javabasics;

public class MethodOverloading {
	public void M1(float a,int b) {
		System.out.println("M1 method");
	}
	public void M1(int b , int c) {
		System.out.println("M2 method");
	}
	

	public static void main(String[] args) {
              MethodOverloading methodOverloading = new MethodOverloading();
              methodOverloading.M1(1.0f,9);
              methodOverloading.M1(2,3);
              
	}

}
