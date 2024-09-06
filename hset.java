package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class hset {

	public static void main(String[] args) {
	Set<String> set1=new HashSet<>();
	set1.add("abc");
	set1.add("xyz");
	set1.add("hello");
	set1.add("ilo");
	set1.add("code");
	set1.add("Mc");
	set1.add("c");
	//System.out.println(set1);
	//linkedhashset
	Set<String> set2=new LinkedHashSet<>();
	set2.add("10");
	set2.add("hello");
	set2.add("bye");
	set2.add("Gn");
	//System.out.println(set2);
	//sortedset
	Set<Integer> set3=new TreeSet<>();
	set3.add(20);
	set3.add(10);
	set3.add(79);
	//System.out.println(set3);
	//using object used in jdk-9 to recent
	Set<String> set4=Set.of("xyz","abc","yella","sumesh");
	System.out.println(set4);
	}
}
