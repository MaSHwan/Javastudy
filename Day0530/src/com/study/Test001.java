package com.study;
/*
 * 		���������� �ʱ�ȭ ������ ��ġ�� ������ ����� ���� ����.
 * 		(�ڵ� �ʱ�ȭ ����� �������� �ʴ´�.)
 */
public class Test001 {
	
	static int b;	// �������� (�ν��Ͻ� �������)
	// ����ϴ� �������� �ʱ�ȭ���� ���� ��� int�� ���� �ڵ����� 0���� �ʱ�ȭ�ȴ�.
	// �������̸� null��, boolean�̸� false
	public static void main(String[] args) {
		int a = 10;
		//int a; ��� �� ��� ���� �����̱� ������ �ʱ�ȭ�� �����־ ������ ��
		
		Test001 t = new Test001(); // ��ü ����
		
		System.out.println("a : " + a);
		System.out.println(Test001.b);
		System.out.println(new Test001().b);
		System.out.println(t.b);
	}
}