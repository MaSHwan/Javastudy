package com.threadex;

public class ThreadEx02 implements Runnable {

	private int[] temp;
	
	public ThreadEx02() {
		
		temp = new int[10];
		for(int start = 0; start < temp.length; start++) {
			temp[start] = start;
		}
	}
	
	@Override
public void run() {
		
		for (int start : temp) {
			try {
				Thread.sleep(1000);	
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			
			System.out.printf("스레드 이름 : %s", Thread.currentThread().getName());
			System.out.printf(", temp value : %d\n", start);
		}
	}

	public static void main(String[] args) {
		ThreadEx02 te2 = new ThreadEx02();
		Thread t = new Thread(te2, "홍길동");
		t.start();
	}

}
