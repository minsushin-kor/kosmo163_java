package com.google.util.ex2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetEx1 {

	public static void main(String[] args) {
		Random random = new Random();
		HashSet<Integer> setNum = new HashSet<Integer>();
				
		// 6개의 숫자를 뽑았다면 종료
		while(setNum.size() < 6) {
			int n = random.nextInt(45)+1;
			setNum.add(n);
			
		}
		
		// Iterator : 자바의 컬렉션 프레임워크(List, Set)등 저장된 요소들을 순차적으로 읽어오기 위해 사용하는 인터페이스		
		// Enumeration : 가장 초기버전의 반복자로 현재는 거의 사용되지 않는 legacy 인터페이스
		Iterator<Integer> it = setNum.iterator();
		
		// while 문 : 다음 데이터가 있는가?
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}

		
		System.out.println(setNum);
	}

}
