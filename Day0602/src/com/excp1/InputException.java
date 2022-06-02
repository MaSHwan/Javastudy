package com.excp1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int a, b, c;
//		System.out.println("정수 3개를 입력하세요 : ");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		int result = a + b + c;
//		System.out.println(result);
		
		int sum = 0, n = 0;
		
		for(int i = 0; i < 3; i++) {
			System.out.println((i + 1) + " 번째 정수 : ");
			try {
			n = sc.nextInt();
			}catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("정수를 입력해주세요");
				// 현재 입력 스트림에 남아있는 토근을 지운다.
				sc.nextLine();
				i--;// 인덱스가 증가하지 않도록 미리 감소시킴
				continue;
			}
			sum += n;
		}
		System.out.println("정수 3개의 합계 : " + sum);
	}

}
