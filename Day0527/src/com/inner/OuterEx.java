package com.inner;

public class OuterEx {// 외부

	public static class InnerEx01 {//내부
		static int x = 10;
		public static void main(String[] args) {
			OuterEx.InnerEx01 oi = new OuterEx.InnerEx01();
			
			System.out.println("oi : " + oi.x);
			System.out.println("oi : " + OuterEx.InnerEx01.x);
		}

	}
}