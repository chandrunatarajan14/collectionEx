package com.collectionex.dom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex003 {
	public static void main(String[] args) {
			 List<String> str=new ArrayList<String>();
			 
			str.add("Welcome");
			str.add("code");
			str.add("String");
			str.add("hello");
			str.add("Array");
			str.add("store");
			
		   printWords(str);
			
			
	}
		public static void printWords(List<String> str) {
      Scanner sc=new Scanner(System.in);
		System.out.println("Enter length: ");
        int length=sc.nextInt();
          
        for(int i=0;i<str.size();i++) {
        	String n=str.get(i);
        	   
              if(n.length()==length) {
            	  System.out.println(n);
              }
        	
        }
}}
