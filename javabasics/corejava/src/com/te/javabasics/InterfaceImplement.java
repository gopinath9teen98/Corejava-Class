package com.te.javabasics;

public class InterfaceImplement implements InterfaceA{
	
	public void name() {
		System.out.println("Ares");
	}

	public void address() {
		System.out.println("bangalore");
	}

	public void contact() {
		System.out.println("0987654321");
	}
	public void contactA() {
		System.out.println("hello world");
	}
     
	public static void main(String[] args) {
             InterfaceImplement interfaceImplement = new InterfaceImplement();
             interfaceImplement.name();
             interfaceImplement.address();
             interfaceImplement.contact();
             interfaceImplement.contactA();
	}

}
