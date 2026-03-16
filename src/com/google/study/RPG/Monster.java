package com.google.study.RPG;

import com.google.study.RPG.weapon.Staff;

public class Monster {
	// 몬스터, 체력, 공격력, 방어력 
	
	String name;
	int hp;
	int damage;
	int defense;
	Staff staff;
	int gold = 20;
	
	public Monster() {
		System.out.println("몬스터가 생성되었습니다.");
		this.name = "슬라임";
	}
	
	// public void << void에 오는 타입은 되돌려주는 타입에 맞게 사용하면 된다. 
	// 즉 아래 예시에서는 check를 통해 몬스터가 죽었는지 확인하고 gold를 드랍시키기 위함이기 때문에 int 를 사용한다. 
	public int check() {
		//hp가 0이하인지 체크하려는 메서드
		
		if(this.hp <= 0)
		{
			System.out.println("몬스터가 죽었습니다.");
			return gold;
		}
		
		return 0;
	}
	
//	public void t() { 
//		//-------
//		return; // 해당 메서드는 리턴 타입이 void라 return을 사용하기 어려우나 왼쪽처럼 "return;" 구문을 사용해 강제로 메서드를 종료시킬 수 있다.
//	}
}
