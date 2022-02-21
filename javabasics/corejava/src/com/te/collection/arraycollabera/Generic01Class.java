package com.te.collection.arraycollabera;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Generic01Class {

	public static void main(String[] args) {
                 List <Employee> list= new LinkedList<Employee>();
                 list.add(new Employee(11,"ares","bangalore"));
                 list.add(new Employee(21,"Eric","chennai"));
                 list.add(new Employee(31,"otis","kerala"));
                
                 
                 for(Employee employee : list) {
                	 System.out.println(employee);
                 }
      }

}
