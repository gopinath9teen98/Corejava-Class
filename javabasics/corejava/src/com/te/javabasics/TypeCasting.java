package com.te.javabasics;

public class TypeCasting {
	// type casting
	public static void main(String[] args) {
		// narrow casting
		double l = 27.6;
		short b = (short) l;
		System.out.println("value:" + b);

		// widening casting
		int myInt = 9;
		double myDouble = myInt;
		System.out.println(myDouble);
	}
}
