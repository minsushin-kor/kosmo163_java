package com.google.biman;

public class MemberMain {

	public static void main(String[] args) {
		Member m1 = new Member();

		m1.setName("홍길동");
		// m1.name = "홍길동"; 오류가 생기는 이유는 name 변수가 private으로 선언되어 있기 때문이다.
		// private으로 선언된 변수는 해당 클래스 내부에서만 접근이 가능하다.
		// 따라서, MemberMain 클래스에서 m1.name에 접근하려고 하면 접근 권한이 없어서 오류가 발생한다.
		// 해결 방법은 Member 클래스에서 name 변수를 public으로 선언하거나, name 변수에 접근할 수 있는 public 메서드를 만들어서 사용하는 것이다.

	}

}
