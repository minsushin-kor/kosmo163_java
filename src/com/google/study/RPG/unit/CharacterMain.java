package com.google.study.RPG.unit;

import com.google.study.RPG.weapon.Action;
import com.google.study.RPG.weapon.Sword;
import com.google.study.RPG.weapon.Weapon;
import com.google.study.RPG.weapon.Staff;

public class CharacterMain {

	public static void main(String[] args) {

		Wizard w1 = new Wizard();
		w1.name = "마법사";
		
		Warrior w2 = new Warrior();
		
		// 다형성 
		Character c1 = w2;
				
		System.out.println(c1.name);
		
		// 다운 캐스팅 : 부모 타입을 자식 타입으로 변환하는 것, 다형성으로 인해 부모 타입으로 참조된 객체를 자식 타입으로 변환할 때 사용한다. 다운 캐스팅을 할 때는 반드시 instanceof 연산자로 해당 객체가 원하는 타입인지 확인해야 한다. 다운 캐스팅을 할 때는 반드시 instanceof 연산자로 해당 객체가 원하는 타입인지 확인해야 한다. 
		// 다운 캐스팅을 할 때는 반드시 instanceof 연산자로 해당 객체가 원하는 타입인지 확인해야 한다.
		Warrior w3 = (Warrior)c1; 
		w3.weapon = new Sword();
		w3.weapon = new Staff();
		Action a = new Sword();
		
		weapon.name = "검";
		
	}

}
