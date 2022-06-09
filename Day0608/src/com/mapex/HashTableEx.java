package com.mapex;
import java.util.*;
public class HashTableEx {
	private static final String name[] = 
		{"����ȯ", "������", "���翬", "������", "������"};
	private static final String tell[] = 
		{"0000 - 0000", "1111 - 1111", "2222 - 2222","3333 - 3333", "4444 - 4444"};

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable();
		
		// �ؽ� ���̺� Ű, ������ �Է�
		for(int i = 0; i < name.length; i++) {
			ht.put(name[i], tell[i]);
			
		}System.out.println(ht);
		
		// �ؽ� ���̺��� ���� Ű�� �̿��ؼ� �˻�
		String str = ht.get("����ȯ");
		if(str != null) {
			System.out.println("����ȯ�� ��ȭ��ȣ : " + str);
		}
		
		// Ű�� �����ϴ��� �˻�
		if(ht.containsKey("����ȯ")) {
			System.out.println("�ڷ� ����");
		}else
			System.out.println("�ڷᰡ �������� ����");
		
		if(ht.containsValue("0000 - 0000")) {
			System.out.println("�ڷ� ����");
		}else
			System.out.println("�ڷᰡ �������� ����");
		
		ht.remove("���翬");
		
		if(ht.containsKey("���翬")) {
			System.out.println("�ڷ� ����");
		}else
			System.out.println("�ڷᰡ �������� ����");
	}
}
