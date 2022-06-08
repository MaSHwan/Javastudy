package com.boardex;

import java.util.*;

public class BoardSVC {
	Scanner sc = new Scanner(System.in);

	ArrayList<BoardVO> boardList;

	public BoardSVC() {
		boardList = new ArrayList<BoardVO>();
	}

	// �۾��� �޼ҵ�

	public void writeArticle(Scanner sc) {
		System.out.println("�Խ��� ���� �ۼ� �ϼ���.");

		System.out.print("�ۼ��� : ");
		String register = sc.next();

		System.out.print("email : ");
		String email = sc.next();

		System.out.print("��� ��ȣ : ");
		String passwd = sc.next();

		System.out.print("���� : ");
		String subject = sc.next();

		System.out.print("�۳��� : ");
		String content = sc.next();

		BoardVO boardVO = new BoardVO(register, subject, email, content, passwd);
		// ArrayList�� �߰�
		boardList.add(boardVO);
	}

	// ���� ����Ʈ�� �߰�
	private void addArticle(BoardVO boardVO) {
		boardList.add(boardVO);
	}

	// ��� ���� �޼ҵ�
	public void listArticle(Scanner sc) {

		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				System.out.println(boardList.get(i));
			}
		} else {
			System.out.println("��ϵ� �Խñ��� �����ϴ�.");
		}

		System.out.println("\n ��ü ����Ʈ ��� : ");

	}

	// �� ���� �޼ҵ�
	public void removeArticle(Scanner sc) {
		System.out.println("�Խñ� �����Ҷ��� ���� �ۼ��ڿ� ��й�ȣ�� �Է��Ͻÿ�.");
		System.out.println("�ۼ��� : ");
		String name = sc.next();
		System.out.println("��й�ȣ : ");
		String passwd = sc.next();

		removeArticle(name, passwd);
	}

	private void removeArticle(String register, String passwd) {
		if (boardList.size() > 0) {

			int index = -1;

			for (int i = 0; i < boardList.size(); i++) {
				if(boardList.get(i).getRegister().equals(register)) {	// �ۼ��ڰ� �´� ���
					if(boardList.get(i).getPasswd().equals(passwd)){	// ��й�ȣ�� ��ġ�� ���
						boardList.remove(boardList.get(i));
						index = i;
					}
				}
			}
			if(index == -1) {	// �ε����� ���� ���
				System.out.println("�ش� �ۼ��ڰ� ���ų� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				return;
			}
		} else {
			System.out.println("��ϵ� �Խñ��� �����ϴ�.");
		}

		System.out.println("\n ��ü ����Ʈ ��� : ");
	}
}
