package com.google.star.zerg;

public class Drone {
	public int hp;
	protected int damage;
	private String color;
	String name;
	
	
	public void work() {
		System.out.println("드론이 일합니다.");
		
	}
	
	public void info() {
		System.out.println("드론의 이름: " + this.name);
		System.out.println("드론의 체력: " + this.hp);
		System.out.println("드론의 공격력: " + this.damage);
		System.out.println("드론의 색깔: " + this.color);		
	}
}
