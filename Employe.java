package com.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employe {
private int id;
private String name;
private String emp_type;
private double emp_sal;
private String emp_addrs;

	public Employe() {
	super();
	
}
	public Employe(int id, String name, String emp_type, double emp_sal, String emp_addrs) {
		super();
		this.id = id;
		this.name = name;
		this.emp_type = emp_type;
		this.emp_sal = emp_sal;
		this.emp_addrs = emp_addrs;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmp_type() {
		return emp_type;
	}
	public void setEmp_type(String emp_type) {
		this.emp_type = emp_type;
	}
	public double getEmp_sal() {
		return emp_sal;
	}
	public void setEmp_sal(double emp_sal) {
		this.emp_sal = emp_sal;
	}
	public String getEmp_addrs() {
		return emp_addrs;
	}
	public void setEmp_addrs(String emp_addrs) {
		this.emp_addrs = emp_addrs;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", emp_type=" + emp_type + ", emp_sal=" + emp_sal
				+ ", emp_addrs=" + emp_addrs + "]";
	}

	public static void main(String[] args) {
	 List<Employe> list=new ArrayList<>();
	 list.add(new Employe(101,"sumesh","Tech team",60000,"wwww"));
	 list.add(new Employe(102,"ramesh","tester",70000,"www"));
	 list.add(new Employe(103,"kamesh","developer",80000,"xxx "));
	 list.add(new Employe(104,"subesh","UI/UX",900000,"yyy"));
	 list.add(new Employe(104,"abc","aaa",900000,"12a"));

	 System.out.println(list);
	 System.out.println("-------------------------------------");
	 list.stream().forEach(e->System.out.println(e));
	 System.out.println("-------------------------------------");
	 list.stream().filter(e->e.name.contains("k") ).forEach(f->System.out.println(f));
	 System.out.println("-------------------------------------");
	 List<Employe> asd=list.stream().sorted(Comparator.comparing(e->e.getName())).collect(Collectors.toList());
	 asd.stream().forEach(e->System.out.println(e));
	 System.out.println("-------------------------------------");
	 List<Double> empmap=list.stream().map(e->e.getEmp_sal()+10000).collect(Collectors.toList());
	 empmap.stream().forEach(e->System.out.println(e));
	 System.out.println("-------------------------------------");
	 System.out.println();
	 
	}

}
