package com.constexx;

public class Circle02 {

	int radius;

	void set(int r) {
		radius = r;
	}
	public Circle02() {
		// 기본형이 있어야 18번 줄에서 오류가 안뜸
	}
	public Circle02(int r) {
		radius = r;
	}

	public static void main(String[] args) {
		Circle02 ce = new Circle02(10);
		System.out.println(ce.radius);
	}
}
