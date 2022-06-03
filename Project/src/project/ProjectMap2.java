package project;

import java.util.Scanner;

public class ProjectMap2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;	// 몬스터
		int c = 0, d = 0;	// 사람
		String ch;			// 사람 이동 받아주는 변수
		String[][] aa = new String[10][20];	// 맵크기 

		c = (int) (Math.random() * 7 + 1);		// 초기 사람의 위치값
		d = (int) (Math.random() * 17 + 1);
		
		for (int e = 0; e < 100; e++) {
			a = (int) (Math.random() * 7 + 1);	// 초기 몬스터 위치값 && 반복문이 실행 될때마다 움직이는 랜덤함수
			b = (int) (Math.random() * 17 + 1);
			
		
		for (int i = 0; i < aa.length; i++) {
			for (int j = 0; j < aa[i].length; j++) {
				if (i == 0 || i == 9) {
					aa[i][j] = "#";
				} else {
					if (j == 0 || j == 19) {
						aa[i][j] = "#";
					}

					else {
						aa[i][j] = " ";

					}
				}
				

				aa[3][15] = "G";		// 고정된 골드의 값
				aa[a][b] = "M";			// 랜덤함수로부터 받아와서 랜덤한 위치의 몬스터 값
				aa[c][d] = "@";			// 반복문 시작이전의 랜덤함수로부터 받아오는 사람의 랜덤 위치값
				System.out.print(aa[i][j]);

			}
			
			
			
			System.out.println();

		}
		System.out.println("위쪽 : (W), 아래쪽 : (S), 왼쪽 : (A) 오른쪽 : (D)");
		ch = sc.next();
		
//		switch (ch) {
//		case "W": ;
//			
//			break;
//
//		default:
//			break;
//		}
		}

	}
}
