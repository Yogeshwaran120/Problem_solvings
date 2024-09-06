package com.map;

import java.util.Map;
import java.util.WeakHashMap;

class test{

	@Override
	public String toString() {
		return "test []";
	}
	
}
public class map2 {

	public static void main(String[] args) {
		WeakHashMap<Integer,String> map1=new WeakHashMap<>();
		test t1=new test();
		map1.put(1, "hello");
		map1.put(2, "hi");
		map1.put(4, "how are you");
		System.out.println(map1);

	}

}
