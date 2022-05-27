package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 배열02 {
	public static void main(String[] ar) throws IOException {
		/*
		 * for (int i = 0; i < ar.length; i++) { System.out.println(ar[i]); }
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/*
		 * if(ar.length == 0) { System.out.println("과목 수가 없습니다. "); System.exit(0); }//
		 * ar.length : 과목 수
		 */
		// 이름 입력 받기
		String name = br.readLine();
		// String[] subject = new String[ar.length];
		String[] subject = { "국어", "영어", "수학" };
		/*
		 * for(int i = 0; i < subject.length; i++) { //subject[i] = ar[i];
		 * System.out.print(subject[i]+" "); }
		 */
		int score[] = new int[subject.length + 1];// 총점을 저장하기 위한 공간

		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + " 점수 : ");
			score[i] = Integer.parseInt(br.readLine());// 점수 입력받음

			score[score.length - 1] += score[i];
			System.out.println("총점 : " + score[score.length - 1]);
		}
		float avg = score[score.length - 1] / (float) subject.length;
		// 소수점3자리에서 반올림 반영
		avg = (int) ((avg + 0.005) * 100) / 100.f;

		// int가 필요한 곳을 찾아라

		char grade = 0;
		switch ((int) (avg / 10)) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;

		default:
			grade = 'F';
			break;
		}
		
		System.out.println("----------------------------------------------------");
		System.out.println("----------------"+ name + "님의 성적표--------------------");
		System.out.println("----------------------------------------------------");

	}
}
