package com.loginex;

import java.util.Scanner;

public class LoginMain {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	boolean isStop = false;
	LoginSVC loginSVC = new LoginSVC();
	
	do {
		System.out.println("�α��� ȭ���Դϴ�.");
		System.out.println("���̵�� ��й�ȣ�� �Է��ϼĿ�");
		System.out.println("ID : ");
		String id = sc.next();
		System.out.println("Password : ");
		String passwd = sc.next();
		
		UserVO user = loginSVC.login(id, passwd);
		
		if(user == null) {
			System.out.println("���̵�� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}else {
			System.out.println("�α����� ����� �����Դϴ�.");
			System.out.println(user);
			isStop = true;
		}
	}while(!isStop);
}
	
}