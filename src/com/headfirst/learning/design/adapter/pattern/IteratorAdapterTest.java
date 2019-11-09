package com.headfirst.learning.design.adapter.pattern;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class IteratorAdapterTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("javascript");
        list.add("node.js"); 
        list.add("golang"); 
		Enumeration enumeration = new IteratorAdapter(list.iterator());
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());		
		}
	}
	
}
