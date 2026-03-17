package com.google.lang;

public class WrapperMain1 {

	public static void main(String[] args) {
		String n = "123";
		
		Integer integer = new Integer(n); //글자 중앙에 줄이 그어지며 이를 Deprecated라고 부른다.
		// 현재 버전에서는 사용할 수 있으나 상위(다음) 버전에서 지워질 예정이라 사용이 어려울 수 있어 사용을 지양함.

		integer = Integer.valueOf(n); // integer 타입으로 변경
		System.out.println(integer+1);
		
		Long l = Long.valueOf(n);
		
		// auto-boxing, auto-unboxing 개념
		// 아래 코드처럼 integer는 참조 타입, num은 primitive타입이나 자동으로 형변환이 되는 현상
		
		int num = 3;
		integer = num;
		
		num = integer;
		
		long number = 3L;
		integer = (int)number;	// number는 long 변수이기 때문에 int 타입으로 변환시켜 사용 가능
		
		// valueOf 는 문자열을 숫자로 바꿔준다.
		// 파싱 작업을 통해서도 가능
		// 파싱 : 가공되지 않은 데이터(Raw Data)를 의미 있는 단위로 나누고, 분석하여 원하는 형태의 데이터로 변환하는 과정 
		
		num = Integer.parseInt("123");
		
		
	}

}
