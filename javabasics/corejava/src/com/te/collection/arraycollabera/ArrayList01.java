package com.te.collection.arraycollabera;

import java.util.ArrayList;


public class ArrayList01 {

	public static void main(String[] args) {
         ArrayList arraylist = new ArrayList();
         arraylist.add("hello world");
         arraylist.add(7);
         arraylist.add('v');
         
       for(Object object : arraylist) {
    	   System.out.println(object);
       }
	}
}
