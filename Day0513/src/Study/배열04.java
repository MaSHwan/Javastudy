package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 배열04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		System.out.print("학생수 입력 : ");
		int human = Integer.parseInt(br.readLine()); // 사람수 구하기
		String[] name = new String[human];

		
		String[][] subject = new String[human][];

		// 점수와 총점 처리 배열서언
		int[][] score = new int[human][subject.length];
		float[] avg = new float[human];
		char[] grade = new char[human];
		int[] rank = new int[human];
		
		for (int i = 0; i < human; i++) {// 사람수 만큼 반복
			System.out.print((i + 1) + " 번째 학생 이름 : ");
			name[i] = br.readLine();
			
			System.out.println("과목수 입력 : ");
			int imsi = Integer.parseInt(br.readLine());
			subject[i] = new String[imsi];
			
			for(int j = 0; j < subject[i].length; j++) {
				System.out.println((j+1)+" 번째 응시 과목 : ");
				subject[i][j] = br.readLine();
			}
			score[i] = new int[imsi+1];
			System.out.println(name[i] + " 학생 점수 입력  ");

			for (int j = 0; j < subject[i].length; j++) {
				System.out.print(subject[i][j] + " 점수 : ");
				score[i][j] = Integer.parseInt(br.readLine());
			}

		}
	}
}