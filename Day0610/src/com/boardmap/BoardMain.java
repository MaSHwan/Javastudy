package com.boardmap;

import java.util.Scanner;



public class BoardMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardSVC boardSVC = new BoardSVC();
		boolean isStop = false;
		
		do {
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("1. �Խ��� �۾���");
			System.out.println("2. �Խ��� �� ��� ����");
			System.out.println("3. �Խ��� �� ����");
			System.out.println("4. ����");
			
			String menu = sc.next();
			
			switch (menu) {
			case "1":
				boardSVC.writeArticle(sc);
				break;
			case "2":
				boardSVC.listArticle(sc);
				break;
			case "3":
				boardSVC.removeArticle(sc);
				break;
			case "4":
				isStop = true;
				System.out.println("�ý����� ����Ǿ����ϴ�");
				break;
			default:
				break;
			}
			
		}while(!isStop);
	}
}
