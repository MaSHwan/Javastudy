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

	// 글쓰기 메소드

	public void writeArticle(Scanner sc) {
		System.out.println("게시판 글을 작성 하세요.");

		System.out.print("작성자 : ");
		String register = sc.next();

		System.out.print("email : ");
		String email = sc.next();

		System.out.print("비밀 번호 : ");
		String passwd = sc.next();

		System.out.print("제목 : ");
		String subject = sc.next();

		System.out.print("글내용 : ");
		String content = sc.next();

//		BoardVO boardVO = new BoardVO(register, subject, email, content, passwd);
		// ArrayList에 추가
//		boardList.add(boardVO);
		
		HashMap<String, String> boardMap = new HashMap<String, String>();
		boardMap.put("register", register);
		
		addArticle(boardMap);
	}

	// 글을 리스트에 추가
	private void addArticle(HashMap<String, String> boardMap) {
		boardList.add(boardMap);
	}

	// 목록 보기 메소드
	public void listArticle(Scanner sc) {

		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				System.out.println("작성자 : " + boardList.get(i).get("register")
						+ ", subject : " + boardList.get(i).get("subject")
						+ ", email : " + boardList.get(i).get("email")
						+ " , content : " + boardList.get(i).get("content"));
			}
		} else {
			System.out.println("등록된 게시글이 없습니다.");
		}

		System.out.println("\n 전체 리스트 출력 : ");

	}

	// 글 삭제 메소드
	public void removeArticle(Scanner sc) {
		System.out.println("게시글 제거할때는 글의 작성자와 비밀번호를 입력하시오.");
		System.out.println("작성자 : ");
		String name = sc.next();
		System.out.println("비밀번호 : ");
		String passwd = sc.next();

		removeArticle(name, passwd);
	}

	private void removeArticle(String register, String passwd) {
		if (boardList.size() > 0) {

			int index = -1;

			for (int i = 0; i < boardList.size(); i++) {
				if(boardList.get(i).get("register").equals(register)) {	// 작성자가 맞는 경우
					if(boardList.get(i).get("passwd").equals(passwd)){	// 비밀번호가 일치한 경우
						boardList.remove(boardList.get(i));
						index = i;
					}
				}
			}
			if(index == -1) {	// 인덱스가 없는 경우
				System.out.println("해당 작성자가 없거나 비밀번호가 일치하지 않습니다.");
				return;
			}
		} else {
			System.out.println("등록된 게시글이 없습니다.");
		}

		System.out.println("\n 전체 리스트 출력 : ");
	}
}
