package com.google.lang;

import java.util.Scanner;

public class StringMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "winter";
		char chr = name.charAt(0); // 문자열에서 내가 원하는 위치의 글자를 가져오고 싶을 때 사용.
		
		System.out.println(chr);
		
		Object obj = new Object();
		String s1 = obj.toString();
		String s2 = name.toString();
		
		System.out.println(obj); // obj의 주소값을 출력
		System.out.println(s1);	// obj의 주소값을 출력
		System.out.println(s2);	// 실제 값을 출력할 수 있도록 오버라이딩 됨.
		
		String s3 = sc.toString();
		System.out.println(s3);
		
		Object obj2 = new Object();
		boolean c = obj.equals(obj2); // obj(주소임)와 obj2(주소임)는 서로 다른 객체이므로 false가 출력됨.
		System.out.println(c);
		
		String name2 = "winter";
		c= name.equals(name2);
		System.out.println(c);
	}

}
