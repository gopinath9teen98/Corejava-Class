package com.te.javabasics;

public class FinalKeyword01 extends FinalKeyword{
					public void  m1() {
						System.out.println("final from child");
					}

	public static void main(String[] args) {
           FinalKeyword01 finalKeyword01=new FinalKeyword01();
           finalKeyword01.m1();
		
	}

}
