package com.te.javabasic;

public class CarTest {
	public static void main(String[] args) {
		Car car=CarFactory.getcar();
		Driver driver=new Driver();
		driver.drive(car);
	}

}
