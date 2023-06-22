
Spring Boot Book Store Application
Prasad Zanjurne
•
21 Apr

pom.xml
XML

SpringBootBookApplication.java
Java

BookRepos.java
Java

BookController.java
Java

Book.java
Java

application.properties
Binary File

UpdateBook.jsp
Binary File

Success.jsp
Binary File

SelectBook.jsp
Binary File

Fail.jsp
Binary File

BookApp.jsp
Binary File
Class comments

Add class comment…

package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Book {
	int bid;
	String bname,bauthor,bcategory;
	float bprice;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public String getBcategory() {
		return bcategory;
	}
	public void setBcategory(String bcategory) {
		this.bcategory = bcategory;
	}
	public float getBprice() {
		return bprice;
	}
	public void setBprice(float bprice) {
		this.bprice = bprice;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", bauthor=" + bauthor + ", bcategory=" + bcategory
				+ ", bprice=" + bprice + "]";
	}
	
}