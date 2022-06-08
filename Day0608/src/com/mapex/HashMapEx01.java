package com.mapex;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;


public class HashMapEx01 {
/*
 * 	Map<key, value> : 키 값은 중복을 허용하지 않음, 값은 중복을 허용함
 * 					  키 값이 중복될 경우 값을 변경 해야함
 */
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("만화", "나루토");
		map.put("호러", "컨저링");
		map.put("영화", "부당거래");
		
		System.out.println(map);
		
		String key;
		
		Set set = map.keySet();
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			key = it.next();
			System.out.println(map.get(key));
		}
		
		map.put("영화", "내부자들");
		System.out.println(map);
	}
}
