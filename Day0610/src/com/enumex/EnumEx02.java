package com.enumex;

public class EnumEx02 {

	public static void main(String[] args) {
				  // 랩퍼 클래스 앞의 첫글자가 대문자이다
		double x = Double.parseDouble("10.2");
		double y = Double.parseDouble("20.0");
		
		System.out.println(Operation.Plus.eval(x, y));
		
		for(Operation op : Operation.values())
			System.out.printf("%.1f %s %.1f = %.1f%n", x, op, y, op.eval(x, y));
	}

}
