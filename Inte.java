package com.demo;

import java.util.ArrayList;
import java.util.Comparator;

public class Inte {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<>();
	list.add("hi");
	list.add("hello");
	list.add("sumesh");
	list.add("ramesh");
	list.add("kamesh");
	list.add("samesh");
	list.add("samesh");
	list.add("samesh");
	list.add("boomesh");
	
	list.stream().filter((p)->p.contains("b")).forEach(e->System.out.println(e));
	
	
	list.stream().map((p)->p.concat(" raja")).forEach(f->System.out.print(f+" "));
	System.out.println();
	
	
	list.stream().sorted().forEach(e->System.out.print(e+" "));
	System.out.println();
	
	
	list.stream().sorted(Comparator.reverseOrder()).forEach(e->System.out.print(e+" "));
	System.out.println();
	
	list.stream().distinct().forEach(e->System.out.print(e+" "));
}
}
