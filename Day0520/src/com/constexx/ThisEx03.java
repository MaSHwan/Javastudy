package com.constexx;

class BookEx3 {
	String title;
	String author;

	public void show() {
		System.out.println(title + " " + author);
	}

	public BookEx3() {
		this("", "");
		System.out.println("������ ȣ����");
	}

	public BookEx3(String title) {
		this(title, "���ڹ̻�");

	}

	public BookEx3(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class ThisEx03 {
	public static void main(String[] args) {
		BookEx3 be = new BookEx3("ȫ�浿��", "���");
		BookEx3 be2 = new BookEx3("ȫ�浿��");
		BookEx3 be3 = new BookEx3();
		be.show();
		be2.show();
		be3.show();
		
	}
}
