package com.mapex.mscore;

import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


class MyComparator<T> implements Comparator<T>{

	@Override
	public int compare(T o1, T o2) {
		
		ScoreVO s1 = (ScoreVO)o1;
		ScoreVO s2 = (ScoreVO)o2;
				
				int n = s1.getTot() - s2.getTot();
				
				if(n > 1) {
					return 1;	// ��������
				}else if(n < 1) {
					return -1;	// ��������
				}else {
					return 0;	// ����
				}
		
	}
	
}

public class ScoreImpl implements Score {

	private Map<String, ScoreVO> map;

	public ScoreImpl() {
		map = new HashMap<String, ScoreVO>();
	}

	@Override
	public int insert() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String hak;
		System.out.print("\n�й� �Է� : ");
		hak = br.readLine();

		if (map.containsKey(hak)) {
			System.out.println("�̹� �����ϴ� �й��Դϴ�.");
			return 0;
		}
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);

		String name;
		System.out.print("\n�̸� �Է� : ");
		vo.setName(br.readLine());

		int kor;
		System.out.print("\n ���� ���� : ");
		vo.setKor(Integer.parseInt(br.readLine()));

		int eng;
		System.out.print("\n ���� ���� : ");
		vo.setEng(Integer.parseInt(br.readLine()));

		int mat;
		System.out.print("\n ���� ���� : ");
		vo.setMat(Integer.parseInt(br.readLine()));

		map.put(hak, vo);

		return 1;
	}

	@Override
	public int update() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String hak;
		System.out.print("\n�й� �Է� : ");
		hak = br.readLine();

		if (!map.containsKey(hak)) {
			System.out.println("�������� �ʴ� �й��Դϴ�");
			return 0;
		}
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);

		String name;
		System.out.print("\n�̸� �Է� : ");
		vo.setName(br.readLine());

		int kor;
		System.out.print("\n ���� ���� : ");
		vo.setKor(Integer.parseInt(br.readLine()));

		int eng;
		System.out.print("\n ���� ���� : ");
		vo.setEng(Integer.parseInt(br.readLine()));

		int mat;
		System.out.print("\n ���� ���� : ");
		vo.setMat(Integer.parseInt(br.readLine()));

		map.put(hak, vo);
		return 0;
	}

	@Override
	public int search() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		char ch = 0;
		System.out.println("1 : �̸����� �˻�");
		System.out.println("2 : �й����� �˻�");
		ch = (char) br.read();
		br.read();
		br.read();
		
		if (ch == '1') {

			System.out.println("\n �˻��� �̸� �Է� : ");
			name = br.readLine();

			Set<String> set = map.keySet();
			Iterator<String> it = set.iterator();
			while (it.hasNext()) {
				String key = it.next();
				ScoreVO data = map.get(key);
				if (data.getName().equals(name)) {
					System.out.println(data.toString());
				}else {
					System.out.println("�������� �ʽ��ϴ�.");
				}
			}
		} else if (ch == '2') {
			String hak;
			System.out.print("\n �˻��� �й� �Է� : ");
			hak = br.readLine();

			Set<String> set2 = map.keySet();
			Iterator<String> it2 = set2.iterator();
			while (it2.hasNext()) {
				String key2 = it2.next();
				ScoreVO data2 = map.get(key2);
				if (data2.getHak().equals(hak)) {
				System.out.println(data2.toString());
				}else {
				System.out.println("�������� �ʽ��ϴ�.");
				}
				}
		}
		return 0;
	}

	@Override
	public int delete() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String hak;
		System.out.println("\n ������ �й� : ");
		hak = br.readLine();
		if(map.containsKey(hak)) {
			System.out.println("�������� �ʴ� �ڷ��Դϴ�.");
			return 0;
		}
		map.remove(hak);
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		
		return 1;
	}

	@Override
	public void writeAll() {
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String key = it.next();
			ScoreVO data = map.get(key);
			System.out.println(data.toString());
		}

	}

	@Override
	public void writeSort() {
		List<ScoreVO> lists = new ArrayList<>();
		Set<String> set = map.keySet();
		
		// ��������
		Collections.sort(lists,new MyComparator<ScoreVO>());
		Iterator<ScoreVO> it1 = lists.iterator();
		while(it1.hasNext()) {
			ScoreVO data = it1.next();
			System.out.println(data.toString());
		}
		
		// �������� ����
		Collections.sort(lists, Collections.reverseOrder(new MyComparator<ScoreVO>()));
		
		System.out.println("\n ������ ���� : ");
		Iterator<ScoreVO> it2 = lists.iterator();
		while(it2.hasNext()) {
			ScoreVO data = it2.next();
			System.out.println(data.toString());
		}
	}

}
