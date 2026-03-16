package com.google.study.RPG.unit;

import com.google.study.RPG.weapon.Staff;

public class Wizard extends Character {
	
	/*String name;
	int damage;
	int hp, mp;
	Staff staff;
	int gold = 0;
	
	// main 메서드를 생각하며 캐릭터가 뭐를 해야할지 고민해보고 메서드 생성
	// 문법 : 접근지정자 [그외지정자] 리턴타입 메서드명([매개변수들 선언 가능]){} > 대괄호들은 필수 입력은 아니며 생략이 가능
	
	public Wizard() {
		this.name = "초보 마법사";
		this.staff = new Staff();
	}
	
	public void attack(Monster m) {
		System.out.println("파이어볼");

		// 어떤 몬스터의 hp를 깍으려고 하는가?
		m.hp = m.hp-(this.damage + staff.damage);
		
	}
	
	public void info() {
		// 동일한 클래스 안에 변수를 사용할때 this를 사용할 수 있으며, this는 생략이 가능하다.
		// this는 자신의 객체 주소를 갖고 있다. >> 즉, 참조변수
		
		System.out.println(this);
		System.out.println("이름 : " + this.name); 
		System.out.println("공격력 : " + this.damage);
		System.out.println("체력 : " + hp);*/
	
	Staff staff;
	
	public Wizard() {
		super(); // 생성자라인에 가장 첫번째에 와야하기 때문에 this랑 함께 사용이 어렵다.
	}
		public void a() {
			
	}
		
	// 오버 라이딩 : 부모로부터 상속받은 메서드의 내용을 재정의 하는 것
	// 메서드의 선언부는 부모와 동일해야함
	// 단, 접근 지정자는 같거나 더 넓은 범위로 설정 가능
	public void attack() {
		System.out.println("파이어볼");
	}
	
	public void info() {
		super.info(); // 부모의 info 메서드 호출
		System.out.println(staff);
	}
}
