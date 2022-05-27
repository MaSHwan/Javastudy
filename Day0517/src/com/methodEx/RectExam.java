package com.methodEx;
/*
 * 		�簢���� ���̿� �ѷ��� ��� (Ŭ������ ǥ��)
 * 		Ŭ������ �Ӽ� : ����, ����(����, �ѷ�, ����, ����, ����)
 * 		Ŭ������ �޼ҵ�(���) : ���� ���, �ѷ����, (����/����) �Է� ���, ��� ��� ���
 * 
 * 		��ü�� ���� : ������(�Ӽ�, ����) + ���(����)
 * 		Ŭ������ ���� : ��� ���� + �޼ҵ�
 */

import java.util.*;

class Rect {// Ŭ���� ����(����)
	/*
	 * ��� ���� ����
	 * 
	 * ���� ���� : Ŭ���� ��ü �ȿ��� Ȱ�� ������ ���� (static) ��� ���� : Ŭ������ �Ҽ� �Ǿ��ִ� ���� �ν��Ͻ� ���� : �ν��Ͻ���
	 * ���� �ɶ��� �ǹ��� Rect re = new Rect();
	 */
	// ����, ���� ��� ���� ����
	int w, h;

	// �޼ҵ� ����(����/���� �Է�)
	// void : �޼ҵ� ���� �� �޼ҵ带 ȣ���� ���� ����� ������ �ʿ䰡 ���� �� ���
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		w = sc.nextInt();
		System.out.print("���� �Է� : ");
		h = sc.nextInt();
	}

	// ���� ��� ���(�޼ҵ� ����)
	int area() {
		int result;
		result = w * h;
		return result;
		/*
		 * �޼ҵ�� ����(return)���� ���ؼ��� ����� ������ �� �ִ�.
		 */
	}

	int length() {
		int result;
		result = 2 * (w + h);
		return result;
		// return 2 * (w + h);
	}

	/*
	 * ��� �޼ҵ� ���� �Ű� ������ ���� �����͸� �Ѱ� ����(���� ���� �ʴ� ������) �޼ҵ��� �Ű� ������ �޼ҵ� �������� Ȱ�� ���� �Ű�����
	 * ����� ������ ���� ���� �ڷ����� ���� �����ؾ���
	 */
	void print(int a, int i) {
		System.out.println("���� : " + w);
		System.out.println("���� : " + h);
		System.out.println("���� : " + a);
		System.out.println("�ѷ� : " + i);

	}
}

public class RectExam {
	public static void main(String[] args) {
		// 1. �ν��Ͻ� ����
		Rect r = new Rect();
		
		// 2. �Է� �޼ҵ� ȣ��
		r.input();
		
		// 3. ���̿� �ѷ� �޼ҵ� ȣ��
		int a = r.area();	// ����
		int b = r.length();	// �ѷ�
		
		//4. ��� �޼ҵ� ȣ��
		r.print(a, b);
	}
}
