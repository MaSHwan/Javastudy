package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 배열03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// int human = Integer.parseInt(args[0]);

		System.out.print("학생수 입력 : ");
		int human = Integer.parseInt(br.readLine()); // 사람수 구하기
		String[] name = new String[human];

		// String[] subject = new String[args.length - 1]; // 과목명 초기화
		String[] subject = { "국어", "영어", "수학" };

		// 점수와 총점 처리 배열서언
		int[][] score = new int[human][subject.length];
		float[] avg = new float[human];
		char[] grade = new char[human];
		int[] rank = new int[human];
		/*
		 * for (int i = 0; i < subject.length ; i++) { // subject[i] = args[i + 1];
		 * System.out.println(subject[i]); }
		 */
		for (int i = 0; i < human; i++) {// 사람수 만큼 반복
			System.out.print((i + 1) + " 번째 학생 이름 : ");
			name[i] = br.readLine();
			System.out.println(name[i] + " 학생 점수 입력  ");

			for (int j = 0; j < subject.length; j++) {
				System.out.print(subject[j] + " 점수 : ");
				score[i][j] = Integer.parseInt(br.readLine());
			}

		}
	}
}
