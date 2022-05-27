package com.star;

public class Marine extends Unit{

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("마린의 위치 이동 좌표는 x : " + x +", y : " + y + " 입니다.");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("마린이 대기 상태에 있습니다.");
	}

	@Override
	void messaga() {
		// TODO Auto-generated method stub
		System.out.println("Message : go go go");		
	}
	
	void stimPack() {
	System.out.println("마린이 스티맥을 사용합니다.");	
	}

}
