package com.app;

import java.util.Stack;

public class hari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="satwik";
		int m=66;
		
		Stack s= new Stack();
		s.push("satwik");
		s.push("hari");
		s.push("mohan");
		s.push("karthik");
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.search("hari"));
		System.out.println(s.search("satwik"));
		System.out.println(s.search("mohan"));
		System.out.println(s.search("thirupal"));
		System.out.println(s.lastElement());
	}

}
