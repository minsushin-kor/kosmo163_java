package com.google.car;

public class CarMain {

	public static void main(String[] args) {
		Car c1 = new Car();
				
		c1.info();	
		
		Car c2 = new Car("그랜저");
		c2.info();
		
		Car c3 = new Car("아반떼", 2021, "흰색", 20000000, true);
		c3.info();
	}

}
