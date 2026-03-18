package com.google.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapMain1 {

	public static void main(String[] args) {
		// K : key로 사용할 데이터 타입 / V : value로 담고 싶은 데이터 타입
		HashMap<String, Integer> map = new HashMap<>();
		map.put("a1", 5);
		map.put("a2", 7);
		
		System.out.println(map.get("a2"));
		System.out.println(map.size());
		
		// 반복문으로 사용하는 방법
		// 1. key 에 어떤 값들이 있는지 알아야함.
		
		Set<String> set = map.keySet();
		
		// 2. 값을 하나씩 꺼내오는 과정
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()){
			String k = it.next();
			System.out.println("Key : " + k);
			System.out.println(map.get(k));
		}
	}

}
