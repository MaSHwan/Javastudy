package com.inner;
/*
 * 		Anoymous(�͸�) �̳� Ŭ����
 * 
 * 		- �͸��̶� �̸��� ���� ���� �ǹ�
 * 		- �ڹ��� ���α׷� ���� �ؼ��� ��� : Ŭ������ �̸��� ����.
 * 
 * 		Event�� ������ ����
 * 		interface ������ �ʿ����
 * 		�Ϲ� �޼ҵ� ���ο��� ���Ǻθ� ���� �� ����
 * 		abstract �� ��� ���� �� ����
 * 		�������̽��� ��� �޾� �����Ҷ��� �� ���� ������
 */
abstract class AbsExam {
	int data = 10000;

	public abstract void printData();
}

public class AnnoyInner {

	AbsExam ae = new AbsExam() {

		@Override
		public void printData() {
			// TODO Auto-generated method stub
			System.out.println(data);
		}

	};

	public static void main(String[] args) {
		AnnoyInner ai = new AnnoyInner();
		ai.ae.printData();
	}

}
