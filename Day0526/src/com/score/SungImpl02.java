package com.score;

import java.util.Scanner;

public class SungImpl02 extends Record implements Sung {
	Scanner sc = new Scanner(System.in);

	int in;
	Record re[];
	String subject[] = { "국어", "영어", "수학" };

	@Override
	public void set() {
		// TODO Auto-generated method stub
		do {
			System.out.println("인원수를 입력하여 주십시오. ");
			in = sc.nextInt();
		} while (in < 1 || in > 10);
		re = new Record[in];
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		for (int i = 0; i < in; i++) {
			re[i] = new Record();
			System.out.printf("%d번째 학생의 학번 이름을 입력(공백 구분) : ", (i + 1));
			re[i].num = sc.nextInt();
			re[i].name = sc.next();

			System.out.println("국어 영어 수학 점수 입력(공백 구분) : ");
			re[i].score[0] = sc.nextInt(); // 국어 점수
			re[i].score[1] = sc.nextInt(); // 영어 점수
			re[i].score[2] = sc.nextInt(); // 수학 점수

			// 각 과목별 판저이 수 : 90이상, 우: 80이상, 미 : 70이상. 양 : 60이상, 가 : 60이하

			for (int j = 0; j < re[i].scor.length; j++) {
				if (re[i].score[j] >= 90)
					re[i].scor[j] = "수";
					else if (re[i].score[j] >= 80)
					re[i].scor[j] = "우";
					else if (re[i].score[j] >= 70)
					re[i].scor[j] = "미";
					else if (re[i].score[j] >= 60)
					re[i].scor[j] = "양";
					else
					re[i].scor[j] = "가";
			}

			// 총점
			re[i].sum = re[i].score[0] + re[i].score[1] + re[i].score[2];
			//평균
			re[i].avg = re[i].sum / 3;
		}
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		for (int i = 0; i < in; i++) {
			System.out.printf("%5d %5s %3d %3d %3d %3d %3d %s %s %s\n,"
					,re[i].num, re[i].name, re[i].score[0], re[i].score[1], re[i].score[2],
					re[i].sum, re[i].avg, re[i].scor[0],re[i].scor[1],re[i].scor[2]);
		}
	}

}
