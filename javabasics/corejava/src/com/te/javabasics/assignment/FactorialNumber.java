package com.te.javabasics.assignment;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		int i, fact = 1;
		int number = 5;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = s.nextInt();
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}

}
