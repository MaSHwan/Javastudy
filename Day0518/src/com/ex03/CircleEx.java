package com.ex03;

public class CircleEx {
	public static void main(String[] args) {
		Circle Pizza = new Circle();
		
		Pizza.radius = 10;
		Pizza.name = "�Ұ�� ����";
		
		//����ũ�� ���ϱ�(����)
		double area = Pizza.getArea();
		System.out.println(Pizza.name + "�� ������ " + area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "ũ������ ����";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
	}
}
