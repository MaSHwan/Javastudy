package com.inherex;


class Parent {
	int parentVar = 10;
	void parentMethod() {
		System.out.println("parent Method");
	}
}

class Child extends Parent{
	int childVar = 20;
	void childMethod() {
		System.out.println("child Method");
	}
}
public class ExtendTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch = new Child();
		System.out.println(ch.childVar);
		System.out.println(ch.parentVar);
		ch.parentMethod();
		ch.childMethod();
	}

}
