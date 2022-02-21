package com.te.javabasics;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value a: ");
		a = sc.nextInt();
//         in.close();
		System.out.println("Enter value b: ");
		b = sc.nextInt();
		int c = a+b;
		System.out.println("the output of a+b: " +c);
	}

}
