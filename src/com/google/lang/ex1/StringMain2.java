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
		
		String st = "한화, 기아, 삼성, 롯데, 키움, ssg, 두산, lg, nc, kt";
		// split 메서드를 사용해 구단을 분리하기
		
		String [] teams = st.split(",");
		
		for(int i = 0;i<teams.length;i++) {
			System.out.println(teams[i]);
		}
		
		System.out.println(teams[1].trim().equals("기아"));	// trim : 공백제거
	}
}
