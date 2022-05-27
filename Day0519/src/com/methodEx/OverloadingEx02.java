package com.methodEx;

public class OverloadingEx02 {

	public void getLength(int n) {
		String s = String.valueOf(n);
		getLength(s);
	}

	public void getLength(int n, int n1) {

	}

	public void getLength(int n, int n1, int n2) {

	}

	void getLength(String str) {
		System.out.println("입력한 값의 길이 : " + str.length());
		return;
	}

	private void getLength(float n) {
		String s = String.valueOf(n);
		getLength(s);
	}

	public static void main(String[] args) {
		OverloadingEx02 oe2 = new OverloadingEx02();
		oe2.getLength(1000); // int 형
		oe2.getLength(3.14f);
		oe2.getLength("10000");
	}
}
