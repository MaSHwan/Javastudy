package com.constexx;

class BookEx3 {
	String title;
	String author;

	public void show() {
		System.out.println(title + " " + author);
	}

	public BookEx3() {
		this("", "");
		System.out.println("생성자 호출함");
	}

	public BookEx3(String title) {
		this(title, "작자미상");

	}

	public BookEx3(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class ThisEx03 {
	public static void main(String[] args) {
		BookEx3 be = new BookEx3("홍길동전", "허균");
		BookEx3 be2 = new BookEx3("홍길동전");
		BookEx3 be3 = new BookEx3();
		be.show();
		be2.show();
		be3.show();
		
	}
}
