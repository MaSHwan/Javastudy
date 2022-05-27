package com.constexx;

public class Book {
	String title;
	String author;
	
	public Book(String t) {
		title = t;
		author = "작자 미상";
	}
	public Book() {
		//생성자가 없는 클래스는 존재하지 않는다.
	}
	public Book(String t, String a) {
		title = t;
		author = a;
	}
}
