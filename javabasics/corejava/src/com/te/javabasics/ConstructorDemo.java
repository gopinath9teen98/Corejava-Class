package com.te.javabasics;

public class ConstructorDemo { //main class
	int x;
	public ConstructorDemo() { // Create a class constructor for the Main class
		int x=5;
         System.out.println("contructor " +x);
	}

	public static void main(String[] args) {
		ConstructorDemo myObject = new ConstructorDemo();  // Create an object of class Main (This will call the constructor) 
                System.out.println(myObject.x); // Print the value of x
	}

}
