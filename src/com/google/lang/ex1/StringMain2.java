package com.google.lang.ex1;

public class StringMain2 {
	public static void main(String[] args) {
		String str = "Hello World";
		char ch = str.charAt(0);

		int idx = str.lastIndexOf("l");
		System.out.println(idx);

		// 문자열에서 "L"이 몇개 있는지 검색
		int count = 0;
		boolean flag = true;
		int index = -1;
		
		while(flag) {
			index = str.indexOf("l", index+1);
			if(index != -1) {
				count++;
			}
			else
			{
				flag = false;
			}
		}
		
		System.out.println(count);
	}
}
