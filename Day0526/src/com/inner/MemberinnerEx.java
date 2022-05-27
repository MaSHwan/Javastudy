package com.inner;

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
