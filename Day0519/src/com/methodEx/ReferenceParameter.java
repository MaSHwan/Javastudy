package com.methodEx;

public class ReferenceParameter {
	public void increase(int[] n) {
		for (int i = 0; i < n.length; i++)
			n[i]++;
		
	}

	public static void main(String[] args) {
		int[] ref = { 100, 600, 1000 };// 참조

		// 객체 생성
		ReferenceParameter rp = new ReferenceParameter();
		// 메소드 호출
		rp.increase(ref);
		for (int i = 0; i < ref.length; i++)
			System.out.println("ref [" + i + "] : " + ref[i]);
	}
}
