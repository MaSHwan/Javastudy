package com.study;

import java.util.Scanner;

class Rect { // 사각형에 대한 클래스 생성
	// 속성(멤버 변수)과 기능(멤버 메소드) 정해주기

	// 변수 선언(가로와 세로)
	// 전역 변수(클래스 변수, 인스턴스 변수)
	int w, h;
	
	// 메소드 선언 : 메소드만 가지고 이름만 명시해 놓는것
	// 메소드 정의 : 기능까지 가지고 있는것
	
	// 메소드 정의
	// void 반환형 : 반환값이 없음을 의미함 return을 안써도 됨
	// 반환 : 메소드 실행 후 결과값을 호출한 곳으로 돌려 주는 것을 반환이라함.
	
	void input() {
		// 인스턴스(객체, 참조변수) 생성
		Scanner sc = new Scanner(System.in); // System은 Console을 의미함
											 // in은 inputstream의 약자 (입력)
		System.out.print("가로 입력 : ");
		w = sc.nextInt();
		System.out.print("세로 입력 : ");
		h = sc.nextInt();
	}
	// 넓이 계산
	/*
	 * 		메소드 실행 후 결과 있는 경우(리턴형 지정)
	 * 		리턴 자료형 : int형
	 */
	public int area() {
		int area = w *h;
		System.out.println("넓이 : " + area);
		return area;
	}
	// 둘레 계산
	int length() {
		int length = 2 * (w + h);
		System.out.println("둘레 : " + length);
		return length;
	}
	
	// 출력 메소드
	void print(int a, int b) {
		// 매개변수 :  a = area(); 
		// 인자값 : 	 b = length();
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
//		System.out.println("넓이 : " + (a * b));
//		System.out.println("둘레 : " + 2 * (a + b));
		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + b);
	}
	

}

public class Method_TestEx { // 실행 클래스

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;// 지역 변수
		
		Rect r = new Rect();// 객체 생성
		r.input();// 메소드 호출
		r.area();
		r.length();
		
		int a1 = r.area();
		int b = r.length();
		r.print(a1,b);
	}

}
