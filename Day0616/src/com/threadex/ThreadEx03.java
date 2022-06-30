package com.threadex;

class ThreadExam03 extends Thread{
	@Override
	public void run() {
		for(char ch = 'A'; ch <= 'z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(150);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		super.run();
	}
}


public class ThreadEx03 {
	public static void main(String[] args) {
		
		ThreadExam03 t = new ThreadExam03();
		t.start();
		
		for(int i = 1; i < 60; i++) {
			System.out.println(i);
			try {
				Thread.sleep(150);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}
