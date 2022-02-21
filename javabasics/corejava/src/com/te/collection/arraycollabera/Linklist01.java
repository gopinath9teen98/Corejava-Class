package com.te.collection.arraycollabera;

import java.util.LinkedList;
//import java.util.Linkedlist;

public class Linklist01 {

	public static void main(String[] args) {
		LinkedList linkedlist= new LinkedList();
		linkedlist.add("hello world");
		linkedlist.add(767);
		linkedlist.add('v');
	     
		 for(Object object : linkedlist) {
			 System.out.println(object);
		 }
	}

}
