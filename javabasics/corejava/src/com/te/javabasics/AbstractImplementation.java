package com.te.javabasics;

public class AbstractImplementation extends AbstractClass{
        
	void abstractMethod() {
		System.out.println("from abstract class");
	}
	
	
	public static void main(String[] args) {
         AbstractImplementation abstractImplementation= new AbstractImplementation();
         abstractImplementation.abstractMethod();
         abstractImplementation.normalMethod();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
