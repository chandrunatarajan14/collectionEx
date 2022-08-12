package com.collectionex.dom;
import java.util.ArrayList;
import java.util.List;
import java.util.List.*;


public class Ex002 {
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

	public  static void printWords(List<String> str) {
		for(String words:str) {
		
			if(str.length()==5) {
				System.out.println(str);
			}
		}
		}
	

}
