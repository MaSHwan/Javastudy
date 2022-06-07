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
		System.out.println("\n �ڷ���");

		String hak;
		System.out.print("�й� �Է� : ");
		hak = sc.next();

		ScoreVO temp = readScore(hak);
		if (temp != null) {
			System.out.println("�̹� ��ϵ� �й��Դϴ�.");
			return;
		}
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);

//		String name = sc.next();
		System.out.print("�̸� �Է� : ");
		vo.setName(sc.next());

		System.out.print("������� �Է� : ");
		vo.setBirth(sc.next());

		System.out.println("���� ���� �Է� : ");
		vo.setKor(sc.nextInt());

		System.out.println("���� ���� �Է� : ");
		vo.setEng(sc.nextInt());

		System.out.println("���� ���� �Է� : ");
		vo.setMat(sc.nextInt());

		list.add(vo);
		System.out.println("�ڷ��� �Ϸ�");
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
		System.out.println("\n�ڷ����");
		String hak;
		System.out.print("������ �й� �Է� : ");
		hak = sc.next();

		ScoreVO vo = readScore(hak);
		if (vo == null) {
			System.out.println("��ϵ� �ڷᰡ �����ϴ�.\n");
			return;
		}
		System.out.print("�̸� �Է� : ");
		vo.setName(sc.next());
		System.out.print("���� ���� �Է� : ");
		vo.setBirth(sc.next());

		System.out.println("���� ���� �Է� : ");
		vo.setKor(sc.nextInt());

		System.out.println("���� ���� �Է� : ");
		vo.setEng(sc.nextInt());

		System.out.println("���� ���� �Է� : ");
		vo.setMat(sc.nextInt());
		
		System.out.println("���� �Ϸ�");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.print("������ �й� �Է� : ");
		String hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		if(vo == null) {
			System.out.println("��ϵ� �ڷᰡ �����ϴ�.\n");
			return;
		}
		list.remove(vo);
		System.out.println("���� �Ϸ�");
	}

	@Override
	public void listAll() {
		// TODO Auto-generated method stub
		System.out.println("\n ��ü ����Ʈ ��� : ");
		Iterator<ScoreVO> it = list.iterator();

		while (it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println(vo);
		}
	}

	@Override
	public void searchName() {
		// TODO Auto-generated method stub
		System.out.println("\n �̸� �˻� ");
		String name;
		System.out.println("�˻��� �̸� �Է� : ");
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
		System.out.println("\n �й� �˻�");
		String hak;
		System.out.println("�˻��� �й� �Է� : ");
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
