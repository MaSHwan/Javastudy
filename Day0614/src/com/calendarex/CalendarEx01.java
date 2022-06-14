package com.calendarex;
import java.util.Calendar;

public class CalendarEx01 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		String str1 = String.format("%1$tF %1$tA %1$tT", now);
		System.out.println(str1);
		
		int y = now.get(Calendar.YEAR);
		int m = now.get(Calendar.MONTH);
		int d = now.get(Calendar.DATE);
		int w = now.get(Calendar.DAY_OF_WEEK);
	
		String week = " ";
		switch (w) {
		case 1: week = "일요일";
			
			break;
		case 2: week = "월요일";
		
		break;
		case 3: week = "화요일";
		
		break;
		case 4: week = "수요일";
		
		break;
		case 5: week = "목요일";
		
		break;
		case 6: week = "금요일";
		
		break;
		case 7: week = "토요일";
		
		break;

		
		default:
			break;
		}
		System.out.println(y + "-" + m + "-" + d + " " + week);
		
		// 현재 날짜에 1000을 더하면?
		now.add(Calendar.DATE, 1000);
		System.out.printf("%tF%n", now);
		
		// 2023.6.15
		now.set(2023, 6-1, 15);
		System.out.printf("%tF%n", now);
		
		now.set(Calendar.DATE, 20);
		System.out.printf("%tF%n", now);
		
		// 2022.6.32
		now.set(2022, 6-1,32);
		System.out.printf("%tF%n", now);
		
		int dd = now.getActualMaximum(Calendar.DATE);
		System.out.println(dd);
	}
}
