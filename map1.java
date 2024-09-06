package com.map;

import java.util.HashMap;
import java.util.Map;

public class map1 {

	public static void main(String[] args) {
		Map<Integer,String> map1=new HashMap<Integer, String>();
        map1.put(1,"apple");
        map1.put(2,"sumesh");
        map1.put(3,"aanandh");
        map1.put(4,"kamalesh");
        map1.put(5,"kamalesh");
        System.out.println(map1.keySet());
        System.out.println("====================");
        System.out.println(map1.values());
        System.out.println("====================");
        map1.forEach((k,v)->System.out.println("Key:"+k+" Value:"+v));
        System.out.println("====================");
        System.out.println(map1.entrySet());
        System.out.println("====================");
        for(Map.Entry<Integer, String> e:map1.entrySet()) {
        	System.out.println(e.getKey()+" "+e.getValue());
        }
	}

}
