package com.collectionex.dom;
import java.util.LinkedList;
import java.util.List;

public class Ex005 {

	public static void main(String[]args) {
		LinkedList<String> languages=new LinkedList<String>();
		languages.add("C");
		languages.add("C++");
		languages.add("Java");
		languages.add("Kotlin");
		languages.add("Python");
		languages.add("Peri");
		languages.add("Ruby");
		
		System.out.println(languages);
		
		languages.remove(5);
		System.out.println(languages);
		
		languages.remove("Kotlin");
		System.out.println(languages);
		
		LinkedList<String> script=new LinkedList<String>();
		script.addLast("Python");
		script.addLast("Ruby");
		script.addLast("Peri");
		
		languages.removeAll(script);
		System.out.println(languages);
		
		languages.clear();
		System.out.println(languages);
	}
}
