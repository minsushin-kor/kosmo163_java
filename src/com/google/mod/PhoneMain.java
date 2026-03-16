package com.google.mod;

public class PhoneMain {

	public static void main(String[] args) {
		
		// static 멤버는 객체를 생성하지 않고도 클래스 이름으로 접근할 수 있다. 따라서 Phone.company로 접근한다. static 멤버는 객체를 생성하지 않고도 클래스 이름으로 접근할 수 있다. 
		// 따라서 Phone.company로 접근하여 "삼성"이라는 값을 할당한다.
		// static method도 동일하게 사용이 가능하다.
		
		Phone.company = "삼성"; // static 멤버는 클래스 이름으로 접근한다.
		Phone.info();
		
		
		// p1.price = 1000000; 
		// 오류가 발생하는 이유는 price는 static 멤버가 아니기 때문이다. static 멤버는 클래스 이름으로 접근해야 하지만 price는 인스턴스 멤버이므로 객체를 생성하여 접근해야 한다. 따라서 p1.price로 접근하여 1000000이라는 값을 할당한다.
		
		Phone p2 = new Phone();
		p2.company = "애플";

	}

}
