package com.inner;

public class OuterEx {// �ܺ�

	public static class InnerEx01 {//����
		static int x = 10;
		public static void main(String[] args) {
			OuterEx.InnerEx01 oi = new OuterEx.InnerEx01();
			
			System.out.println("oi : " + oi.x);
			System.out.println("oi : " + OuterEx.InnerEx01.x);
		}

	}
}