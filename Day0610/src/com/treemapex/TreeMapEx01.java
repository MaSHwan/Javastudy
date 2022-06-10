package com.treemapex;
import java.util.*;
import java.io.*;
public class TreeMapEx01 {

	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<>();
		map.put("��ȭ", "�����޺� ŰŰ");
		map.put("ȣ��", "��ũ��");
		map.put("��ȭ", "�δ�ŷ�");
		map.put("��ȭ", "����");
		map.put("TV", "���ѵ���");
		
		System.out.println(map);
		
		Map<String, String> subMap = map.subMap("��ȭ",true, "ȣ��",true);// ������ �κе� ���� ����ϰ������
																		// �հ� �� �κп� ���� true�� �Է�
		System.out.println(subMap);
		// subMap�� �κи� ��� �����ϰ� ����
		// tailMap�� ���������� ���ϰ� ������ ��� ����
		
		/*
		 *  TreeMap Ŭ������ ��Ʈ(����)�� ���·� �ڷᰡ �߰��ȴ�.
		 *  TreeMap Ŭ������ SortedMap<K, V> subMap(K fromKey, K toKey) �޼ҵ�
		 *  fromKey: Ű�� ������, toKey : Ű�� ������������
		 *  Ű ������ �κ������� �����Ͽ� ������
		 */
		

	}

}
