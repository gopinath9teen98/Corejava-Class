package com.te.javabasics;

public class ContructorArray {
	
	public ContructorArray(String city){
		
		System.out.println(city);
	}

	public static void main(String[] args) {
		ContructorArray contructorarray = new ContructorArray("chennai");
		ContructorArray contructorarray1 = new ContructorArray("kochi");
		ContructorArray contructorarray2 = new ContructorArray("banglore");
		ContructorArray contructorarray3 = new ContructorArray("mumbai");
		ContructorArray contructorarray4 = new ContructorArray("delhi");
	}
}
