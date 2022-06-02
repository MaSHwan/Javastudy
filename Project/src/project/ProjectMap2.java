package project;

import java.util.Scanner;

public class ProjectMap2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;
		int c = 0, d = 0;
		String ch;
		String[][] aa = new String[10][20];

		for (int e = 0; e < 100; e++) {
		
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
				

				aa[3][15] = "G";
				aa[a][b] = "M";
				aa[c][d] = "@";
				System.out.print(aa[i][j]);

			}a = (int) (Math.random() * 7 + 1);
			b = (int) (Math.random() * 17 + 1);
			c = (int) (Math.random() * 7 + 1);
			d = (int) (Math.random() * 17 + 1);
			
			
			System.out.println();

		}
		System.out.println("위쪽 : (W), 아래쪽 : (S), 왼쪽 : (A) 오른쪽 : (D)");
		ch = sc.next();
		
//		switch (ch) {
//		case "W": aa[i][j] = aa[i-1][j];
//			
//			break;
//
//		default:
//			break;
//		}
		}

	}
}
