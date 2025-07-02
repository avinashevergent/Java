package com.collection.practice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayListMethods {

	public static void main(String[] args) {
		/*	ArrayList <Integer>al=new ArrayList<Integer>();
		al.add(0);
		al.add(1);
		al.add(2);
		al.add(3, 3);
		System.out.println(al);
		
		al.remove(2);
		System.out.println(al);
		
		al.remove(2);
		System.out.println(al);
		
		
		al.removeAll(al);
		System.out.println(al);
		*/
	
		ArrayList<String>al2=new ArrayList<String>();
		al2.add("Vikarna");
		al2.add("Avi");
		al2.add("Nallu");
		al2.add("Kiki");
		

		ArrayList<String>al3=new ArrayList<String>();
		al3.add("Vikarna");
		al3.add("Avi");
		al3.add("Nallu");
		al3.add("Kiki");
		
		/*al2.addAll(al3);
		System.out.println(al2);
		*/
		
		al2.addAll(2, al2);
		
		
		/*Iterator <String> elements=al2.iterator();
		System.out.println(elements);
		
		while(elements.hasNext())
				{
			System.out.println(elements.next());
				}
		
	*/
		ListIterator <String> eleme=al2.listIterator();
		
		
		
		System.out.println("Forward");
		System.out.println();
		
		while(eleme.hasNext())
		{
			System.out.println(eleme.next());
		}
		
		System.out.println();
		
		System.out.println("Backward");
		System.out.println();
		
		while(eleme.hasPrevious())
		{
			System.out.println(eleme.previous());
		}
		
		
	}
	
}
