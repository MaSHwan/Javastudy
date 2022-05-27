package com.ex03;

public class Circle {
	int radius;	// 반지름
	String name;// 원의 이름 필드
	public Circle() {
		
	}
	
	public double getArea(){// 원의 면적을 구하는 메소드
	return radius * radius * 3.14;	
	}

}
