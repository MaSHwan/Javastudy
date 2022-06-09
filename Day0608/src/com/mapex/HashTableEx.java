package com.mapex;
import java.util.*;
public class HashTableEx {
	private static final String name[] = 
		{"마승환", "한찬규", "김재연", "김주은", "배해인"};
	private static final String tell[] = 
		{"0000 - 0000", "1111 - 1111", "2222 - 2222","3333 - 3333", "4444 - 4444"};

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable();
		
		// 해시 테이블에 키, 데이터 입력
		for(int i = 0; i < name.length; i++) {
			ht.put(name[i], tell[i]);
			
		}System.out.println(ht);
		
		// 해시 테이블의 값을 키를 이용해서 검색
		String str = ht.get("마승환");
		if(str != null) {
			System.out.println("마승환의 전화번호 : " + str);
		}
		
		// 키가 존재하는지 검색
		if(ht.containsKey("마승환")) {
			System.out.println("자료 존재");
		}else
			System.out.println("자료가 존재하지 않음");
		
		if(ht.containsValue("0000 - 0000")) {
			System.out.println("자료 존재");
		}else
			System.out.println("자료가 존재하지 않음");
		
		ht.remove("김재연");
		
		if(ht.containsKey("김재연")) {
			System.out.println("자료 존재");
		}else
			System.out.println("자료가 존재하지 않음");
	}
}
