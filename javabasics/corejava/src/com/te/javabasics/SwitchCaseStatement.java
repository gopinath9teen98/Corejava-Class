package com.te.javabasics;

import java.util.Scanner;

public class SwitchCaseStatement {

	public static void main(String[] args) {
	    String days;
		Scanner s=new Scanner(System.in); 
        System.out.println("Enter the day:"); 
        days =s.nextLine();
		switch (days) {
		case "monday":
			System.out.println("Today is Monday");
			break;
		case "tuesday":
			System.out.println("Today is tuesday");
			break;
		case "wednesday":
			System.out.println("Today is wednesday");
			break;
		case "thursday":
			System.out.println("Today is thursday");
			break;
		case "friday":
			System.out.println("Today is friday");
			break;
		case "saturday":
			System.out.println("Today is saturday");
			break;
		case "sunday":
			System.out.println("Today is sunday");
			break;

		default:
			System.out.println("invalid data");
			break;
		}
	}

}
