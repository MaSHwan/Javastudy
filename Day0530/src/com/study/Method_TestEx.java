package com.study;

import java.util.Scanner;

class Rect { // �簢���� ���� Ŭ���� ����
	// �Ӽ�(��� ����)�� ���(��� �޼ҵ�) �����ֱ�

	// ���� ����(���ο� ����)
	// ���� ����(Ŭ���� ����, �ν��Ͻ� ����)
	int w, h;
	
	// �޼ҵ� ���� : �޼ҵ常 ������ �̸��� ����� ���°�
	// �޼ҵ� ���� : ��ɱ��� ������ �ִ°�
	
	// �޼ҵ� ����
	// void ��ȯ�� : ��ȯ���� ������ �ǹ��� return�� �Ƚᵵ ��
	// ��ȯ : �޼ҵ� ���� �� ������� ȣ���� ������ ���� �ִ� ���� ��ȯ�̶���.
	
	void input() {
		// �ν��Ͻ�(��ü, ��������) ����
		Scanner sc = new Scanner(System.in); // System�� Console�� �ǹ���
											 // in�� inputstream�� ���� (�Է�)
		System.out.print("���� �Է� : ");
		w = sc.nextInt();
		System.out.print("���� �Է� : ");
		h = sc.nextInt();
	}
	// ���� ���
	/*
	 * 		�޼ҵ� ���� �� ��� �ִ� ���(������ ����)
	 * 		���� �ڷ��� : int��
	 */
	public int area() {
		int area = w *h;
		System.out.println("���� : " + area);
		return area;
	}
	// �ѷ� ���
	int length() {
		int length = 2 * (w + h);
		System.out.println("�ѷ� : " + length);
		return length;
	}
	
	// ��� �޼ҵ�
	void print(int a, int b) {
		// �Ű����� :  a = area(); 
		// ���ڰ� : 	 b = length();
		System.out.println("���� : " + w);
		System.out.println("���� : " + h);
//		System.out.println("���� : " + (a * b));
//		System.out.println("�ѷ� : " + 2 * (a + b));
		System.out.println("���� : " + a);
		System.out.println("�ѷ� : " + b);
	}
	

}

public class Method_TestEx { // ���� Ŭ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;// ���� ����
		
		Rect r = new Rect();// ��ü ����
		r.input();// �޼ҵ� ȣ��
		r.area();
		r.length();
		
		int a1 = r.area();
		int b = r.length();
		r.print(a1,b);
	}

}
