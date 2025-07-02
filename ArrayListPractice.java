package com.collection.practice;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		
	/*	ArrayList al=new ArrayList();
		al.add(12);
		al.add(127);
		al.add(12321423);
		al.add(123234324425454L);
		al.add(23.1323F);
		al.add(23434.234343);
		al.add('A');
		al.add(true);
		
		System.out.println(al);
		
		ArrayList al2=new ArrayList();
		
		al2.add("Avi");
		al2.add("Vikarna");
		al2.add("Nalina");
		al2.add('K');
		al2.add(22);
		
		
		System.out.println(al2);
		
		al2.addAll(al);
		System.out.println(al2);
		
		al.addAll(al2);
		System.out.println(al);
		
		*/
		
		ArrayList a=new ArrayList();
		a.add(0);
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		System.out.println(a);
		
		a.add(5, 12);
		
		System.out.println(a);
		
		System.out.println(a.get(5));
		
		a.add(6, 13);
		
		System.out.println(a);
		
		System.out.println(a.get(6));
		
		a.add(8, 14);
		
		System.out.println(a);
		
        a.add(0, 15);
		
		System.out.println(a);
		
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		
		a.set(0, 100);
		a.set(1, 200);
		
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		
		System.out.println(a);
		a.clear();
		System.out.println(a);
		
		/*
		 
		 String str1="abc";
		String str2="abc";
		
		str1=str1+"def";
		System.out.println(str1==str2); 
		
		String str="hello";
		String str2=str;
		
		str=str+"world";
		System.out.println(str2);
		
		*/
		
		
		
		
		
	}

}
