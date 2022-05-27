package com.inner;

/*
 * 		Member Inner Class
 * 		- 객체를 생성해야만 사요알 수 있는 멤버들과 같은 위치에 정의 되는 클래스다
 * 		  이너 클래스의 객체를 생성하려면 외부 클래스의 객체를생성한 후에 생성할 수 있다.
 * 
 * 		  이너 클래스 내부에는 static이 존재할 수 없다.
 * 
 * 		  
 */

public class MemberinnerEx {

	
	int a = 10;
	private int b = 20;
	static int c = 30;
	
	class Inner {
		
		// Inner 클래스 내부에는 static이 존재하 수 없다.
		//static int d = 30;
		
		public void prt() {
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
		}
	}
	public static void main(String[] args) {
//		MemberinnerEx mi = new MemberinnerEx();
//		MemberinnerEx.Inner in = mi.new Inner();
		
		MemberinnerEx.Inner in = new MemberinnerEx().new Inner();
		
		in.prt();

	}

}
