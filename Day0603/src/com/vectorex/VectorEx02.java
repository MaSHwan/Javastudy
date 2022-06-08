package com.vectorex;

import java.util.*;

public class VectorEx02 extends Vector {

	public VectorEx02() {
		super(1, 1);
	}

	public void addInt(int i) {
		addElement(new Integer(i));
	}

	public void addFloat(float f) {
		addElement(new Float(f));
	}

	public void addString(String s) {
		addElement(s);
	}

	public void addCharArray(char a[]) {
		addElement(a);
	}
	
	public void write() {
		Object o;
		int length = size();// size()는 벡터가 가지고 있는 메소드
		System.out.println("Number of Vector elements is " + length + " and they are : ");
		
		for (int i = 0; i < length; i++) {
			o = elementAt(i);
			
			if(o instanceof char[]) {
				System.out.println(String.copyValueOf((char[]) o));
				
			}else {
				System.out.println(o.toString());
			}
		}
	}

	public static void main(String[] args) {
		VectorEx02 ve = new VectorEx02();
		
		int digit = 5;
		float real = 3.14f;
		char letters[] = {'J', 'A', 'V', 'A'};
		String s = new String(" is Hate");
		
		ve.addInt(digit); // 메소드 호출
		ve.addFloat(real);
		ve.addCharArray(letters);
		ve.addString(s);
		
		ve.write();
		
		
	}
}
// Vector v = new Vector(); --> 빈 벡터 생성 기본 크기는 10
// Vector v = new Vector(7); --> 크기 7의 벡터 생성
// Vector v = new Vector(3,5); --> 앞자리 '3' 이 초기값 뒷 자리 '5'는 모자라면 5개 증가 (총 8의 크기 벡터)
