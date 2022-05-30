package com.study;

public class Method_Test {
	
	public static void showHi() {	// 메소드 생성
		System.out.println("Hi");
	}
	
	public void qwe() {	// 메소드 생성
		System.out.println("hello");
	}

	public static void main(String[] args) {
		showHi();	// static 이라서 바로 불러오기 가능 .메소드 불러오기
		
		Method_Test mt = new Method_Test();	// static이 없으면 객체 생성을 해준뒤
		mt.qwe();							// 불러오기 가능
	}

}
