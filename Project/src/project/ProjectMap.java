package project;

import java.util.Scanner;

public class ProjectMap {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;
		String[][] aa = new String[10][20];

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
				}aa[3][15]= "G";
				System.out.print(aa[i][j]);
				
					
			}
			System.out.println();
		}System.out.println("위쪽 : (W), 아래쪽 : (S), 왼쪽 : (A) 오른쪽 : (D)");
		
	}
}
