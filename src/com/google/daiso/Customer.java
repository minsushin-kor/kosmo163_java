package com.google.daiso;

public class Customer {
	int don;
	int point;
		
	public void buy(Electronics electronics) {
		// 자기가 가진 돈에서 제품의 가격을 빼고, 자기가 가진 포인트에서 제품의 포인트를 더한다. 
		
		this.don = this.don - electronics.price;
		this.point = this.point + electronics.point;
		
		// 구매 후 남은 잔액과 포인트를 출력한다.
		System.out.println("재품" + electronics.name + "를 구매했습니다.");
		System.out.println("잔액 : " + this.don);
		System.out.println("잔여 포인트 : " + this.point);
	}
	
	// 위 예시는 제품을 하나만 구매하는 경우였다면, 아래에는 여러 제품을 구매하는 경우를 생각해보자.
	
	public void buy(Electronics [] electronics) {		
		
		for(int i = 0;i<electronics.length;i++)
		{
			this.don = this.don - electronics[i].price;
			this.point = this.point + electronics[i].point;
		}
		
		System.out.println("다수의 제품을 한번에 구매했습니다.");
		System.out.println("잔액 : " + this.don);
		System.out.println("잔여 포인트 : " + this.point);
	}
}
