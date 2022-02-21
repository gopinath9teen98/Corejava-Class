package com.te.javabasics;

public class StringClass {

	public static void main(String[] args) {
		String s1 = "Hello ";
		String s2 = s1.concat("World");
		System.out.println(s2);
		int s3=s2.compareTo(s1);
		System.out.println(s3);
	}

}
