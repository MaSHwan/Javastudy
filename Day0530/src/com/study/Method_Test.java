package com.study;

public class Method_Test {
	
	public static void showHi() {	// �޼ҵ� ����
		System.out.println("Hi");
	}
	
	public void qwe() {	// �޼ҵ� ����
		System.out.println("hello");
	}

	public static void main(String[] args) {
		showHi();	// static �̶� �ٷ� �ҷ����� ���� .�޼ҵ� �ҷ�����
		
		Method_Test mt = new Method_Test();	// static�� ������ ��ü ������ ���ص�
		mt.qwe();							// �ҷ����� ����
	}

}
