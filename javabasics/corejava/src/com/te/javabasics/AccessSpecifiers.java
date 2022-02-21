package com.te.javabasics;

public class AccessSpecifiers {
	public void m1() {
		System.out.println("public access specifier");
	}

	protected void m2() {
		System.out.println("protected access specifier");
	}

	void m3() {
		System.out.println("void access specifier");
	}

	private void m4() {
		System.out.println("private access specifier");
	}

	public static void main(String[] args) {
		AccessSpecifiers accessSpecifier = new AccessSpecifiers();
		accessSpecifier.m1();
		accessSpecifier.m2();
		accessSpecifier.m3();
		accessSpecifier.m4();

	}

}
