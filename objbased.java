package com.set;

import java.util.Set;
import java.util.TreeSet;

 class book implements Comparable<book> {
 private String bookname;
 private String author;
 private int yearofpublish;
 public book(String bookname,String author,int yearofpublish) {
	 this.bookname=bookname;
	 this.author=author;
	 this.yearofpublish=yearofpublish;
	 
 }
	public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getYearofpublish() {
	return yearofpublish;
}
public void setYearofpublish(int yearofpublish) {
	this.yearofpublish = yearofpublish;
}
	@Override
public String toString() {
	return "objbased [bookname=" + bookname + ", author=" + author + ", yearofpublish=" + yearofpublish + "]";
}
	@Override
	public int compareTo(book o) {
		
		return this.bookname.compareTo(o.bookname);
	}
}
class objbased{
	public static void main(String[] args) {
	Set<book> set1=new TreeSet<book>();
	set1.add(new book("Cloud computing","sumesh",2020));
	set1.add(new book("Iot","ramesh",2022));
	set1.add(new book("Distributed computing","kamesh",2021));
	set1.stream().filter(e->e.getYearofpublish()>=2021).forEach(e->System.out.println(e.getBookname()));
	}
	}


