package com.excp1;

import java.util.Scanner;

public class DvidByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 나뉘는 수
		int dividend;
		
		// 나누는 수
		int divisor;
		
		System.out.println("나뉘는 수 입력 : ");
		dividend = sc.nextInt();
		System.out.println("나누는 수 입력 : ");
		divisor = sc.nextInt();
		
		
		
		try {
			int a =dividend / divisor;
		System.out.println(a);
		}catch (ArithmeticException ae) {
//			ae.printStackTrace();
//			ae.getMessage();
			System.out.println("0으로 나눌수 없다.");
		}
	}

}
