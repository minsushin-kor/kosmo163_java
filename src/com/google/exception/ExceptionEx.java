package com.google.exception;

public class ExceptionEx {
	// 예외처리 2번째 방법
	public void ex() throws ArithmeticException, RuntimeException, Exception{
		int a = 10;
		int b = 10;
		int c = a/b;
		
	}
	
	public void ex2() throws Exception {
		String s1 = "";
		String s2 = "def";
		String s3 = s1 + s2;
		
		// 강제로 오류를 발생시키는 경우 
		if(s3.isEmpty()) {
			throw new Exception();
		}
		System.out.println(s3);
	}
}
