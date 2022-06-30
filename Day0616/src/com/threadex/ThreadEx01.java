package com.threadex;

public class ThreadEx01 extends Thread{

	private int[] temp;
	
	public ThreadEx01(String threadname) {
		super(threadname);
		temp = new int[10];
		for(int start = 0; start < temp.length; start++) {
			temp[start] = start;
		}
	}
	
	public void run() {
		
		for (int start : temp) {
			try {
				sleep(1000);	//// 1000 �� 1��
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			
			System.out.printf("������ �̸� : %s", currentThread().getName());
			System.out.printf(", temp value : %d\n", start);
		}
	}
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		super.run();
//	}
	
	
	
	
	public static void main(String[] args) {
		ThreadEx01 te = new ThreadEx01("ȫ�浿");
		te.start(); // �갡 ȣ��Ǹ� �� �޼ҵ尡 �ڵ����� ȣ���

	}

}
