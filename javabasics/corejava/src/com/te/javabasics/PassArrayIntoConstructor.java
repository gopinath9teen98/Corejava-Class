package com.te.javabasics;

public class PassArrayIntoConstructor
{
    private static void printArray(String[] StringArray){
        System.out.println("Array contents printed through method:");
       for(String val: StringArray)
          System.out.println(val + " ");
    }
    public static void main(String[] args) {
            String[] StringArray = {"bangalore","chennai","kochi"};
     
         printArray(StringArray);
    }
}
