package com.string.practice;

public class BufferMethods {

	public static void main(String[] args) {
		
		StringBuffer s1=new StringBuffer("Automation");
		
		s1.append(" Testing");
		System.out.println(s1);
		
		s1.insert(3, "Avi");
		System.out.println(s1);
		
		s1.replace(0, 6, "Vikarna");
		System.out.println(s1);
		
		s1.delete(0, 14);
		System.out.println(s1);
		
		StringBuffer s2=new StringBuffer("Evergent");
		StringBuffer s3=new StringBuffer();
		s2.reverse();
		System.out.println(s2);
		
		int cap=s2.capacity();
		System.out.println(cap);
		int cap3=s3.capacity();
		System.out.println(cap3);
		
		int cap2=s2.length();
		System.out.println(cap2);
		
		
		StringBuffer sb=new StringBuffer("Nalina");
		char letter=sb.charAt(4);
		System.out.println(letter);
		
		String value=sb.substring(1);
		System.out.println(value);
		
		String value2=sb.substring(1,5);
		System.out.println(value2);
		
		StringBuffer ra=new StringBuffer("Rajaghatta");
		ra.ensureCapacity(34);
		
		
		
	}
}
