package com.te.javabasics;

public class ArrayForEachLoop {
            //forEach Loop
	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int x;
         System.out.println("For Each Loop:");
        // iterating over an array
        for (int i : ar) {
  
            // accessing each element of array
            x = i;
            System.out.println(x + " ");
        }
	}
}
