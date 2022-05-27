package com.play;
// 추상 클래스를 상속 받아 구현하는 구현체(하위 클래스)
public class Piano extends Instrument {
	public static void main(String[] args) {
		 Piano p = new Piano();
		 p.play();
		 p.volumeup();
		 p.volumedown();
	}
	

	@Override	// 오버라이딩 된 메소드
	void play() {	//인스턴스 메소드
		// TODO Auto-generated method stub
		System.out.println("Piano : play() 호출됨");
	}

	@Override
	void volumeup() {	//인스턴스 메소드
		// TODO Auto-generated method stub
		System.out.println("Piano : volume up() 호출됨");
	}

	@Override
	void volumedown() {	//인스턴스 메소드
		// TODO Auto-generated method stub
		System.out.println("Piano : volume down() 호출됨");
	}

}
