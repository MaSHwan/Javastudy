package com.inner;

public class InnerEx01 {

	public static void main(String[] args) {
		
		//내부 클래스의 멤버 변수에 접근하려면 먼저 외부 클래스의 객체를 생성
		
		OuterEx oe = new OuterEx();
		//외부 클래스를 통해서 내부 클래스의 객체를 생성
		OuterEx.InnerEx oi = oe.new InnerEx();
		
		System.out.println("oi.x : " + oi.x);
	}

}
