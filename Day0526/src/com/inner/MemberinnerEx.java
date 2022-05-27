package com.inner;

/*
 * 		Member Inner Class
 * 		- ��ü�� �����ؾ߸� ���� �� �ִ� ������ ���� ��ġ�� ���� �Ǵ� Ŭ������
 * 		  �̳� Ŭ������ ��ü�� �����Ϸ��� �ܺ� Ŭ������ ��ü�������� �Ŀ� ������ �� �ִ�.
 * 
 * 		  �̳� Ŭ���� ���ο��� static�� ������ �� ����.
 * 
 * 		  
 */

public class MemberinnerEx {

	
	int a = 10;
	private int b = 20;
	static int c = 30;
	
	class Inner {
		
		// Inner Ŭ���� ���ο��� static�� ������ �� ����.
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
