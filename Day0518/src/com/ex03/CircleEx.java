package com.ex03;

public class CircleEx {
	public static void main(String[] args) {
		Circle Pizza = new Circle();
		
		Pizza.radius = 10;
		Pizza.name = "불고기 피자";
		
		//피자크기 구하기(면적)
		double area = Pizza.getArea();
		System.out.println(Pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "크리스피 도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
}
