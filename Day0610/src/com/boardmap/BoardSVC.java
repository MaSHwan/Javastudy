package com.boardmap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class BoardSVC {
	Scanner sc = new Scanner(System.in);

//	ArrayList<BoardVO> boardList;
	ArrayList <HashMap<String, String>> boardList;

	public BoardSVC() {
		boardList = new ArrayList<HashMap<String, String>>();
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

//		BoardVO boardVO = new BoardVO(register, subject, email, content, passwd);
		// ArrayList�� �߰�
//		boardList.add(boardVO);
		
		HashMap<String, String> boardMap = new HashMap<String, String>();
		boardMap.put("register", register);
		
		addArticle(boardMap);
	}

	// ���� ����Ʈ�� �߰�
	private void addArticle(HashMap<String, String> boardMap) {
		boardList.add(boardMap);
	}

	// ��� ���� �޼ҵ�
	public void listArticle(Scanner sc) {

		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				System.out.println("�ۼ��� : " + boardList.get(i).get("register")
						+ ", subject : " + boardList.get(i).get("subject")
						+ ", email : " + boardList.get(i).get("email")
						+ " , content : " + boardList.get(i).get("content"));
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
				if(boardList.get(i).get("register").equals(register)) {	// �ۼ��ڰ� �´� ���
					if(boardList.get(i).get("passwd").equals(passwd)){	// ��й�ȣ�� ��ġ�� ���
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
