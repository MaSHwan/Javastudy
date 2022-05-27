
package com.Ex02;
/*
 * 		Sung 클래스
 * 		- 인원수를 입력받고, 입력받은 인수 만큼 이름, 국어, 여엉, 수학점수를 입력 받고
 * 		  총점과 평균, 석차를 구하는 프로그램을 작성하시오.(클래스 설계)
 * 
 * 		속성 : 인원수, Record 배열
 * 		기능 : 1. 인원수 입력하는 기능
 * 			  2. 상세 데이터 입력하는 기능
 * 			  3. 연산 처리하는 기능
 * 			  4. 결과를 출력하는 기능
 */

import java.util.Scanner;

public class Sung {

	// 주요 변수 선언(속성)
	int inwon; // 인원수
	Record[] rec; // Record[]배열

	/*
	 * 기능 (메소드) 1. 인원수 입력
	 */
	public void set() {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("인원수 입력(1 ~ 100) : ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 100);
		// 레코드 클래스의 배열 변수를 inwon만큼 생성한 것임
		// Record 클래스의 인스턴스를 생성한 것은 아니다.
		rec = new Record[inwon];
	}

	// 2. 상세 데이터 입력 및 연산 처리한ㄴ 기능
	String[] title = { "국어 점수 : ", "영어 점수 : ", "수학 점수 : " };

	public void input() {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < inwon; i++) {
			// 인스턴스 생성(중요***)
			rec[i] = new Record();
			System.out.println((i + 1) + "번째 이름 입력 : ");
			rec[i].name = sc.next(); // next()와 nextLine()의 차이점은?
										// next()는 한 단어만 인식
										// nextLine()은 한 줄 전체를 인식

			for (int j = 0; j < title.length; j++) {// 과목
				// 안내 메세지 출력
				System.out.print(title[j]);
				// 입력받은 점수를 score 배열에 저장한다.
				rec[i].score[j] = sc.nextInt();

				// 점수를 반복적으로 입력받아 누적시켜 총점을 구한다.
				rec[i].tot += rec[i].score[j];
			}

			// 평균 계산
			rec[i].avg = rec[i].tot / 3.0;
			rec[i].rank = 1;
		}

	}

	public void display() {
		ranking();
		System.out.println();
		for (int i = 0; i < inwon; i++) {
			// 이름 출력
			System.out.println(rec[i].name);

			for (int j = 0; j < rec[i].score.length; j++) {
				// 점수 출력
				System.out.println(title[j] + rec[i].score[j]);

			}
			System.out.println();
			System.out.println("총점 : " + rec[i].tot);
			System.out.println("평균 : " + rec[i].avg);
			System.out.println();
			System.out.println("석차 : " + rec[i].rank);
		}
	}

	// 석차 계산 메소드 추가
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
