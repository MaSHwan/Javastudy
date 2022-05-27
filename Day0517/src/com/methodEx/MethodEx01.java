package com.methodEx;

/*
 * 		메소드
 * 
 * 		1. 메소드(멤버 함수) : 객체가 할 수 있는 동작을 정의하는 것이다.
 * 							메소드의 종류는 두가지로 구분짓는다.
 * 							1) 인스턴스 메소드, 2) static 메소드
 * 		
 */
public class MethodEx01 {
	public int add(int i, int j) {
		return i + j;
	}
	public int sub(int i, int j) {
		return i - j;
	}
	public int multi(int i, int j) {
		return i * j;
	}
	public int div(int i, int j) {
		return i / j;
	}
	public static void main(String[] args) {
		
		MethodEx01 me = new MethodEx01();
		
		int i = 10;
		int j = 10;
		
		int a, b, c, d;
		a = me.add(i, j);
		b = me.sub(i, j);
		c = me.multi( i, j);
		d = me.div(i, j);
		
		System.out.println("더한 결과 : " + a);
		System.out.println("뺀 결과 : " + b);
		System.out.println("곱한 결과 : " + c);
		System.out.println("나눈 결과 : " + d);
	}
}
