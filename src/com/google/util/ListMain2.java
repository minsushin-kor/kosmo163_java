package com.google.util;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		// list에 데이터를 입력할때에는 Object 타입으로 담는다
		ArrayList<Object> list = new ArrayList();
		
		list.add(1);
		list.add("two");
		list.add(true);
		
		list.get(0);
		
		// 담겨있는 데이터는 Object 타입. 즉, 모든 Object 타입이 String 타입이 아니기에 형변환이 필요하다.
		String n = (String)list.get(1);
		
		// generic : ArrayList에 원하는 타입의 데이터를 담기 위해 선언하는 과정
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		list1.add(1);
		list1.add(3);
		list1.add(10);
		
		int n1 = list1.get(0);
		
		ArrayList<Number> list2 = new ArrayList<>();
		
		list2.add(1);
		list2.add(3.12);
		list2.add(10L);
		
		list2.get(0);
	}

}
