package com.te.javabasics;

public class StaticNonStaticBlock {
	public StaticNonStaticBlock() {
		
		System.out.println("staticandnonstaticblock conrtuctor ");
	}
	
	static {
		System.out.println("static block");
	}
	public void m1(){
		 System.out.println("non-static block");
	}
}

	
