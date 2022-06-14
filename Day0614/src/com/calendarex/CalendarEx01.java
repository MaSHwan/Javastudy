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
		case 1: week = "�Ͽ���";
			
			break;
		case 2: week = "������";
		
		break;
		case 3: week = "ȭ����";
		
		break;
		case 4: week = "������";
		
		break;
		case 5: week = "�����";
		
		break;
		case 6: week = "�ݿ���";
		
		break;
		case 7: week = "�����";
		
		break;

		
		default:
			break;
		}
		System.out.println(y + "-" + m + "-" + d + " " + week);
		
		// ���� ��¥�� 1000�� ���ϸ�?
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
