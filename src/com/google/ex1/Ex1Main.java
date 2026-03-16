package com.google.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Marine m1 = new Marine();
		m1.hp = 50;
		m1.defence = 20;
		m1.damage = 5;
		m1.range = 4;

		System.out.println(m1.hp);

		System.out.println("1. 공격 2. 이동");
		int input = sc.nextInt();

		if (input == 1) {
			m1.attack();
		} else if (input == 2) {
			m1.attack();
		}
	}

}
