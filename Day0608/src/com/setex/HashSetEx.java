package com.setex;
import java.util.*;
public class HashSetEx {
	public static void main(String[] args) {
		// set : �ߺ��� ������, ������ ����
		Set<String> dog = new HashSet<String>();
		dog.add("������");
		dog.add("�ҵ�");
		dog.add("��Ƽ��");
		dog.add("�ú����� �㽺Ű");
		dog.add("�ùٰ�");
		dog.add("��� ��Ʈ����");
		dog.add("����Ʈ");
		
		System.out.println("���� set ������ : ");
		System.out.println(dog);
		
		dog.add("����Ʈ");
		System.out.println("�߰��� set ������ : ");
		System.out.println(dog);
		
		Iterator<String> it = dog.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.print(str + "  ");
		}
	}
}
