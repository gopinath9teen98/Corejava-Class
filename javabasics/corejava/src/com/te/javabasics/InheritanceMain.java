package com.te.javabasics;

public class InheritanceMain extends InheritanceProgram {
         public void m2() {
        	 System.out.println("m2 method");
         }
	public static void main(String[] args) {
                      
		InheritanceMain inheritanceMain = new InheritanceMain();
		inheritanceMain.m1();
		inheritanceMain.m2();
	}

}
