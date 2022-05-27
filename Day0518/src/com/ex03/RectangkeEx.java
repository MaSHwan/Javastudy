package com.ex03;

import java.util.Scanner;

public class RectangkeEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();

		System.out.println("가로 : ");
		rect.a = sc.nextInt();
		System.out.println("세로 : ");
		rect.b = sc.nextInt();
		// int area = rect.getArea(a, b);
		System.out.println("사각형의 넓이 : " + rect.getArea() + " 입니다.");
	}
}
