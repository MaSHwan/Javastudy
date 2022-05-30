package com.study;
/*
 * 		지역변수는 초기화 과정을 거치지 않으면 사용할 수가 없다.
 * 		(자동 초기화 기능을 지원하지 않는다.)
 */
public class Test001 {
	
	static int b;	// 전역변수 (인스턴스 멤버변수)
	
	public static void main(String[] args) {
		int a = 10;
		//int a; 라고 할 경우 지역 변수이기 때문에 초기화를 안해주어서 오류가 뜸
		
		Test001 t = new Test001();
		System.out.println("a : " + a);
		System.out.println(Test001.b);
		System.out.println(new Test001().b);
		System.out.println(t.b);
	}
}
