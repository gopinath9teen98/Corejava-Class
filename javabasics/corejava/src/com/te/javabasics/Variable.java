package com.te.javabasics;

public class Variable {
	static int d = 23;
	int a = 9; // instance variable

	public static void main(String[] args) {
		Variable variable = new Variable();

		System.out.println(variable.a);
		int b = variable.a;
		System.out.println(variable.d);
		int i; // local variable
		i = 19;
		i = 12;
		System.out.println(i);

		System.out.println(b);
	}

}
