package com.member;

import java.util.Scanner;

public class WriteAction implements Action {

	@Override
	public void execute(Scanner sc) {
		System.out.println("등록할 회원의 정보를 입력 하세요.");
		System.out.println("이름 : ");
		String name = sc.next();
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		System.out.println("이메일 : ");
		String email = sc.next();
		
		System.out.println("국가 : ");
		String nation = sc.next();
		
		System.out.println("전화번호 : ");
		String tel = sc.next();
		
		MemberVO member = new MemberVO(age, name, tel, email, nation);
		addMember(member);
		
		
		

	}
	
	// 멤버 추가 저장 메소드
	private void addMember(MemberVO member) {
		MemberVO[] temp = new MemberVO[MemberMain.members.length + 1];
		for(int i = 0; i < MemberMain.members.length; i ++) {
			temp[i] = MemberMain.members[i];
		}
		
		temp[temp.length - 1] = member;
		/*
		 * 	기존 배열 객체가 새로 생성한 temp 배열 객체보다 저장 영역이 하나 적으므로 기존 배열 객체에
		 * 	존재하는 객체를 배열 temp배열 객체에 그대로 복사하면
		 * 	temp 배열 객체의 마지막 인덱스 영역이 초기화 되지 않고 비어 있는 상태임
		 * 	인덱스 영역이 비어 있기 때문에 새로 추가된 회원 정보 객체를 추가할 수 있음
		 */
		
		MemberMain.members = temp;
		/*
		 * 	MemberMain 클래스의 static영역에 공유되어 있는 레퍼런스 값을 temp변수에
		 * 	저장되어 있는 레퍼런스값으로 변경됨
		 * 	즉 참조하는 객체를 새로 생성해서 회원 정보 객체를 하나 더 추가한 객체로 변경 하여 보여줌
		 */
	}

	

}
