package com.constexx;

public class Circle {// Ŭ����
	int radius; // �Ӽ�(�������), ����
	String name;
	
	// �������� ������ ��ü�� �����ɋ�, �ʵ带 �ʱ�ȭ�ϱ� �����̴�.
	
	public Circle() {	// ������ �޼ҵ� : �������� �̸��� Ŭ������ �̸��� ����.
		// �ʵ� �ʱ�ȭ
		radius = 1;
		name = "";
	}
	
	public  Circle(int r, String n) {	// �Ű������� Ȱ���ؼ� �ʵ带 �ʱ�ȭ
		// �ʵ� �ʱ�ȭ // �Ű� ������ ���� ������
		// �������� ����Ÿ���� ����
		
		radius = r;
		name = n;
		
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}

}
