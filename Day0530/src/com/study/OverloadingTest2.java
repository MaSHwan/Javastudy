package com.study;

public class OverloadingTest2 {

	public int area(int w, int h) {
		return w * h;
	}
	
	public double area(int r) {		// 매개 변수와 자료 반환형이 다름
									// 이것도 오버로딩
		return (double)r * r * 3.141592;
	}
	
	public void write(int result) {
		System.out.println("사각형의 넓이 : " + result);
	}
	public void write(double result) {				// 이름은 같아도 매개변수의 자료형만 달라도 오버로딩이 가능
		System.out.println("원의 넓이 : " + result);
	}
	
	public static void main(String[] args) {
		
		OverloadingTest2 ot = new OverloadingTest2();
		int res = ot.area(10, 5);
		double cc = ot.area(10);
		
		ot.write(res);
		ot.write(cc);
	}
	
	

}
