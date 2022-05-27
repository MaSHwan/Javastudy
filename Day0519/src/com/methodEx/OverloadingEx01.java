package com.methodEx;
/*
 * 		메소드 오버로딩
 * 
 * 		- 동일한(하나의) 클래스에서 같은 이름을 가진 메소드가 여러개 정의되는 것을 의미함
 * 		- 같은 이름의 메소드에 인자(매개변수)가 다른 경우
 * 		- 인자가 다르다는 것은 인자의 개수가 다르거나, 자료형이 다르거나, 인자의 수가 다른것을 의미함
 * 		- 같은 목적으로 비슷한 동작을 수행하는 메소드 들을 모아 이름을 같게 만들어 일관성을 유지하기 위함
 * 
 * 		접근 제한자	반환형	메소드명(자료형	인자, ...)
 * 		1. 접근제한자와 반환형은 상관없음
 * 		2. 메소드의 이름은 반드시 같아야한다 (동일해야함)
 * 		3. 자료형이나 인자의 개수는 반드시 다르게 헤야함
 */
public class OverloadingEx01 {

	public void floatLength(float a) {
		String s = String.valueOf(a);
		System.out.println("입력한 값의 길이 : " + s.length());
	}
	public void intLength(int a) {
		String s = String.valueOf(a);
		System.out.println("입력한 값의 길이 : " + s.length());
	}
	public void stringLength(String str) {
		String s = String.valueOf(str);
		System.out.println("입력한 값의 길이 : " + str.length());
	}
	
	public static void main(String[] args) {
	OverloadingEx01 oe1 = new OverloadingEx01();
	oe1.intLength(1000);
	oe1.floatLength(314f);
	oe1.stringLength("10000");
}
}
