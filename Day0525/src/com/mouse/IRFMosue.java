package com.mouse;

public interface IRFMosue {	// 인터페이스 내의 메소드들은 전부 abstract(추상)메소드이다.
	
	//메소드
	void wconnect(); // 인터페이스에서 추상메소드를 선언할때 abstract는 생략 가능하다.

	abstract void wdisconnect();

	//상수
	static final String A = "무선방식 : 블루투스";
	String RF_Type_IR = "적외선"; // 상수 선언 할때 static final 은 생략이 가능하다.

//String getA();
}
