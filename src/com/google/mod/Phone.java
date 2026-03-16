package com.google.mod;

public class Phone {
	public static String company;
	final String name = "";
	// final 멤버변수는 초기화 이후에 값을 변경할 수 없는 변수이다. name은 final 멤버변수로 선언되어 있기 때문에 초기화 이후에 값을 변경할 수 없다. 따라서 name은 빈 문자열로 초기화되어 있으며, 이후에 다른 값을 할당할 수 없다.
	int price;
	
	static{
		Phone.company = "삼성";
	}
	
	public void call() {
		System.out.println(Phone.company);
		System.out.println(this.name);
		// this가 사용 가능한 이유는 call() 메서드는 인스턴스 메서드이기 때문이다. 인스턴스 메서드는 객체가 생성된 후에 호출되므로 this를 사용할 수 있다. this는 현재 객체를 가리키는 참조변수로, call() 메서드가 호출될 때 해당 객체를 참조할 수 있다.
		Phone.info();
		
		
		
	}
	
	public static void info() {
		System.out.println(Phone.company);
		// static method에서는 this를 사용할 수 없다. this는 현재 객체를 가리키는 참조변수이지만 static method는 객체가 생성되지 않아 this를 사용할 수 없다. 따라서 오류가 발생한다.
		// System.out.println(this.name);
	}
}
