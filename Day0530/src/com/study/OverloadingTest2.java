package com.study;

public class OverloadingTest2 {

	public int area(int w, int h) {
		return w * h;
	}
	
	public double area(int r) {		// �Ű� ������ �ڷ� ��ȯ���� �ٸ�
									// �̰͵� �����ε�
		return (double)r * r * 3.141592;
	}
	
	public void write(int result) {
		System.out.println("�簢���� ���� : " + result);
	}
	public void write(double result) {				// �̸��� ���Ƶ� �Ű������� �ڷ����� �޶� �����ε��� ����
		System.out.println("���� ���� : " + result);
	}
	
	public static void main(String[] args) {
		
		OverloadingTest2 ot = new OverloadingTest2();
		int res = ot.area(10, 5);
		double cc = ot.area(10);
		
		ot.write(res);
		ot.write(cc);
	}
	
	

}
