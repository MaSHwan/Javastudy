package com.setex;
import java.util.*;
public class HashSetEx {
	public static void main(String[] args) {
		// set : 중복을 허용안함, 순서가 없음
		Set<String> dog = new HashSet<String>();
		dog.add("진돗개");
		dog.add("불독");
		dog.add("말티즈");
		dog.add("시베리안 허스키");
		dog.add("시바견");
		dog.add("골든 리트리버");
		dog.add("세퍼트");
		
		System.out.println("기존 set 데이터 : ");
		System.out.println(dog);
		
		dog.add("세퍼트");
		System.out.println("추가후 set 데이터 : ");
		System.out.println(dog);
		
		Iterator<String> it = dog.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.print(str + "  ");
		}
	}
}
