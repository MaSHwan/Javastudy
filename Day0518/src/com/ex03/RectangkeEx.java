package com.ex03;

import java.util.Scanner;

public class RectangkeEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();

		System.out.println("���� : ");
		rect.a = sc.nextInt();
		System.out.println("���� : ");
		rect.b = sc.nextInt();
		// int area = rect.getArea(a, b);
		System.out.println("�簢���� ���� : " + rect.getArea() + " �Դϴ�.");
	}
}
