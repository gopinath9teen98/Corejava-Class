package com.te.javabasics;

public class ConstructorParameterised { //main class
	int x;
	public ConstructorParameterised(int y) { // Create a class constructor for the Main class
		x=y;
         System.out.println("contructor " +x);
	}

	public static void main(String[] args) {
		ConstructorParameterised myObject = new ConstructorParameterised(4);  // Create an object of class Main (This will call the constructor) 
                System.out.println(myObject.x);
	}

}