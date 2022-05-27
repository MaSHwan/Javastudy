package com.constexx;

import java.net.Socket;

public class ThisEx02 {

	int aa;

	public ThisEx02(int a) {
		this.aa = a;
	}

	public void setAa(int aa) {
		this.aa = aa;
	}

	public static void main(String[] args) {
		ThisEx02 t1 = new ThisEx02(1);
		ThisEx02 t2 = new ThisEx02(2);
		ThisEx02 t3 = new ThisEx02(3);
		System.out.println(t1.aa);
		System.out.println(t2.aa);
		System.out.println(t3.aa);
		
		t1.setAa(4);
		t2.setAa(5); 
		t3.setAa(6);
		System.out.println(t1.aa);
		System.out.println(t2.aa);
		System.out.println(t3.aa);
		
		
	}
}
