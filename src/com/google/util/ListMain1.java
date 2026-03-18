package com.google.util;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ListMain1 {

	public static void main(String[] args) {
		int [] ar = new int [2];
		
		//ArrayList 객체 생성
		ArrayList list = new ArrayList(); // <<<데이터를 모으기 위해 객체 생성
		//List list = new ArrayList(); // 객체 생성 시 왼쪽처럼도 생성 가능
		
		list.add(1); // 길이의 갯수에 제한이 없어 데이터의 입력 및 삭제가 자유로움
		list.add(2);
		list.add(3);
		list.add(3); // 같은 데이터를 중복을 넣는 것도 가능하다.
		
		list.add(1,0); // 원하는 곳에 데이터를 입출력하는 것 또한 자유롭다.(삽입)
		
		list.set(0,100); // 기존에 있는 값을 수정하기 위해선 set을 사용
		
		// 배열과 마찬가지로 주소는 0부터 시작
		// remove를 하면 칸을 포함하여 데이터 또한 삭제
		// list.remove(1);
		
		//.size 는 length와 비슷한 뜻
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		// 객체는 지워지지 않았지만, 가지고 있는 데이터는 모두 지워짐
		list.clear();
		System.out.println(list.size());
		
	}

}
