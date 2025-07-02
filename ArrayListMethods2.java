package com.collection.practice;
import java.util.*;
public class ArrayListMethods2 {
	
	public static void main(String[] args) {
		ArrayList <Integer> al=new ArrayList<Integer>();
		al.add(2);
		al.add(4);
		al.add(6);
		al.add(8);
		al.add(6);
		
		ArrayList <Integer> al2=new ArrayList<Integer>();
		al2.add(2);
		al2.add(4);
		al2.add(6);
		al2.add(8);
		al2.add(6);
		
		System.out.println(al2.subList(0, 3));
		
		System.out.println(al2.indexOf(6));
		System.out.println(al2.lastIndexOf(6));
		
		System.out.println(al.equals(al2));
		
		/*
		System.out.println(al);
		
		System.out.println(al.size());
		System.out.println(al.indexOf(6));
		System.out.println(al.indexOf(22));
		
		@SuppressWarnings("unchecked")
		ArrayList <Integer> cloned =( ArrayList<Integer>) al.clone();
		System.out.println(cloned);
		
		
		
		
		System.out.println(al);
		
		ListIterator <Integer> curosr=al.listIterator();
		
		while(curosr.hasNext())
		{
			System.out.println(curosr.next());
		}
		
		System.out.println();
		
		while(curosr.hasPrevious())
		{
			System.out.println(curosr.previous());
		}
		
		*/
	}
	

}
