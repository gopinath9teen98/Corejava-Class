package com.te.javabasic;

public class Benz implements Car{

	@Override
	public void start() {
		System.out.println("Benz is starting");
	}

	@Override
	public void acce() {
		System.out.println("benz is accelerating");
		
	}

	@Override
	public void breaks() {
		System.out.println("benz is break");
		
	}

}
