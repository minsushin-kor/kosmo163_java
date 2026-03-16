package com.google.lang.ex1;

public class StirngEx1Main {

	public static void main(String[] args) {
		String str = "Hello World";
		int leng = str.length();
		
		System.out.println(leng);
		
		for(int i = 0; i<str.length(); i++) {
			char c = str.charAt(i);
			System.out.println(c);
		}
		
		
		String s = String.valueOf(false);
		System.out.println(s);

	}

}
