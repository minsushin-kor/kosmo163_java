package com.google.daiso;

public class DaisoMain {

	public static void main(String[] args) {
		// 다이소에서 전자제품을 판다고 하자. 
		// 파는 상품 : 마우스, 키보드, TV, 스피커, 노트북
		// 마우스 정보 : 가격, 적립포인트, 이름, 제품번호
		// 키보드 정보 : 가격, 적립포인트, 이름, 제조사
		// TV 정보 : 가격, 적립포인트, 이름, 크기
		// 노트북 정보 : 가격, 적립포인트, 이름, CPU
		
		Mouse m1 = new Mouse();
		Keyboard k1 = new Keyboard();
		Tv t1 = new Tv();
		Notebook n1 = new Notebook();
		
		Customer customer = new Customer();
		customer.don = 10000000;
		customer.point = 100;
		
		Electronics[] elo = {m1, k1};
		customer.buy(elo);
		
	}

}
