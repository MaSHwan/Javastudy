package com.study;

import java.util.*;

public class SearchMain {
	// �̸��� �Ķ���ͷ� �Ͽ� �˻��ϴ� ���α׷�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SearchService ss =  new SearchService();
		do {
			System.out.println("�˻��� ȸ�� �̸� �Է� : ");
			String name = sc.next();
			
			boolean searchResult = ss.searchMember(name);
			if(searchResult) break;
			System.out.println("�ش� ȸ���� �������� �ʽ��ϴ�.");
		}while(true);
	}
}
