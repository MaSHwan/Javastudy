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
					return 1;	// 오름차순
				}else if(n < 1) {
					return -1;	// 내림차순
				}else {
					return 0;	// 같다
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
		System.out.print("\n학번 입력 : ");
		hak = br.readLine();

		if (map.containsKey(hak)) {
			System.out.println("이미 존재하는 학번입니다.");
			return 0;
		}
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);

		String name;
		System.out.print("\n이름 입력 : ");
		vo.setName(br.readLine());

		int kor;
		System.out.print("\n 국어 점수 : ");
		vo.setKor(Integer.parseInt(br.readLine()));

		int eng;
		System.out.print("\n 영어 점수 : ");
		vo.setEng(Integer.parseInt(br.readLine()));

		int mat;
		System.out.print("\n 수학 점수 : ");
		vo.setMat(Integer.parseInt(br.readLine()));

		map.put(hak, vo);

		return 1;
	}

	@Override
	public int update() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String hak;
		System.out.print("\n학번 입력 : ");
		hak = br.readLine();

		if (!map.containsKey(hak)) {
			System.out.println("존재하지 않는 학번입니다");
			return 0;
		}
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);

		String name;
		System.out.print("\n이름 입력 : ");
		vo.setName(br.readLine());

		int kor;
		System.out.print("\n 국어 점수 : ");
		vo.setKor(Integer.parseInt(br.readLine()));

		int eng;
		System.out.print("\n 영어 점수 : ");
		vo.setEng(Integer.parseInt(br.readLine()));

		int mat;
		System.out.print("\n 수학 점수 : ");
		vo.setMat(Integer.parseInt(br.readLine()));

		map.put(hak, vo);
		return 0;
	}

	@Override
	public int search() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		char ch = 0;
		System.out.println("1 : 이름으로 검색");
		System.out.println("2 : 학번으로 검색");
		ch = (char) br.read();
		br.read();
		br.read();
		
		if (ch == '1') {

			System.out.println("\n 검색할 이름 입력 : ");
			name = br.readLine();

			Set<String> set = map.keySet();
			Iterator<String> it = set.iterator();
			while (it.hasNext()) {
				String key = it.next();
				ScoreVO data = map.get(key);
				if (data.getName().equals(name)) {
					System.out.println(data.toString());
				}else {
					System.out.println("존재하지 않습니다.");
				}
			}
		} else if (ch == '2') {
			String hak;
			System.out.print("\n 검색할 학번 입력 : ");
			hak = br.readLine();

			Set<String> set2 = map.keySet();
			Iterator<String> it2 = set2.iterator();
			while (it2.hasNext()) {
				String key2 = it2.next();
				ScoreVO data2 = map.get(key2);
				if (data2.getHak().equals(hak)) {
				System.out.println(data2.toString());
				}else {
				System.out.println("존재하지 않습니다.");
				}
				}
		}
		return 0;
	}

	@Override
	public int delete() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String hak;
		System.out.println("\n 삭제할 학번 : ");
		hak = br.readLine();
		if(map.containsKey(hak)) {
			System.out.println("존재하지 않는 자료입니다.");
			return 0;
		}
		map.remove(hak);
		System.out.println("삭제가 완료되었습니다.");
		
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
		
		// 오름차순
		Collections.sort(lists,new MyComparator<ScoreVO>());
		Iterator<ScoreVO> it1 = lists.iterator();
		while(it1.hasNext()) {
			ScoreVO data = it1.next();
			System.out.println(data.toString());
		}
		
		// 내림차순 저열
		Collections.sort(lists, Collections.reverseOrder(new MyComparator<ScoreVO>()));
		
		System.out.println("\n 총점순 정렬 : ");
		Iterator<ScoreVO> it2 = lists.iterator();
		while(it2.hasNext()) {
			ScoreVO data = it2.next();
			System.out.println(data.toString());
		}
	}

}
