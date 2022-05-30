package com.study;
/*
 * 		지역변수는 초기화 과정을 거치지 않으면 사용할 수가 없다.
 * 		(자동 초기화 기능을 지원하지 않는다.)
 */
public class Test001 {
	
	static int b;	// 전역변수 (인스턴스 멤버변수)
	// 사용하는 과정에서 초기화하지 않을 경우 int형 기준 자동으로 0으로 초기화된다.
	// 문자형이면 null값, boolean이면 false
	public static void main(String[] args) {
		int a = 10;
		//int a; 라고 할 경우 지역 변수이기 때문에 초기화를 안해주어서 오류가 뜸
		
		Test001 t = new Test001(); // 객체 생성
		
		System.out.println("a : " + a);
		System.out.println(Test001.b);
		System.out.println(new Test001().b);
		System.out.println(t.b);
	}
}
