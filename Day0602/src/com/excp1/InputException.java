package com.excp1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int a, b, c;
//		System.out.println("���� 3���� �Է��ϼ��� : ");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		int result = a + b + c;
//		System.out.println(result);
		
		int sum = 0, n = 0;
		
		for(int i = 0; i < 3; i++) {
			System.out.println((i + 1) + " ��° ���� : ");
			try {
			n = sc.nextInt();
			}catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("������ �Է����ּ���");
				// ���� �Է� ��Ʈ���� �����ִ� ����� �����.
				sc.nextLine();
				i--;// �ε����� �������� �ʵ��� �̸� ���ҽ�Ŵ
				continue;
			}
			sum += n;
		}
		System.out.println("���� 3���� �հ� : " + sum);
	}

}
