package com.google.util;

import java.util.StringTokenizer;

public abstract class TokenMain1 {

	public void t2() {
		String str = "winter-20-iu-30-홍길동-520";

		StringTokenizer st = new StringTokenizer(str, ",");

		while(st.hasMoreTokens()) {
			
			String name = st.nextToken();
			String age = st.nextToken();
		}
			
	}
	
	public static void main(String[] args) {
		String str = "winter-20-iu-30-홍길동-520";
		StringTokenizer st = new StringTokenizer(str, ",");
		
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			System.out.println(s);
		}
	}

}
