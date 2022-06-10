package com.utilex;
/*		String class
 * 		- 문자열을 의미하는 클래스
 * 		- 객체 자료형이지만, 기본자료형처럼 사용
 * 
 * 		생성자
 * 		String() : 비어있는 문자열 객체를 생성하고 초기화한다.
 * 		String(char[]value) : 인자인 char배열 값의 내용을 순차적으로 배정하여 새로운 문자열을 생성함
 * 		String(String original) : String형의 original의 문자열의 새롭게 생성된 문자열겍체를 초기화
 * 
 * 		
 * 		객체 생성법
 * 		자동(암시적 객체생성)
 * 		String s1 = "Test";					// 객체생성
 * 
 * 		강제(명시적 객체생성)
 * 		String s2 = new String("Test");		// 객체생성
 */

public class StringEx01 {
	public static void main(String[] args) {
		
		String s1 = "TEST";
		String s2 = "TEST";
		
		if(s1 == s2) {
			System.out.println("s1과 s2는 같다.");
		}else {
			System.out.println("s1과 s2는 같지않다.");
		}
		
		String s3 = new String("TEST");
		
		if(s1 == s3) {
			System.out.println("s1과 s3는 같다.");
		}else {
			System.out.println("s1과 s3는 같지않다.");
		}
		
		String s4 = new String("TEST");
		
		if(s4 == s3) {	// 객체의 주소값 비교
			System.out.println("s4과 s3는 같다.");
		}else {
			System.out.println("s4과 s3는 같지않다.");
		}
		/*
		 * 	암시적 객체 생성과 명시적 객체 생성의 차이점
		 * 	1. (==)연산자는 주소값을 계산한다.
		 * 	2. 객체의 값의 비교는 equals() 메소드를 활용한다
		 */
		
		if(s1.equals(s2)) { // 객체의 값 비교
			System.out.println("s1과 s2는 같다.");
		}else {
			System.out.println("s1과 s2는 같지않다.");
		}
		
		if(s3.equals(s4)) {
			System.out.println("s4과 s3는 같다.");
		}else {
			System.out.println("s4과 s3는 같지않다.");
		}
		

	}
}
