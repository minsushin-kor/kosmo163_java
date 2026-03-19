package com.google.exception;

public class ExceptionMain1 {

	public static void main(String[] args) throws ArithmeticException {
		// exception : 프로그램을 실행했을 때(컴파일 중) 발생하는 오류를 뜻함
		// 10 / 0 의 경우 나눌 수 없기 때문에 오류발생
		/*
		 * int a = 10; int b = 0; int c = a/b;
		 * 
		 * System.out.println(c);
		 */
		
		// 예외 처리 방법 및 목적 - 비 정상적인 종료를 막고 정상적으로 프로그램이 실행 될 수 있도록 개발자가 관리 
		// 1. 예외가 발생할 만한 코드를 try에 넣어본다.
		// > 문제가 있다면 catch에서 받아 확인
		
		int a = 10;
		int b = 0;
		
		try {
			int c = a/b;
			String str = null;
			
			
			str.charAt(0);
			System.out.println(args [0]);
		}
		catch(ArithmeticException e) {
			// strack 영역에 있는 내용을 추적해 print 하여 확인
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		//다음 오류를 모를경우 부모 타입을 선언해 주면된다. 
		catch (RuntimeException e) {
			e.printStackTrace();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		catch (Throwable e) {
			e.printStackTrace();
		}
		// 예외가 발생하거나 발생하지 않더라도 finally 코드는 실행
		finally {
			
		}
		System.out.println("종료합니다");
		
		ExceptionEx e1 = new ExceptionEx();
		e1.ex();
	}

}
