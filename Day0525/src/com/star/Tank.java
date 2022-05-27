package com.star;

public class Tank extends Unit{

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Move it! ==> x : " + x + ", y : " + y);
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("Destination?");
	}

	@Override
	void messaga() {
		// TODO Auto-generated method stub
		System.out.println("Ready to Roll Out!");
	}
	void Sigemode() {
		System.out.println("Yes,Sir!");
	}
}
