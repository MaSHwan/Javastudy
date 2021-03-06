package com.score;

import java.util.Scanner;

public class Sunglmpl extends Record implements Sung {
	Scanner sc = new Scanner(System.in);

	int in;
	Record re[];
	String subject[] = { "국어", "영어", "수학" };

	
	@Override
	public void set() { // 인원수 입력받는 기능

		do {
			System.out.println("인원수를 입력하여 주십시오. ");
			in = sc.nextInt();
		} while (in < 1 || in > 10);
		re = new Record[in];
	}

	@Override
	public void input() {// 학번, 이름, 과목별 점수 입력기능, 판정

		for (int i = 0; i < re.length; i++) {
			re[i] = new Record();
//			System.out.printf("%d번째 학생의 학번 이름을 입력(공백 구분) : ",(i+1));
//			re[i].num = sc.nextInt();
//			re[i].name = sc.next();
			
			
			System.out.println((i + 1) + "번째 학번 입력 : ");
			re[i].num = sc.nextInt();
			System.out.println((i + 1) + "번째 이름 입력 : ");
			re[i].name = sc.next();
			
		

			for (int j = 0; j < re[i].score.length; j++) {
				System.out.print(subject[j] + " : ");
				re[i].score[j] = sc.nextInt();
				re[i].sum += re[i].score[j];

				switch ((re[i].score[j])/10) {
				case 10:
				case 9:
//					scor[j] = re[i].scor[0];	
					scor[j] = "수";	
					break;
				case 8:
					scor[j] = "우";
					break;
				case 7:
					scor[j] = "미";
					break;
				case 6:
					scor[j] = "양";
					break;
				

				default:
					scor[j] = "가";
					break;
				}
			}

			re[i].avg = re[i].sum / 3.0;

		}

	}

	@Override
	public void print() {// 결과 출력
		for (int i = 0; i < in; i++) {
			System.out.print(re[i].num + "  " + re[i].name);
			for (int j = 0; j < re[i].score.length; j++) {
				System.out.print("\t" + subject[j] + " " + re[i].score[j]);

			}

			System.out.print(" 총점 : " + re[i].sum);
			System.out.print(" 평균 : " + re[i].avg);
			for (int j = 0; j < subject.length; j++) {
				System.out.print( scor[j]);
			}
			System.out.println();

		}

	}

}
