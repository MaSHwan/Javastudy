package com.study;
// 실제 회원을 검색하는 기능 구현
public class SearchService {
	
	// 객체 배열 5개 저장
	Member[] members = new Member[5];
	public SearchService() {
		// 생성자를 호출해서 객체가 생성될떄 다섯개의 배열로 저장하는 부분
		// members 객체배열에 회원들의 정보를 저장
		members[0] = new Member("홍길동", "한국", 180, 70);
		members[1] = new Member("고길동", "일본", 175, 65);
		members[2] = new Member("시진핑", "중국", 172, 70);
		members[3] = new Member("유비", "한나라", 187, 97);
		members[4] = new Member("제갈공명", "제나라", 180, 70);
	}
	// 회원의 이름을 매개 변수로 받아서 해당 이름을 가지고 있는 회원 객체 배열에서 찾아
	// 해당 회원의 정보를 출력하는 기능 구현
	boolean searchMember(String name) {
		boolean searchResult = false;
		for(int i = 0; i < members.length; i++) {
			if(members[i].getName().equals(name)) {
				// 해당 이름의 회원이 찾아 졌으면 정보를 출력
				prtInfo(members[i]);
				searchResult = true;
			}
		}
		return searchResult;
	}
	// 파라미터 값으로 회원 객체의 정보를 받아서 출력하는 메소드
	private void prtInfo(Member member) {
		System.out.println(member.getName() + " 으로 찾은 결과값");
		System.out.println("이름 : " + member.getName() + " 국가 : " + member.getNation() 
		+ " 신장 : " + member.getHeight() + " 몸무게 : " + member.getWeight());
	}
}
