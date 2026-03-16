package com.google.study.RPG.weapon;

public class Weapon implements Action {
	String name;
	int damage;
	int level; // 사용 제한 레벨

	public void info() {
		System.out.println("무기 이름: " + name);
		System.out.println("공격력: " + damage);
		System.out.println("내구도: " + level);
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
}
