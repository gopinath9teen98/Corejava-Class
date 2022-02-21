package com.te.javabasics;

public class ArrayExampleForLoop {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int i, x;
		System.out.println("For Loop:");
		// iterating over an array
		for (i = 0; i < arr.length; i++) {

			// accessing each element of array
			x = arr[i];
			System.out.println(x + " ");
		}
	}

}
