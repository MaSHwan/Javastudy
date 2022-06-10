package com.treemapex;
import java.util.*; // treeMap
public class TreeMapEx02 {
	public static void main(String[] args) {
		TreeMap<String, SungRec> map = new TreeMap<>();
		map.put("3333", new SungRec("����ȯ", 80, 70, 60));
		map.put("1111", new SungRec("������", 70, 60, 80));
		map.put("2222", new SungRec("���翬", 50, 80, 70));
		map.put("4444", new SungRec("������", 60, 90, 50));
		map.put("5555", new SungRec("������", 90, 50, 90));
		
		String key;
		Set set = map.keySet();
		Iterator <String> it = set.iterator();
		while(it.hasNext()) {
			key = it.next();
			SungRec data = map.get(key);
			System.out.printf("%4s �̸� : %3s �������� :%3d �������� :%3d �������� :%3d ���� :%4d\n",
					key, data.getName(), data.getKor(), data.getEng(), data.getMat(), data.getTot());
		}
		
	}
}
