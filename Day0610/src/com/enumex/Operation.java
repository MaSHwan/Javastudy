package com.enumex;

/*
 * 		enum �� �߻� Ŭ�����̴�.
 * 		abstract�߻� Ŭ������ ����� ��� �߻�޼ҵ� �Ѱ��� ������ �־�� ������
 * 		enum�� �߻�޼ҵ尡 ��� ����� �����ϴ�.
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
