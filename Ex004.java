package com.collectionex.dom;
import java.util.ArrayList;
public class Ex004 {
	public static void main(String[]args) {
		ArrayList<String> animals=new ArrayList<String>();
		animals.add("lion");
		animals.add("Tiger");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Cow");
	
		System.out.println(animals);
		
		animals.add(3,"horse");
		
		System.out.println(animals);
		
	}
}
