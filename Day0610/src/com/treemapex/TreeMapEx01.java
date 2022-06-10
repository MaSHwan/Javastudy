package com.treemapex;
import java.util.*;
import java.io.*;
public class TreeMapEx01 {

	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<>();
		map.put("만화", "마녀배달부 키키");
		map.put("호러", "스크림");
		map.put("영화", "부당거래");
		map.put("방화", "쉬리");
		map.put("TV", "무한도전");
		
		System.out.println(map);
		
		Map<String, String> subMap = map.subMap("방화",true, "호러",true);// 마지막 부분도 같이 출력하고싶으면
																		// 앞과 뒷 부분에 전부 true를 입력
		System.out.println(subMap);
		// subMap은 부분만 출력 가능하게 해줌
		// tailMap은 시작지점을 정하고 끝까지 출력 가능
		
		/*
		 *  TreeMap 클래스는 소트(정렬)된 상태로 자료가 추가된다.
		 *  TreeMap 클래스의 SortedMap<K, V> subMap(K fromKey, K toKey) 메소드
		 *  fromKey: 키를 포함함, toKey : 키를 포함하지않음
		 *  키 범위를 부분적으로 추출하여 리턴함
		 */
		

	}

}
