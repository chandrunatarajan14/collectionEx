package com.collectionex.dom;
import java.util.ArrayList;

public class Ex001 {

	public static void main(String arg[]) {
		ArrayList<Integer> num=new  ArrayList<>();
		num.add(11);
		num.add(56);
		num.add(34);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(81);
		num.add(19);
		num.add(10);
		
	 int evenSum=findSum(num);
		System.out.println("Even sum  "  +evenSum);
	}

	private static int findSum(ArrayList<Integer> num) {
		int evenSum=0;
		for(int i=0;i<num.size();i++) {
			int n=num.get(i);
			if(n%2==0) {
				evenSum= evenSum+n;
			}
		}
	
		return evenSum;
	}
}
