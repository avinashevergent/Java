package com.collection.practice;
import java.util.ArrayList;

public class ArrayListAvi {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		System.out.println(al.isEmpty());
		
		
		al.add(1);
		al.add(22);
		al.add(33);
		
		ArrayList al2=new ArrayList();
		al2.add(1);
		al2.add(22);
		
		System.out.println(al);
		System.out.println(al.isEmpty());
	
		
		System.out.println(al.contains("Nallu"));
		System.out.println(al.contains(22));
		
		System.out.println(al2);
		
		System.out.println(al.containsAll(al2));
		System.out.println(al2.containsAll(al));
	}
}
