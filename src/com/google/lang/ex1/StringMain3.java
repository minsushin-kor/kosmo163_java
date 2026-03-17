package com.google.lang.ex1;

public class StringMain3 {

	public static void main(String[] args) {
		String n1 = "abc";
		String n2 = "abc";
		String n3 = new String(" abc ");
		String n4 = new String("abc");
		
		System.out.println(n1);	// n1은 참조변수이나 n1.toString() 메서드를 호출하는 것과 동일
		System.out.println(n3);
		
		System.out.println(n1 == n2); // n1과 n2의 주소가 같은지를 물어보는 내용
		System.out.println(n3 == n4); // n3과 n4의 주소가 같은지를 물어보는 내용
		System.out.println(n1 == n3); // n1과 n3의 주소가 같은지를 물어보는 내용
		
		System.out.println(n1.equals(n4));	// 문자열이 같은지를 물어보기 위해 equals를 사용
		
		// 문자열은 불변성 (데이터들은 따로 사라지지 않는다.)
		
		// n3 = n3 + " : " + n4 + "1" + "2" + "3";
		
		n3.trim();
		System.out.println(n3);
		
		// 문자열을 추가할 때는 StringBuffer 클래스를 사용
		StringBuffer sb = new StringBuffer();
		
		sb.append("1");
		System.out.println(sb);
		
		sb.append(2);
		System.out.println(sb);
		
	}

}
