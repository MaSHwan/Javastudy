package com.constexx;

public class Circle02 {

	int radius;

	void set(int r) {
		radius = r;
	}
	public Circle02() {
		// �⺻���� �־�� 18�� �ٿ��� ������ �ȶ�
	}
	public Circle02(int r) {
		radius = r;
	}

	public static void main(String[] args) {
		Circle02 ce = new Circle02(10);
		System.out.println(ce.radius);
	}
}
