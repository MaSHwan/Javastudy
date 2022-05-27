package com.constexx;

public class BookEx {
public static void main(String[] args) {
	Book b = new Book("어린왕자", "생텍쥐페리");
	Book lovestory = new Book("춘향전");
	
	System.out.println(b.title + " " + b.author);
	System.out.println(lovestory.title + " " + lovestory.author);
}
}
