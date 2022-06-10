package com.enumex;

/*
 * 		enum 은 추상 클래스이다.
 * 		abstract추상 클래스를 사용할 경우 추상메소드 한개가 무조건 있어야 하지만
 * 		enum은 추상메소드가 없어도 사용이 가능하다.
 */
public enum Operation {

	Plus {
		double eval(double x, double y) {
			return x + y;
		}
	},
	Minus {
		double eval(double x, double y) {
			return x - y;
		}
	},
	Times {
		double eval(double x, double y) {
			return x * y;
		}
	},
	Divide {
		double eval(double x, double y) {
			return x / y;
		}
	};

	 abstract double eval(double x, double y);
}
