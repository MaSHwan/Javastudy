package com.calendarex;

import java.util.*;

public class CalendarEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();

		int y, m, i;
		System.out.printf("년도 : ");
		y = sc.nextInt();

		do {
			System.out.printf("월 : ");
			m = sc.nextInt();
		} while (m < 1 || m > 12);

		cal.set(y, m - 1, 1);
		int w = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("\t\t\t" + y + "년 " + m + "월");

		System.out.println("   일      월      화       수       목      금      토");
		System.out.println("   ==================================================");
		for (i = 1; i < w; i++) {
			System.out.print("\t");
		}
		for (i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
			System.out.printf("%4d\t", i);
			w++;
			if (w % 7 == 1) {
				System.out.println();
			}
		}
		
		if (w % 7 != 1) {
			System.out.println();
		}

	}
}
