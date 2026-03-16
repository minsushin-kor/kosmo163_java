package com.google.study.RPG.unit;

import com.google.study.RPG.Monster;
import com.google.study.RPG.weapon.Sword;
import com.google.study.RPG.weapon.Weapon;

// 
public class Warrior extends Character {
	/*
	 * // 전사, 체력, 공격력, 방어력 String name; int hp; int damage; int defense; int gold =
	 * 0;
	 * 
	 * public void attack(Monster [] monsters) {
	 * 
	 * for (int i = 0; i < monsters.length; i++) { System.out.println("검으로 공격");
	 * 
	 * monsters[i].hp = monsters[i].hp - (this.damage - monsters[i].defense); }
	 * 
	 * 
	 * }
	 * 
	 * // 일대일로 공격하는 메서드 public void attack(Monster m) {
	 * System.out.println("검으로 공격");
	 * 
	 * m.hp = m.hp - (this.damage - m.defense); }
	 */
	Weapon weapon;
	
	@Override
	public void attack() {
		System.out.println("검으로 공격");
		
	}
}
