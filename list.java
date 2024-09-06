package com.demo;

import java.util.*;

public class list {
	public static void main(String args[]) {
	ArrayList l=new ArrayList();
	l.add("hello");
	l.add(10);
	l.add(30.3f);
	l.add('a');
	//System.out.println(l);
	//l.stream().forEach((p)->System.out.println(p));
	Iterator readdata=l.iterator();//only forward direction
	 while(readdata.hasNext()) {
		 System.out.println(readdata.next());
	 }
	}
}
