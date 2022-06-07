package com.arrayex;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ScoreImpl implements Score {
	private Scanner sc = new Scanner(System.in);
	private List<ScoreVO> list = new ArrayList<ScoreVO>();

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("\n 자료등록");

		String hak;
		System.out.print("학번 입력 : ");
		hak = sc.next();

		ScoreVO temp = readScore(hak);
		if (temp != null) {
			System.out.println("이미 등록된 학번입니다.");
			return;
		}
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);

//		String name = sc.next();
		System.out.print("이름 입력 : ");
		vo.setName(sc.next());

		System.out.print("생년월일 입력 : ");
		vo.setBirth(sc.next());

		System.out.println("국어 점수 입력 : ");
		vo.setKor(sc.nextInt());

		System.out.println("영어 점수 입력 : ");
		vo.setEng(sc.nextInt());

		System.out.println("수학 점수 입력 : ");
		vo.setMat(sc.nextInt());

		list.add(vo);
		System.out.println("자료등록 완료");
	}

	public ScoreVO readScore(String hak) {
		ScoreVO vo = null;

		for (ScoreVO temp : list) {
			if (temp.getHak().equals(hak)) {
				vo = temp;
				break;
			}
		}

		return vo;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("\n자료수정");
		String hak;
		System.out.print("수정할 학번 입력 : ");
		hak = sc.next();

		ScoreVO vo = readScore(hak);
		if (vo == null) {
			System.out.println("등록된 자료가 없습니다.\n");
			return;
		}
		System.out.print("이름 입력 : ");
		vo.setName(sc.next());
		System.out.print("생년 월일 입력 : ");
		vo.setBirth(sc.next());

		System.out.println("국어 점수 입력 : ");
		vo.setKor(sc.nextInt());

		System.out.println("영어 점수 입력 : ");
		vo.setEng(sc.nextInt());

		System.out.println("수학 점수 입력 : ");
		vo.setMat(sc.nextInt());
		
		System.out.println("수정 완료");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.print("삭제할 학번 입력 : ");
		String hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		if(vo == null) {
			System.out.println("등록된 자료가 없습니다.\n");
			return;
		}
		list.remove(vo);
		System.out.println("삭제 완료");
	}

	@Override
	public void listAll() {
		// TODO Auto-generated method stub
		System.out.println("\n 전체 리스트 출력 : ");
		Iterator<ScoreVO> it = list.iterator();

		while (it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println(vo);
		}
	}

	@Override
	public void searchName() {
		// TODO Auto-generated method stub
		System.out.println("\n 이름 검색 ");
		String name;
		System.out.println("검색할 이름 입력 : ");
		name = sc.next();
		
		for(ScoreVO vo : list) {
			if(vo.getName().startsWith(name)) {
				System.out.println(vo);
			}
		}
		System.out.println();
	}

	@Override
	public void searchhak() {
		// TODO Auto-generated method stub
		System.out.println("\n 학번 검색");
		String hak;
		System.out.println("검색할 학번 입력 : ");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		
		if(vo != null) {
			System.out.println(vo.getHak() + "\t");
			System.out.println(vo.getName() + "\t");
			System.out.println(vo.getBirth() + "\t");
			System.out.println(vo.getKor() + "\t");
			System.out.println(vo.getEng() + "\t");
			System.out.println(vo.getMat() + "\t");
			System.out.println(vo.getTot() + "\t");
			System.out.println(vo.getTot()/3 );
		}
		System.out.println();
	}

}
