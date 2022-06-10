package com.utilex;
/*		String class
 * 		- ���ڿ��� �ǹ��ϴ� Ŭ����
 * 		- ��ü �ڷ���������, �⺻�ڷ���ó�� ���
 * 
 * 		������
 * 		String() : ����ִ� ���ڿ� ��ü�� �����ϰ� �ʱ�ȭ�Ѵ�.
 * 		String(char[]value) : ������ char�迭 ���� ������ ���������� �����Ͽ� ���ο� ���ڿ��� ������
 * 		String(String original) : String���� original�� ���ڿ��� ���Ӱ� ������ ���ڿ���ü�� �ʱ�ȭ
 * 
 * 		
 * 		��ü ������
 * 		�ڵ�(�Ͻ��� ��ü����)
 * 		String s1 = "Test";					// ��ü����
 * 
 * 		����(����� ��ü����)
 * 		String s2 = new String("Test");		// ��ü����
 */

public class StringEx01 {
	public static void main(String[] args) {
		
		String s1 = "TEST";
		String s2 = "TEST";
		
		if(s1 == s2) {
			System.out.println("s1�� s2�� ����.");
		}else {
			System.out.println("s1�� s2�� �����ʴ�.");
		}
		
		String s3 = new String("TEST");
		
		if(s1 == s3) {
			System.out.println("s1�� s3�� ����.");
		}else {
			System.out.println("s1�� s3�� �����ʴ�.");
		}
		
		String s4 = new String("TEST");
		
		if(s4 == s3) {	// ��ü�� �ּҰ� ��
			System.out.println("s4�� s3�� ����.");
		}else {
			System.out.println("s4�� s3�� �����ʴ�.");
		}
		/*
		 * 	�Ͻ��� ��ü ������ ����� ��ü ������ ������
		 * 	1. (==)�����ڴ� �ּҰ��� ����Ѵ�.
		 * 	2. ��ü�� ���� �񱳴� equals() �޼ҵ带 Ȱ���Ѵ�
		 */
		
		if(s1.equals(s2)) { // ��ü�� �� ��
			System.out.println("s1�� s2�� ����.");
		}else {
			System.out.println("s1�� s2�� �����ʴ�.");
		}
		
		if(s3.equals(s4)) {
			System.out.println("s4�� s3�� ����.");
		}else {
			System.out.println("s4�� s3�� �����ʴ�.");
		}
		

	}
}
