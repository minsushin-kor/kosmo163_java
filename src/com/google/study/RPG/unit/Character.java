package com.google.study.RPG.unit;

//추상 클래스 : 객체를 생성할 수 없는 클래스, 상속을 목적으로 만들어진 클래스
public abstract class Character {
	String name; // > get, set 메서드로 접근할 수 있도록 private으로 선언할 수 있다.
	int hp;
	int mp;
	int damage;
	int level;

	//추상 메서드 : 메서드의 선언부만 있고 구현부가 없는 메서드, 하위 클래스에서 반드시 오버라이딩하여 구현해야 하는 메서드
	public abstract void attack();
	
	
	public void info() {
		System.out.println("캐릭터 이름: " + name);
		System.out.println("체력: " + hp);
		System.out.println("마나: " + mp);
		System.out.println("공격력: " + damage);
	}
}
