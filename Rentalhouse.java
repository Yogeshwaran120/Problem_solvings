package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

record Rh(int houseid,String name,boolean Status,int rent,int eb,int oe,int total) {
	Rh(int houseid,String name,boolean Status,int rent,int eb,int oe,int total){
		this.houseid=houseid;
		this.name=name;
		this.Status=Status;
		this.rent=rent;
		this.eb=eb*3;
		this.oe=oe;
		this.total=this.eb+this.oe+this.rent;
		
	}
}
public class Rentalhouse {

	public static void main(String[] args) {
		List<Rh> list=new ArrayList<Rh>();
		
		list.add(new Rh(101,"sumesh",false,5000,20,100,0));
		list.add(new Rh(102,"bumesh",true,5000,60,90,0));
		list.add(new Rh(103,"kamesh",false,5000,70,40,0));
		list.add(new Rh(104,"ramesh",true,5000,90,89,0));
		list.add(new Rh(105,"samesh",false,5000,30,60,0));
		list.add(new Rh(106,"jamesh",true,5000,100,80,0));
        list.forEach(e->System.out.println(e));
        System.out.println("-------------------------------");
       List<Rh> rsd=list.stream().filter(e->e.Status()==true).collect(Collectors.toList());
        rsd.stream().forEach(e->System.out.println(e.houseid()+" paid the rent"));
        
	}

}
