package com.member;

import java.util.Scanner;

public class DeleteAction implements Action {

	@Override
	public void execute(Scanner sc) {
		System.out.println("삭제할 회원의 이름을 입력하세요.");
		System.out.print("삭제할 회원 이름 : ");
		String name = sc.next();
		deleteMember(name);
		
	}

	private void deleteMember(String name) {
		int deleteIndex = -1;
		//삭제할 회원 정보 객체의 배열에서의 인덱스 번호를 -1 로 초기화함
		MemberVO[] members = MemberMain.members;
		/*
		 * 		삭제할 회원정보 객체의 인덱스 번호를 찾아내기 위헤 MemberMain클래스의 static 영역에
		 * 		공유되어 있는 members 배열 레퍼런스 변수의 레퍼런스 값을 가져옴
		 */
		MemberVO[] temp = null;
		/*
		 * 		원본 배열의 객체에서 제거할 회원정보 객체를 제거하고 나머지 회원정보 객체를
		 * 		배열 객체 레퍼런스 변수명을 temp로 선언
		 */

		for (int i = 0; i < members.length; i++) {
			if (members[i].getName().equals(name)) {
				deleteIndex = i;
				/*
				 * 	현재 배열 객체에 저장되어 있는 회원 정보 객체중 피라미터 값으로 전송되어 온 name값을 가지고
				 * 	있는 회원 정보 객체를 찾기 못했다는 의미이며 메시지를 출력하고 메소드를 종료함
				 */
			}
		}
		if (deleteIndex == -1) {
			System.out.println("회원 정보가 존재하지 않습니다.");
			return;
			// deleteIndex가 -1 이라는 것은 파라미터 전송되어 온 name값과 같은 name값을 가지고
			// 있는 회원 정보 객체를 찾지 못했다는 의미이며 메시지를 출력하고 메소드를 종료함
		}

		if (members.length >= 1) {
			temp = new MemberVO[members.length - 1];
			/*
			 * 	temp 배열 객체를 MemberMain클래스에 공유되어 있는 members배열의 크기보다
			 * 	하나 작은 크기로 생성함
			 * 	원본 배열에서 회원정보 객체 하나를 삭제할 것이므로 기존 배열의 크기보다 하나 적게 생성함
			 */

			for (int i = 0; i < members.length; i++) {
				if (i == deleteIndex) {
					// 현재 인덱스가 삭제하려는 회원정보의 인덱스와 같으면 continue를 실행하여 건너뜀
					//	회원 정보의 객체를 복사하지 않는다.
					continue;
				} else if (i > deleteIndex) {
					// 현재 인덱스 번호가 삭제하려는 회원 정보의 인덱스 이후 이면 삭제하려는 객체의
					// 인덱스 번호 하나가 빠졌기 때문에 삭제하려는 인덱스보다 큰 인덱스에 존재하는
					// 객체들을 앞으로 하나씩 이동시켜서 복사함.
					temp[i - 1] = members[i];
				} else {
					temp[i] = members[i];
					
				}
			}
		}
		MemberMain.members = temp;
		// 배열객체 temp를 MemberMain 클래스에 static으로 공유되어 있는
		// member변수에 저장함
	}

}
