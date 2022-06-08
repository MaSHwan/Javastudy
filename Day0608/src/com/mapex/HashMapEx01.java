package com.mapex;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;


public class HashMapEx01 {
/*
 * 	Map<key, value> : Ű ���� �ߺ��� ������� ����, ���� �ߺ��� �����
 * 					  Ű ���� �ߺ��� ��� ���� ���� �ؾ���
 */
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("��ȭ", "������");
		map.put("ȣ��", "������");
		map.put("��ȭ", "�δ�ŷ�");
		
		System.out.println(map);
		
		String key;
		
		Set set = map.keySet();
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			key = it.next();
			System.out.println(map.get(key));
		}
		
		map.put("��ȭ", "�����ڵ�");
		System.out.println(map);
	}
}
