package com.te.javabasics;

public class OverridingSecond extends Overriding{
public void parenta() {
//	super.m1();
	System.out.println("from child A");
}
public void m1() {
//	super.m1();
	System.out.println("from child m1 method");
}
public void parentb() {
	super.m1();
    System.out.println("from child B");
    super.m1();
}																											

	public static void main(String[] args) {
      OverridingSecond overridingSecond=new OverridingSecond();
      overridingSecond.parenta(); 
      overridingSecond.m1();
      overridingSecond.parentb();
		
	}

}
