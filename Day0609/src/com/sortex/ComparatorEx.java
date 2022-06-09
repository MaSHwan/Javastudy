package com.sortex;

import java.util.Arrays;
import java.util.Comparator;


class Descending implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1;	// -1�� ���ؼ� �⺻ ���Ĺ���� ������ ������
//			return c2.compareTo(c1) * -1;
		}
		return -1;
	}
	
}

public class ComparatorEx {
	public static void main(String[] args) {
		
		Descending d = new Descending();
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		// ��������
		Arrays.sort(strArr);
		System.out.println("��ҹ��� �����ϴ� �������� : " + Arrays.toString(strArr));
		// ��ҹ��� ���о���
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println("��ҹ��� ���о��� �������� : " + Arrays.toString(strArr));
		// �������� ����
		Arrays.sort(strArr, d);
		System.out.println("�������� : " + Arrays.toString(strArr));
	}
}
