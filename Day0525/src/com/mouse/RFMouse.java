package com.mouse;

public class RFMouse extends Mouse implements IRFMosue {

	@Override
	public void wconnect() {// 인터페이스의 메소드를 재정의
		// TODO Auto-generated method stub
		System.out.println("마우스 무선 연결됨");
	}

	public void move() {// 추상 클래스의 메소드를 재정의
		System.out.println("마우스 움직임");
	}

	public void scroll() {// 추상 클래스의 메소드를 재정의
		System.out.println("마우스 스크롤 동작");
	}

	@Override
	public void wdisconnect() {// 인터페이스의 메소드를 재정의
		// TODO Auto-generated method stub
		System.out.println("마우스 연결 끊김");
	}
//	public String getA() {
//		return A;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RFMouse rm = new RFMouse();

		System.out.println(A);
		System.out.println(RF_Type_IR);
		rm.wconnect();
		rm.move();
		rm.scroll();
		rm.wdisconnect();

	}

}
