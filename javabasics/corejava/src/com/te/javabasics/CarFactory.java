package com.te.javabasic;

import java.util.Scanner;

public class CarFactory {
	public static Car getcar() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the car name");
		String carName=scanner.next();
		if(carName.equalsIgnoreCase("bmw")) {
			Bmw bmw=new Bmw();
			return bmw;
		}else if(carName.equalsIgnoreCase("audi")) {
			return new Audi();
		}else if(carName.equalsIgnoreCase("benz")) {
			return new Benz();
		}else {
			return null;
		}
		
	}
	

}
