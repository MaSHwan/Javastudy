
package com.Ex02;
/*
 * 		Sung Ŭ����
 * 		- �ο����� �Է¹ް�, �Է¹��� �μ� ��ŭ �̸�, ����, ����, ���������� �Է� �ް�
 * 		  ������ ���, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.(Ŭ���� ����)
 * 
 * 		�Ӽ� : �ο���, Record �迭
 * 		��� : 1. �ο��� �Է��ϴ� ���
 * 			  2. �� ������ �Է��ϴ� ���
 * 			  3. ���� ó���ϴ� ���
 * 			  4. ����� ����ϴ� ���
 */

import java.util.Scanner;

public class Sung {

	// �ֿ� ���� ����(�Ӽ�)
	int inwon; // �ο���
	Record[] rec; // Record[]�迭

	/*
	 * ��� (�޼ҵ�) 1. �ο��� �Է�
	 */
	public void set() {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("�ο��� �Է�(1 ~ 100) : ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 100);
		// ���ڵ� Ŭ������ �迭 ������ inwon��ŭ ������ ����
		// Record Ŭ������ �ν��Ͻ��� ������ ���� �ƴϴ�.
		rec = new Record[inwon];
	}

	// 2. �� ������ �Է� �� ���� ó���Ѥ� ���
	String[] title = { "���� ���� : ", "���� ���� : ", "���� ���� : " };

	public void input() {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < inwon; i++) {
			// �ν��Ͻ� ����(�߿�***)
			rec[i] = new Record();
			System.out.println((i + 1) + "��° �̸� �Է� : ");
			rec[i].name = sc.next(); // next()�� nextLine()�� ��������?
										// next()�� �� �ܾ �ν�
										// nextLine()�� �� �� ��ü�� �ν�

			for (int j = 0; j < title.length; j++) {// ����
				// �ȳ� �޼��� ���
				System.out.print(title[j]);
				// �Է¹��� ������ score �迭�� �����Ѵ�.
				rec[i].score[j] = sc.nextInt();

				// ������ �ݺ������� �Է¹޾� �������� ������ ���Ѵ�.
				rec[i].tot += rec[i].score[j];
			}

			// ��� ���
			rec[i].avg = rec[i].tot / 3.0;
			rec[i].rank = 1;
		}

	}

	public void display() {
		ranking();
		System.out.println();
		for (int i = 0; i < inwon; i++) {
			// �̸� ���
			System.out.println(rec[i].name);

			for (int j = 0; j < rec[i].score.length; j++) {
				// ���� ���
				System.out.println(title[j] + rec[i].score[j]);

			}
			System.out.println();
			System.out.println("���� : " + rec[i].tot);
			System.out.println("��� : " + rec[i].avg);
			System.out.println();
			System.out.println("���� : " + rec[i].rank);
		}
	}

	// ���� ��� �޼ҵ� �߰�
	public void ranking() {

		for (int i = 0; i < inwon; i++) {

			for (int j = 0; j < inwon; j++) {

				if (rec[i].avg > rec[j].avg) {
					rec[j].rank++;
				}else if (rec[i].avg < rec[j].avg) {
					rec[i].rank++;
				}

			}

		}

	}
}
