package com.excp1;

import java.util.Scanner;

public class DvidByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// ������ ��
		int dividend;
		
		// ������ ��
		int divisor;
		
		System.out.println("������ �� �Է� : ");
		dividend = sc.nextInt();
		System.out.println("������ �� �Է� : ");
		divisor = sc.nextInt();
		
		
		
		try {
			int a =dividend / divisor;
		System.out.println(a);
		}catch (ArithmeticException ae) {
//			ae.printStackTrace();
//			ae.getMessage();
			System.out.println("0���� ������ ����.");
		}
	}

}
