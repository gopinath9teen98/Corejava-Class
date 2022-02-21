package com.te.javabasics;

public class Method {

		static public void m2() {
			System.out.println("static m2 method");
			}
		public void m1() {
			System.out.println("m1 method");
		}
	
	
	
	public static void main(String[] args) {
        Method method = new Method();
        
        method.m1();
        Method.m2();
	}

}
