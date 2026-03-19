package com.google.util;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain1 {
	public static void main(String[] args) {
		// 현재 날짜와 시간 정보가 들어감
		Calendar calendar = Calendar.getInstance();
		Calendar out = Calendar.getInstance();
		
		System.out.println(calendar);
		
		calendar.set(Calendar.YEAR, 2030);
		// 월을 변경할 때 컴퓨터가 인지하게 하려면 -1을 해야한다.(4월을 설정하기 위해 3을 대입)
		calendar.set(Calendar.MONTH, 3);
		
		// 들어간 시간
		long in = calendar.getTimeInMillis();
		// 나온 시간
		out.set(Calendar.HOUR, 11);
		long ou = out.getTimeInMillis();
		
		long result = ou - in;
		
		Date date = calendar.getTime();
		
		System.out.println(date);
		
		int h = calendar.get(Calendar.HOUR_OF_DAY);
		int s = calendar.get(Calendar.SECOND);
		int y = calendar.get(Calendar.YEAR);
		int m = calendar.get(Calendar.MONTH);
		
		System.out.println(h);
		System.out.println(s);
		System.out.println(y);
		System.out.println(m);
		
		System.out.println(result);
		result = result / 1000;
		System.out.println(result);
		result = result / 60;
		System.out.println(result);
		result = result / 60;
	}
}
