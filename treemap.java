package com.map;

import java.util.TreeMap;
class product{
	int id,price;
	String name;
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public product(int id, int price, String name) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", price=" + price + ", name=" + name + "]";
	}
	
}
public class treemap {

	public static void main(String[] args) {
		TreeMap<Integer, String> map=new TreeMap<Integer, String>();
		map.put(1, "react");
		map.put(2, "boot");
		map.put(3, "angular");
		map.put(4, "sumesh");
		//System.out.println(map.descendingKeySet());
		//System.out.println(map.descendingMap());
		TreeMap<Integer, product> prod=new TreeMap<Integer, product>();
        prod.put(1, new product(101,800,"ball"));
        prod.put(2, new product(102,600,"shocks"));
        prod.put(3, new product(103,200,"pat"));
        prod.put(4, new product(104,1000,"boot"));
       // prod.forEach((k,v)->System.out.println(v));
        prod.values().stream().filter(e->e.getPrice()>600).forEach(e->System.out.println(e));
	}

}
