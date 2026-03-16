package com.google.study;

import java.util.Scanner;

public class SalaryMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		// 급여 계산 메서드를 호출해보기
		Salary sa1 = new Salary();
		
//		System.out.println("급여를 입력하세요.");
//		int s = sc.nextInt();
//		sa1.make(s, true);
//		System.out.println("세전 급여 : " + s);
		int s = 21;
		int [] nums= {1,2,3};
		
		sa1.test1(s);
		sa1.test2(nums);
		
		System.out.println(s);
		System.out.println(nums[0]);
	}

}
