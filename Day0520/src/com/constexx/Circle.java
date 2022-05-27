package com.constexx;

public class Circle {// 클래스
	int radius; // 속성(멤버변수), 빌드
	String name;
	
	// 생성자의 목적은 객체가 생성될떄, 필드를 초기화하기 위함이다.
	
	public Circle() {	// 생성자 메소드 : 생성자의 이름은 클래스의 이름과 같다.
		// 필드 초기화
		radius = 1;
		name = "";
	}
	
	public  Circle(int r, String n) {	// 매개변수를 활용해서 필드를 초기화
		// 필드 초기화 // 매개 변수를 가진 생성자
		// 생성자의 리턴타입은 없음
		
		radius = r;
		name = n;
		
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}

}
