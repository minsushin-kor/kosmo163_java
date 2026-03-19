package com.google.util;

import java.util.Calendar;

public class CalendarMain2 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		
		// 시간이 초과했을 때 add의 경우 시간도 더해주지만, roll은 시간 변동이 없다 
		calendar.add(Calendar.MINUTE, 60);
		System.out.println(calendar.getTime());
		calendar.roll(calendar.MINUTE, 60);
		System.out.println(calendar.getTime());
		
	}
}
