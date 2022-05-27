package com.inter.ex;

public class InterfaceEx02 implements Inter3 {

	int a = 100;
	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return a-10;
	}

	@Override
	public int getData() {
		// TODO Auto-generated method stub
		return a+10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceEx02 it = new InterfaceEx02();
		
		Inter1 it1 = new InterfaceEx02(); // == Inter1 it1 = it;
		Inter2 it2 = new InterfaceEx02();
		Inter3 it3 = it;
		System.out.println(it1.getA());
		System.out.println(it2.getA());
		System.out.println(it3.getA());
		System.out.println(it3.getData());
		
		System.out.println(it instanceof Object);
		System.out.println(it instanceof InterfaceEx02);
		System.out.println(it instanceof Inter1);
		System.out.println(it instanceof Inter2);
		System.out.println(it instanceof Inter3);
	}
	

}
