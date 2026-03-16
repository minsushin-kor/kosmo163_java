package com.google.car;

public class Car {
	// 자동차, 모델명, 연식, 색상, 가격
	String model;
	int year;
	String color;
	int price;
	boolean manual; // true: 수동, false: 자동
	
	// 기본 생성자를 선언하고 각 멤버변수의 값을 임의의 값으로 초기화
		
	
	// instance 초기화 블럭 : 객체가 생성될 때마다 실행되는 블럭, 생성자보다 먼저 실행된다. 멤버변수의 초기화에 사용한다.
	{
		model = "kia";
		year = 2021;
		color = "흰색";
		price = 30000000;
		manual = true;
	}
	public Car() {
		this("그랜저"); // this()는 다른 생성자를 호출하는 구문, 매개변수로 "그랜저"를 전달하여 Car(String model) 생성자를 호출한다.
	}
	
	// overloading: 동일한 이름의 메서드를 여러개 선언하는 것. 매개변수의 타입과 개수로 구분한다.
	public Car(String model) {
		 // this는 현재 객체를 가리키체는 참조변수, this.model은 현재 객의 model 멤버변수를 가리킨다. 매개변수로 받은 model을 현재 객체의 model 멤버변수에 대입한다.
		this.model = model;
		this.year = 2020;
		this.color = "검정색";
		this.price = 50000000;
		this.manual = false;
	}
	
	public Car(String model, int year, String color, int price, boolean manual) {
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
		this.manual = manual;
	}

	public void info() {
		int number = 10; // 지역변수, 메서드 안에서 선언된 변수, 메서드가 끝나면 사라진다.
		System.out.println("모델명: " + this.model);
		System.out.println("연식: " + this.year);
		System.out.println("색상: " + this.color);
		System.out.println("가격: " + this.price);
		System.out.println("수동 여부: " + this.manual);
	}
}
