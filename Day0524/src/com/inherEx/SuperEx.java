package com.inherEx;

class Super {// �θ� Ŭ����
	int a = 5; // �θ� Ŭ������ ��� ����
	
	public Super(int x) {
		System.out.println("�θ� Ŭ���� ������ : " + x);
	}
}

class Sub extends Super {
	public Sub() {
		super(5);
		System.out.println("�ڽ� Ŭ������ ������");
	}

	int a = 10;

	public void test() {
		System.out.println(this.a);
		System.out.println(super.a);
	}
}

public class SuperEx {
	public static void main(String[] args) {
	
		Sub s = new Sub();
		s.test();
	}
}
