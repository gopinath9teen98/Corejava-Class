package com.te.javabasics;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		System.out.println("Program Start:-");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Value of A: ");
		int a = scanner.nextInt();
		System.out.println("Enter the Value of B: ");
		int b = scanner.nextInt();
		double c = a / b;
		System.out.println("the output value of " + a + "/" + b + " is " + c);
		System.out.println("Program End");
	}
}
