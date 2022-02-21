package com.te.javabasics;

public class StringToMethod {

	public static void main(String[] args) {
         String s = "hello world";
           System.out.println("use of toChar()");
           String s1 = s.toUpperCase();
           System.out.println("the uppercase of hello world is :"+s1);
           char[] arr = s1.toCharArray();
           for (char a :arr)
           System.out.println(a);
           
	}
}


